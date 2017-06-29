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
	  
    /* Returns true if binary tree with root as root is height-balanced */
    void isBalanced(Node node) 
    {
       
    }
  
    /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*/
    void height(Node node) 
    {
      
    }
  
    public static void main(String args[]) 
    {
        BT tree = new BT();
        
    }
}


/* Java program to determine if binary tree is 
height balanced or not */
 
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