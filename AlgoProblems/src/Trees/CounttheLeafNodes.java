package Trees;

public class CounttheLeafNodes {
	
	
	static Node2 root;
	int count=0;
	
	
	public static int getLeafCount() 
    {
        return getLeafCount(root);
    }
  
    static int getLeafCount(Node2 node) 
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }


    static void getLeafData(Node2 node) 
    {
    	 if (node == null) {
    	      return;
    	    }
        if (node.left == null && node.right == null)
System.out.println(node.data);
        	else
        		getLeafData(node.left); 
        		getLeafData(node.right);     		
    }
	public static void main(String[] args) {
		
		CounttheLeafNodes obj= new CounttheLeafNodes();
		obj.root = new Node2(1);
		obj.root.left= new Node2(2);
		obj.root.right=new Node2(4);
		obj.root.left.left=new Node2(3);
		obj.root.right.left=new Node2(5);
		obj.root.right.right=new Node2(6);
		System.out.println(getLeafCount());
		getLeafData(root);
		
		
	}
}


class Node2
{
	Node2 left,right;
	int data;
	Node2(int data)
	{		
		left=null;
		right=null;
		this.data=data;
	}
	
	

}
