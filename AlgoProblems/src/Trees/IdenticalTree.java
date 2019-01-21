package Trees;

public class IdenticalTree {
	static Node4 root;
	static Node4 root1;
	static boolean b=true;
	
	public static boolean checkIdenticalTree(Node4 node1,Node4 node2)
	{

        if (node1 == null && node2==null)
            return b;

		
		
        if (node1!=null && node2!=null && node1.data == node2.data )
		 {
			 
			 checkIdenticalTree(node1.left,node2.left);
			 checkIdenticalTree(node1.right,node2.right);
			 
		 }
		 
		 else
		 {
			 
			 b=false;
			 
		 }
		return b;
		       
		
		
	}
	
	
	public static void main(String[] args) {
	
	IdenticalTree obj= new IdenticalTree();
	obj.root = new Node4(1);
	obj.root.left= new Node4(2);
	obj.root.right=new Node4(4);
	//obj.root.left.left=new Node4(3);
	//obj.root.left.right=new Node4(8);
	//obj.root.right.left=new Node4(5);
	//obj.root.right.right=new Node4(6);
		
	IdenticalTree obj1= new IdenticalTree();
	obj.root1 = new Node4(1);
	obj.root1.left= new Node4(2);
	//obj.root1.right=new Node4(4);
	//obj.root1.left.left=new Node4(3);
//	obj.root1.left.right=new Node4(8);
	//obj.root1.right.left=new Node4(5);
	//obj.root1.right.right=new Node4(6);
	
	boolean k=checkIdenticalTree(root,root1);
	System.out.println(k);



	}
}

class Node4
{
	Node4 left,right;
	int data;
	Node4(int data)
	{		
		left=null;
		right=null;
		this.data=data;
	}
	
	

}