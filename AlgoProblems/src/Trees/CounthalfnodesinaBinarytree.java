package Trees;

import java.util.LinkedList;
import java.util.Queue;


class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}
public class CounthalfnodesinaBinarytree {

    Node root;

    /* Function to get the count of half Nodes in
    a binary tree*/
    int gethalfCount()
    {
        // If tree is empty
        if (root==null)
            return 0;

        // Do level order traversal starting from root
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        int count=0; // Initialize count of half nodes
        while (!queue.isEmpty())
        {

            Node temp = queue.poll();
            if (temp.left!=null && temp.right==null ||
                temp.left==null && temp.right!=null)
                count++;

            // Enqueue left child
            if (temp.left != null)
                queue.add(temp.left);

            // Enqueue right child
            if (temp.right != null)
                queue.add(temp.right);
        }
        return count;
    }

    public static void main(String args[])
    {
        /* 2
          / \
        7     5
        \     \
        6     9
        / \ /
        1 11 4
        Let us create Binary Tree shown in
        above example */
    	CounthalfnodesinaBinarytree tree_level = new CounthalfnodesinaBinarytree();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(7);
        tree_level.root.right = new Node(5);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);

        System.out.println(tree_level.gethalfCount());

    }
}