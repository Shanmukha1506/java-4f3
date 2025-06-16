import java.util.*;
public class Tree
{
	public static void main(String[] args) {
		Tree t=new Tree(new int[] {1,2,-1,-1,3,-1,-1});
		System.out.println();
		t.preOrder();
		Node root=t.getRoot();
		int heightofRoot=Tree.height(root);
		System.out.println(heightofRoot);

	}
}
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class Tree {
	Node root;
	int index=-1;
	Tree(int[]nodes) {
		this.root=buildTreeUsingArray(nodes);
		System.out.println(index);
	}
	public Node buildTreeUsingArray(int[]node) {
		index++;
		if(index>=node.length) {


			return null;
		}
		if(node[index]==-1) {
			return null;
		}
		Node newNode=new Node(node[index]);
		newNode.left=buildTreeUsingArray(node);
		newNode.right=buildTreeUsingArray(node);
		return newNode;

	}
	public  void preOrder() {
		Node temp=this.root;
		preOrderhelper(temp);
	}
	private void preOrderhelper(Node temp) {
		if(temp==null) {
			return;
		}
		System.out.println(temp.data);
		preOrderhelper(temp.left);
		preOrderhelper(temp.right);
	}
	public static int height(Node root) {
		if(root==null) {
			return 1;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		return Math.max(lh,rh)+1;
	}
	public Node getRoot(){
	    return this.root;
	}


}
