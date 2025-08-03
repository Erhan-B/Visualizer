package node;

import java.util.ArrayList;

public class ListNodes {
	private ArrayList<Node> nodelist;

	public ListNodes() {
		nodelist = new ArrayList<>();
	}
	
	public void addNode(Node n) {
		nodelist.addLast(n);
	}
	
	public <T> void addNode(Node leftChild, Node rightChild, T value) {
		Node newNode = new Node(leftChild, rightChild, value);
		nodelist.addLast(newNode);
	}
}
