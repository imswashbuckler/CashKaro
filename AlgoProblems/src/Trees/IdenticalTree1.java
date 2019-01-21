package Trees;

public class IdenticalTree1 {
static Node6 root;
static Node6 root1;

static boolean b=true;
public static boolean checkIdenticalTree(Node6 node1,Node6 node2)
{
	if(node1==null && node2==null)
	{
		return b;
		
	}
	//int a=node1.data;
	//int c=node2.data;
//	System.out.println(3 & 2);
	//System.out.println(node1 !=null | node2!=null);
	if(node1 !=null && node2!=null && node1.data==node2.data )
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
	
	IdenticalTree1 obj = new IdenticalTree1();
	obj.root=new Node6(1);
	obj.root.left=new Node6(2);
	obj.root.right=new Node6(3);
	//obj.root.left.left=new Node6(4);
	//obj.root.left.right=new Node6(5);
	
	obj.root1=new Node6(1);
	obj.root1.left=new Node6(2);
	 obj.root1.right=new Node6(3);
	//obj.root1.left.left=new Node6(4);
	//obj.root1.left.right=new Node6(5);

	boolean k=checkIdenticalTree(root,root1);
	
	System.out.println(k);

		
}	
}

class Node6
{
	int data;
	Node6 left;
	Node6 right;
Node6(int idata)
{
	this.data=idata;
	left=null;
	right=null;
	
	}

}
