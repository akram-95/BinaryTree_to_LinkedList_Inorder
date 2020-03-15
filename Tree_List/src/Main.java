
public class Main {
	public static void main(String[] args) {
		workplace wp = new workplace();
		Node_List node = null;
		Node_Tree node_tree = null;
		for (int i = 0; i < 10; i++) {
			node = wp.add_Node_List(i, node);
			node_tree = wp.add_Node_Tree(i, node_tree);
		}
//		wp.print_List(node);
		for (int i = 0; i < 44; i = i + 4) {
			node_tree = wp.add_Node_Tree(i, node_tree);
		}
		wp.print_Tree_Inorder(node_tree);

		node = wp.tree_tolist_Inorder(node_tree, node);
//		wp.print_List(node);

	}

}
