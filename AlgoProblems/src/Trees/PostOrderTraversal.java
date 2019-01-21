package Trees;

	public class PostOrderTraversal
	{
	    Node1 root;
	 
	    PostOrderTraversal()
	    {
	        root = null;
	    }
	 
	    void printPostorder(Node1 Node1)
	    {
	        if (Node1 == null)
	            return;
	 
	        printPostorder(Node1.left);
	        printPostorder(Node1.right);
	     System.out.print(Node1.data + " ");
	    }
	 
	    /* Given a binary tree, print its Node1s in inorder*/
	    void printInorder(Node1 Node1)
	    {
	        if (Node1 == null)
	            return;
	 
	        /* first recur on left child */
	        printInorder(Node1.left);
	 
	        /* then print the data of Node1 */
	        System.out.print(Node1.data + " ");
	 
	        /* now recur on right child */
	        printInorder(Node1.right);
	    }
	 
	    void printPreorder(Node1 pnode)
	    {
	        if (pnode == null)
	            return;
	 
	        /* first print data of Node1 */
	        System.out.print(pnode.data + " ");
	 
	        /* then recur on left sutree */
	        printPreorder(pnode.left);
	 
	        /* now recur on right subtree */
	        printPreorder(pnode.right);
	    }
	 
	    // Wrappers over above recursive functions
	    void printPostorder()  
	    {  
	    	printPostorder(root); 
	    	}
	    void printInorder()  
	    {   
	    	printInorder(root);   
	    	}
	    void printPreorder() 
	    {    
	    	printPreorder(root);
	    	}
	 
	    // Driver method
	    public static void main(String[] args)
	    {
	    	PostOrderTraversal tree = new PostOrderTraversal();
	        tree.root = new Node1(1);
	        tree.root.left = new Node1(2);
	        tree.root.right = new Node1(3);
	        tree.root.left.left = new Node1(4);
	        tree.root.left.right = new Node1(5);
	        tree.root.left.right.left = new Node1(7);
	        tree.root.left.right.right = new Node1(8);
	 
	        System.out.println("Preorder traversal of binary tree is ");
	        tree.printPreorder();
	 
	        System.out.println("\nInorder traversal of binary tree is ");
	        tree.printInorder();
	 
	        System.out.println("\nPostorder traversal of binary tree is ");
	        tree.printPostorder();
	    }
	}


	class Node1
	{
	    int data;
	    Node1 left, right;
	 
	    public Node1(int item)
	    {
	    	data = item;
	        left = right = null;
	    }
	}
