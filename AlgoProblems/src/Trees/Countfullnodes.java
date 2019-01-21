package Trees;

import Springs.mainClass;

public class Countfullnodes {
	
	static Node3 root;
	static int count=0;
	 static int getfullNodeCount(Node3 node) 
	    {
	        if (node == null)
	            return 0;
	        if (node.left != null && node.right != null)
	        {
	        	count =count+1;
	        }
	        getfullNodeCount(node.left);
	        getfullNodeCount(node.right);
	        
	        return count;
	        
	     }
public static void main(String[] args) {
	
	Countfullnodes obj= new Countfullnodes();
	obj.root = new Node3(1);
	obj.root.left= new Node3(2);
	obj.root.right=new Node3(4);
	obj.root.left.left=new Node3(3);
	obj.root.left.right=new Node3(8);
	obj.root.right.left=new Node3(5);
	obj.root.right.right=new Node3(6);
	System.out.println(getfullNodeCount(root));
}

}



class Node3
{
	Node3 left,right;
	int data;
	Node3(int data)
	{		
		left=null;
		right=null;
		this.data=data;
	}
	
	

}

