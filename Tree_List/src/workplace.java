
public class workplace {
	public Node_List add_Node_List(int value, Node_List node) {
		if (node == null) {
			return new Node_List(value);
		}
		node.next = add_Node_List(value, node.getNext());
		return node;

	}

	public Node_Tree add_Node_Tree(int value, Node_Tree node) {
		if (node == null) {
			return new Node_Tree(value);
		}
		if (node.getValue() > value) {
			node.left = add_Node_Tree(value, node.getLeft());
		} else if (node.getValue() < value) {
			node.right = add_Node_Tree(value, node.getRight());
		}
		return node;
	}

	public void print_List(Node_List node) {
		if (node != null) {
			System.out.println(node.toString());
			print_List(node.getNext());
		}
	}

	public void print_Tree_Inorder(Node_Tree node) {
		if (node != null) {
			print_Tree_Inorder(node.getLeft());
			System.out.println(node.toString());
			print_Tree_Inorder(node.getRight());
		}
	}

	public Node_List tree_tolist_Inorder(Node_Tree tree, Node_List list) {
		if (tree == null) {
			return list;
		}
		if (list == null) {
			return new Node_List(tree.getValue());
		}
		Node_List current = list;
		while (current.getNext() != null) {
			current = current.next;
		}
		current.next = tree_tolist_Inorder(tree.getLeft(), current.getNext());
		current.next = new Node_List(tree.getValue());
		current.next = tree_tolist_Inorder(tree.getRight(), current.getNext());
		return list;

	}

}
