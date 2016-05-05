NUM_PAT = /[1-9]\d*|0/
BOOL_PAT = /#\w+/
STR_PAT = /\w+/

# Available opcodes for our VM
PLUS = '+'
SUBTRACT = '-'
MULTIPLY = '*'

JUMP_OP = 'JMP'
JUMP_ZERO_OP = 'JZ'
JUMP_NONZERO_OP = 'JNZ'

IF = 'if'
ID_TRUE_LABEL = 'tru'
IF_FALSE_LABEL = 'fls'
IF_DONE_LABEL = 'done'

PRINT_OP = 'PRINT'
PUSH_OP = 'PUSH'
ADD_OP = 'ADD'
SUB_OP = 'SUB'
MUL_OP = 'MUL'

TRUE_CONST = '#t'
TRUE_VALUE = 1
FALSE_CONST = '#f'
FALSE_VALUE = 0

STORE_OP = 'STOR'
LOAD_OP = 'LOAD'

COMMENT_CHARACTER = ';'

class AST
  # Object accessors
  attr_accessor :op, :parent, :args

  # Update the class
  class << self
    attr_accessor :if_counter, :attr_accessor, :var_heap
    def init
      @if_counter = 0
      @attr_accessor = 0
      @var_heap = {}
    end
  end


  def initialize(op, parent)
    @op = op
    @parent = parent
    @args = []
  end
  def add_arg(x)
    @args.push(x)
  end
  def to_s
    s = '(' + @op
    @args.each do |arg|
      s += ' ' + arg.to_s
    end
    s + ')'
  end
  # recursively evaluates the AST, used for the interpreter
  def evaluate
    case @op
      when 'println'
        v = @args[0]
        v = v.evaluate if v.is_a?(AST)
        puts v
      when PLUS
        sum = 0
        @args.each do |x|
          x = x.evaluate if x.is_a?(AST)
          sum += x
        end
        return sum
      when SUBTRACT
        diff = @args[0]
        diff = diff.evaluate if diff.is_a?(AST)
        args_tail = @args.slice(1, args.length-1)
        args_tail.each do |x|
          x = x.evaluate if x.is_a?(AST)
          diff -= x
        end
        return diff
      when MULTIPLY
        prod = 1
        @args.each do |x|
          x = x.evaluate if x.is_a?(AST)
          prod *= x
      end
      return prod
    else
      raise "Unrecognized op '#{@op}'"
    end
  end
  # recursively compiles the AST to bytecode, used for the compiler
  def to_bytecode
    bytecode = []
    case @op

      when IF
        # If Predicate
        comp_arg(@args[0], bytecode)
        bytecode.push("#{JUMP_ZERO_OP} #{IF_FALSE_LABEL}#{self.class.if_counter}")

        # True Case
        bytecode.push("#{ID_TRUE_LABEL}#{self.class.if_counter}:")
        comp_arg(@args[1], bytecode)
        bytecode.push("#{JUMP_OP} #{IF_DONE_LABEL}#{self.class.if_counter}")

        # False Case
        bytecode.push("#{IF_FALSE_LABEL}#{self.class.if_counter}:")
        comp_arg(@args[2], bytecode)
        bytecode.push("#{IF_DONE_LABEL}#{self.class.if_counter}:")
        # Increment if counter.
        self.class.if_counter += 1
      when 'println'
        comp_arg(@args[0], bytecode)
        bytecode.push(PRINT_OP)
      when MULTIPLY, PLUS, SUBTRACT
        splits_command_and_add_op_to_ast(bytecode, @op)
      #
      # YOUR CODE HERE -- Add 'when' cases to support the other expressions.
      else
        raise "Unrecognized op '#{@op}'"
    end
    bytecode # Returning bytecode
  end
  private # Unlike Java, this means that *all* of the following functions in AST are private.
  def comp_arg(v, bytecode)
    if v.is_a?(Integer) then
      bytecode.push("#{PUSH_OP} #{v}")
    elsif v.to_s() == TRUE_CONST
      comp_arg(TRUE_VALUE, bytecode)
    elsif v.to_s() == FALSE_CONST
      comp_arg(FALSE_VALUE, bytecode)
    else
      bytecode.concat(v.to_bytecode)
    end
  end

  def splits_command_and_add_op_to_ast(bytecode, op)

    # Parse the op

    case op.chomp
      when MULTIPLY
        op_cmd = MUL_OP
      when PLUS
        op_cmd = ADD_OP
      when SUBTRACT
        op_cmd = SUB_OP
    end

    # Add the op to the AST
    (0..(args.length - 1)).each { |i|
      comp_arg(@args[i], bytecode)
      if i > 0
        bytecode.push(op_cmd)
      end
    }
  end
end

# Responsible for parsing the source code, either for the interpreter or the compiler
class Parser
  def parse(file)
    asts = []
    File.open(file, 'r') do |file|
      file.each_line do |ln|
        asts.push(parse_line(ln))
      end
    end
    asts # Returning the ASTs
  end
  private # Unlike Java, this means that *all* of the following functions in AST are private.
  # String -> tokens
  def tokenize_line(line)
    # Adding spaces around parens to make tokenization trivial.
    line = line.gsub(/\(/, ' ( ')
    line = line.gsub(/\)/, ' ) ')
    line.split
  end
  # [token] -> [AST]
  def parse_line(line)
    line = line.split(COMMENT_CHARACTER)[0]
    tokens = tokenize_line(line)
    ast = nil
    i = 0
    while (i <= tokens.length)
      case tokens[i]
        when '('
          ast = AST.new(tokens[i+1], ast) # Assuming that we will only receive valid programs
          i += 1 # Skipping an extra token
        when ')'
          if ast.parent then
            ast.parent.add_arg(ast)
            ast = ast.parent
          end
        when NUM_PAT
          if ast then
            ast.add_arg(tokens[i].to_i)
          else
            raise 'Top-level numbers are not permitted'
          end
        when BOOL_PAT
          ast.add_arg(tokens[i])
        when STR_PAT
          ast.add_arg(tokens[i])
        when /.+/ # If anything else matches (and is at least one char), raise an error
          raise "Unrecognized token: '#{tokens[i]}'"
      end
      i += 1
    end
    ast # Returning the abstract syntax tree
  end
end

# The interpreter, which walks the AST and evaluates as it goes.
# (Not used in this assignment, but available for reference).
class Interpreter
  def initialize
    @parser = Parser.new
  end
  def execute(file)
    asts = @parser.parse(file)
    asts.each do |ast|
      ast.evaluate if ast
    end
  end
end

# Compiles the source code into bytecode format
class Compiler
  def initialize
    @parser = Parser.new
  end
  def compile(scheme_file, bytecode_file)
    asts = @parser.parse(scheme_file)
    File.open(bytecode_file, 'w') do |out|
      asts.each do |ast|
        if ast then
          puts "Parsing #{ast}"
          bytecode = ast.to_bytecode
          out.puts bytecode
        end
      end
    end
  end
end


if ARGV.length < 2
  puts 'Usage: ruby compiler.rb <scheme file> <bytecode file>'
  exit 1
end

source = ARGV[0]
output = ARGV[1]

AST.init()
comp = Compiler.new
comp.compile(source, output)


