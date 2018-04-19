public class BST_LCA {
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
	public BST_LCA() {
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
	public Node LCA(int data1, int data2) {
		return LCA_1(root,data1,data2);
	}
	public Node LCA_1(Node root, int data1, int data2) {
		if(root == null) {
			return root;
		}
		if( data1 < root.data && data2 < root.data) {
			return LCA_1(root.left,data1,data2);
		} 
		if( data1 > root.data && data2 > root.data) {
			return LCA_1(root.right,data1,data2);
		} 
		return root;
	}
		
		
	public static void main(String args[]) {
		BST_LCA temp = new BST_LCA();
		temp.insert(30);
		temp.insert(300);
		temp.insert(10);
		temp.insert(100);
		Node x = temp.LCA(10,30);
		System.out.println(x.data);
	}
}
			
