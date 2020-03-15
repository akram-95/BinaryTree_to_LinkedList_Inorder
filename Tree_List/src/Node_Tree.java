
public class Node_Tree {
	int value;
	Node_Tree left;
	Node_Tree right;

	public Node_Tree(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node_Tree getLeft() {
		return left;
	}

	public void setLeft(Node_Tree left) {
		this.left = left;
	}

	public Node_Tree getRight() {
		return right;
	}

	public void setRight(Node_Tree right) {
		this.right = right;
	}
	public String toString() {
		return "the Value of this Node is : " + this.getValue() + "\n";
	}

}
