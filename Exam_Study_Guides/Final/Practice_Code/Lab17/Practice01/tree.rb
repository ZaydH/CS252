class Tree
  attr_accessor :value, :left, :right
  def initialize(value, left=nil, right=nil)
    @value = value
    @left = left
    @right = right
  end

  def each_node(&block)
    yield @value
    @left.each_node(&block) unless @left == nil
    @right.each_node(&block) unless @right == nil
  end

  def method_missing(m)
    node_path = m.to_s().split('_')
    return child_node_from_path(node_path)
  end
  def child_node_from_path(path)
    if path.length == 0
      return @value
    elsif path[0].downcase() == 'right'
      return @right.child_node_from_path(path[1..-1])
    elsif path[0].downcase() == 'left'
      rem_list = path.slice(1, path.length-1)
      return @left.child_node_from_path(rem_list)
    else
      throw('Invalid path')
    end
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

