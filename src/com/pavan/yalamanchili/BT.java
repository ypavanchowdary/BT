/**
 * 
 */
package com.pavan.yalamanchili;

/**
 * @author ypava
 *
 */
public class BT {

	/**
	 * @param args
	 */
	Node root;
	  
    /* Returns true if BT with root as root is height-balanced */
    boolean isBalanced(Node node) 
    {
        int lhs; /* for height of left hand side subtree*/
  
        int rhs; /* for height of right hand side subtree */
  
        /* If tree is empty then return true */
        if (node == null)
            return true;
  
       
  
       
        /* Tree height is not balanced*/
        return false;
    }
  
   
    void height(Node node) 
    {
        
    }
  
    public static void main(String args[]) 
    {
        BT tree = new BT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
  
        
    }
}


/* Java program to determine if binary tree is 
height balanced or not balanced*/
 
/* A binary tree node has data, pointer to left child,
and a pointer to right child */
class Node 
{
 int data;
 Node left, right;
 Node(int d) 
 {
     data = d;
     left = right = null;
 }
}