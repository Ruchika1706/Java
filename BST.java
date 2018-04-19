public class BST {
	class Node {
		int data;
		Node left;
		Node right;
		public Node(int item) {
			this.data = item;
			this.left = this.right = null;
		}
	}
	Node root;
	public BST() {
		root = null;
	}
	public void insert(int key) {
		root = insertKey(root,key);
	}
	public Node insertKey(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if (key< (root.data)) {
			root.left = insertKey(root.left,key);
		} else if (key>(root.data)) {
			root.right = insertKey(root.right,key);
		}
		return root;
	}
	public void inOrder(Node root) {
		if(root!=null) {
			this.inOrder(root.left);
			System.out.println(root.data);
			this.inOrder(root.right);
		}
	}
	public void inorder() {
		inOrder(root);
	}
	public static void main(String args[]) {
		BST temp = new BST();
		temp.insert(30);
		temp.insert(300);
		temp.insert(10);
		temp.insert(100);
		temp.inorder();
	}
}
			
