
# Available opcodes for our VM
PUSH_OP = /PUSH (\S+)/ # pushes a number (its argument) on to the stack.
PRINT_OP = /PRINT/ # pops the top number off of the stack and prints it
ADD_OP = /ADD/ # pops the top two elements off the stack, adds them, and puts the result back on to the stack
SUB_OP = /SUB/ # pops the top two elements off the stack, subtracts them, and ...
MUL_OP = /MUL/ # pops the top two elements off the stack, multiplies them, and ...

STORE_OP = /STOR (\d+)/ # Get a variable value
LOAD_OP = /LOAD (\d+)/ # Get a variable value

JMP_OP = /JMP (\S+)/ # Standard jump (no pop)
JZ_OP = /JZ (\S+)/ # Standard jump (no pop)
JNZ_OP = /JNZ (\S+)/ # Standard jump (no pop)

LABEL = /(\S+):/ # Label for a jump

TRUE_SYMBOL = '#t'
TRUE_CONSOLE_OUTPUT = '1'
FALSE_SYMBOL = '#f'
FALSE_CONSOLE_OUTPUT = '0'



class String
  def is_i?
    !!(self =~ /\A[-+]?[0-9]+\z/)
  end
end


class VirtualMachine
  def initialize
    # Holds all variable values
    @stack = []
    @var_heap = {}
    @searching_for_label = ''
  end
  def exec(bytecode_file)


    File.open(bytecode_file, 'r') do |file|
      no_reloop = false
      until no_reloop do
        # Clumsy way to allow backward jumps
        no_reloop = true
        file.each_line do |ln|

          # Skip blank lines
          if ln.chomp().strip().length == 0
            next
          end

          # If searching for a label, then skip
          if @searching_for_label != ''
            tmp_ln = ln.chomp().strip()
            # Check if matches the label being searched for
            if tmp_ln == @searching_for_label + ':'
              # No longer searching for the label.
              @searching_for_label = ''
            end
            # Go to next in the loop
            next
          end

          # Match a command
          case ln
            #
            # YOUR CODE HERE -- Add extra 'when' cases to handle
            # additional operations.
            #
            when LABEL
              # NOOP

              # Check for always jump
            when JMP_OP
              @searching_for_label = ln.sub(JMP_OP, '\1').chomp().strip()
              no_reloop = false
              break

            when JZ_OP, JNZ_OP
              stack_val = @stack.pop
              if (ln =~ JZ_OP and stack_val == 0)
                @searching_for_label = ln.sub(JZ_OP, '\1').chomp()
                no_reloop = false
                break
              elsif ln =~ JNZ_OP and stack_val != 0
                @searching_for_label = ln.sub(JNZ_OP, '\1').chomp()
                no_reloop = false
                break
              end


            when ADD_OP, SUB_OP, MUL_OP
              a = @stack.pop
              b = @stack.pop
              ln = ln.chomp()
              if ln == 'ADD'
                @stack.push(a + b)
              elsif ln == 'SUB'
                @stack.push(b - a)
              elsif ln == 'MUL'
                @stack.push(a * b)
              end
            when PUSH_OP
              v = ln.sub(PUSH_OP, '\1').chomp().strip()
              if v.is_i?
                @stack.push(v.to_i)
              else
                @stack.push(v)
              end
            when PRINT_OP
              v = @stack.pop
              case v
                when TRUE_SYMBOL
                  print_val = TRUE_CONSOLE_OUTPUT
                when FALSE_SYMBOL
                  print_val = FALSE_CONSOLE_OUTPUT
                else
                  print_val = v
              end
              puts print_val
            # Handle the push variable
            when STORE_OP
              key = ln.sub(STORE_OP, '\1').chomp().strip()
              val = @stack.pop
              @var_heap[key] = val
            # Handle the push variable
            when LOAD_OP
              key = ln.sub(LOAD_OP, '\1').chomp().strip()
              @stack.push(@var_heap[key])
            else
              raise "Unrecognized command: '#{ln}'"
          end # Case
        end # line do
      end # do while
    end # File list
  end
end

if ARGV.length < 1
  puts 'Usage: ruby vm.rb <bytecode file>'
  exit 1
end

source = ARGV[0]

vm = VirtualMachine.new
vm.exec(source)


