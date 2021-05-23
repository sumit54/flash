
class Node {
	//test
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

public class Exam1 {
	Node root;

	static int count;

	static void preOrder(Node node, int max)
	{

		if (node == null) {
			return;
		}

		if (node.data >= max) {
			count++;
			max = Math.max(node.data, max);
		}
	preOrder(node.left, max);
	preOrder(node.right, max);
	}

	public static void main(String[] args)
	{
		Exam1 tree = new Exam1();

		tree.root = new Node(8);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);

		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(7);

	    count = 0;
		preOrder(tree.root, Integer.MIN_VALUE);

		System.out.println(count);
	}
}
