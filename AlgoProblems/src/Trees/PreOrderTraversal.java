package Trees;

import java.util.Stack;

public class PreOrderTraversal {

	static Node7 root;

	void printPreorderByRecursion(Node7 pnode) {
		if (pnode == null)
			return;
		System.out.print(pnode.data + " ");
		printPreorderByRecursion(pnode.left);
		printPreorderByRecursion(pnode.right);
	}

	static void printPreorderByStacks(Node7 pnode) {
		Stack<Node7> prest = new Stack<>();
		prest.push(root);
		while(!prest.empty())
		{
			Node7 no=prest.pop();
			System.out.println(no.data);
			
			if (no.right!=null) 
			{
				prest.push(no.right);
				
			}
			if (no.left!=null) 
			{
				prest.push(no.left);
				
			}

			
			
			
			
		}
		
		
		}

	

	public static void main(String[] args) {
		PreOrderTraversal tree = new PreOrderTraversal();
		tree.root = new Node7(1);
		tree.root.left = new Node7(2);
		tree.root.right = new Node7(3);
		tree.root.left.left = new Node7(4);
		tree.root.left.right = new Node7(5);
		tree.root.left.right.left = new Node7(7);
		tree.root.left.right.right = new Node7(8);

		System.out.println("Preorder traversal of binary tree is ");
		// tree.printPreorderByRecursion(root);
		printPreorderByStacks(root);

	}
}

class Node7 {
	int data;
	Node7 left, right;

	public Node7(int item) {
		data = item;
		left = right = null;
	}
}
