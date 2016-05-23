class Tree
  attr_accessor :value, :left, :right
  def initialize(value, left=nil, right=nil)
    @value = value
    @left = left
    @right = right
  end
  
  def each_node(&block)
  	block.call(@value)
  	@left.each_node(&block) if @left
  	@right.each_node(&block) if @right
  end
  
  def method_missing(m)
  	path = m.to_s().split("_")
  end
  def traverse_path(path)
  	return @value if path.length == 0

  	return @left.traverse_path(path[1..-1]) if path[0] == 'left'
  	
  	return @right.traverse_path(path[1..-1]) if path[0] == 'right'
 
  	throw "Invalid path"
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

