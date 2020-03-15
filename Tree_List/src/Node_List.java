
public class Node_List {
	int value;
	Node_List next;

	public Node_List(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(Node_List next) {
		this.next = next;
	}

	public Node_List getNext() {
		return this.next;
	}

	public String toString() {
		return "the Value of this Node is : " + this.getValue() + "\n";
	}

}
