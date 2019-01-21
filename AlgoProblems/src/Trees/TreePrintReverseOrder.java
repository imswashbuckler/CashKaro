package Trees;

import java.util.Stack;

public class TreePrintReverseOrder {

    static Node5 root;
    
   /* public static void PrintInReverse(Node5 node)
    {

        if (node == null)
            return;
        
    		PrintInReverse(node.left);
    		PrintInReverse(node.right);
    		System.out.print(node.data);
    		//PrintInReverse(node.left);
    		//PrintInReverse(node.right);
    		
    		
    	}
*/    	
    
    public static void PrintInReverse()
    {
    	 if(root == null)
             return;
    	Stack<Node5> st= new Stack<Node5>(); 
    	st.push(root);
    	  while (!st.empty())
        {    
    		  Node5 node= st.pop();
    	    	System.out.println(node.data);
    	    
    	    	if(node.right!=null)
    	    	{
    	    		st.push(node.right);
    	    	}
    	        
    	if(node.left!=null)
    	{
    		st.push(node.left);
    	}
        
    	
        
        }
    	}

	
	  public static void main(String[] args)
	    {
		  TreePrintReverseOrder tree = new TreePrintReverseOrder();
	        tree.root = new Node5(1);
	        tree.root.left = new Node5(2);
	        tree.root.right = new Node5(3);
	        tree.root.left.left = new Node5(4);
	        tree.root.left.right = new Node5(5);
	        tree.root.left.right.left = new Node5(7);
	        tree.root.left.right.right = new Node5(8);
	        //PrintInReverse(root);
	        PrintInReverse();
	 
	        
	        
	        
	    }
	}


	class Node5
	{
	    int data;
	    Node5 left, right;
	 
	    public Node5(int item)
	    {
	    	data = item;
	        left = right = null;
	    }
	}

