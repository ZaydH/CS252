class Tree
  attr_accessor :value, :left, :right
  def initialize(value, left=nil, right=nil)
    @value = value
    @left = left
    @right = right
  end

  # Create an each node method for the block.
  def each_node(&block)
    block.call(@value)
    @left.each_node(&block) if @left
    @right.each_node(&block) if @right
  end

  def method_missing(m)
    instruction = m.to_s.split('_', 2)
    if instruction[0] == 'left'
      elem = @left
    else
      elem = @right
    end

    # If left or right is selected, return that.
    next_command = instruction[1]
    return (elem.left.value) if next_command == 'left'
    return (elem.right.value) if next_command == 'right'
    elem.send(next_command)

  end
end

my_tree = Tree.new(42,
                   Tree.new(3,
                            Tree.new(1,
                                     Tree.new(7,
                                              Tree.new(22),
                                              Tree.new(123)),
                                     Tree.new(32))),
                   Tree.new(99,
                            Tree.new(81)))

my_tree.each_node do |v|
  puts v
end

arr = []
my_tree.each_node do |v|
  arr.push v
end
p arr

p "Getting nodes from tree"
p my_tree.left_left
p my_tree.right_left
p my_tree.left_left_right
p my_tree.left_left_left_right

