/**
 * 
 */
package com.pavan.yalamanchili;

import java.util.Scanner;

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
  
        /* Get the height of left side  and right side  sub trees */
        lhs = height(node.left);
        rhs = height(node.right);
  
        if (Math.abs(lhs - rhs) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right)) 
            return true;
  
       
        /* Tree height is not balanced*/
        return false;
    }
  /*This is to compute the Height of the tree*/
   
    int height(Node node) 
    {
    	  /* if tree is empty */
        if (node == null)
            return 0;
  
        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }
  
    public static void main(String args[]) 
    {
        BT tree = new BT();
        /*
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
        */
/* Let's Do this with Dynamic User Input now using Scanner Class*/ 
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Root Node");
        int rt=s.nextInt();
        tree.root = new Node(rt);
        
        
        
        
        
        if(tree.isBalanced(tree.root))
        {
        	
  
        	System.out.println("Tree is balanced");
        
        }else
        {
            System.out.println("Tree is not balanced");
        }
        s.close();
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