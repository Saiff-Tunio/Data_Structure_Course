/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_9;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Saiff
 */
public class BSTree {
    TNode root;
    BSTree (int data){
        root =new TNode (data);
    }
    public void insert(int data) {
        TNode newNode = new TNode(data);
        if (root == null) {
        root = newNode;
        return;
        }
        TNode current = root;
        TNode parent = null;
        while (current != null) {
            parent = current;
            if (data < current.data)
                current = current.left;
            else if (data > current.data)
                current = current.right;
            else {
                System.out.println("Duplicate value: " + data);
                return;
            }
        }
        if (data < parent.data)
            parent.left = newNode;
        else
            parent.right = newNode;
    }


    public void preorder(TNode newNode){
        if(newNode == null)
            return;

        System.out.print(" "+newNode.data);
        preorder(newNode.left);
        preorder(newNode.right);
        
    }
    
    public void inorder(TNode newNode){
        if(newNode == null)
            return;
        inorder(newNode.left);
        System.out.print(" "+newNode.data);
        inorder(newNode.right);
        
    }
    
    public void postorder(TNode newNode){
        if(newNode == null)
            return;
        postorder(newNode.left);
        postorder(newNode.right);
        System.out.print(" "+newNode.data);
        
    }
    
    public void levelordertraversal(TNode newNode){
        if(root== null)
            return;
            
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue. isEmpty()){
            TNode current = queue.poll();
            System.out.print(current.data + " ");
            if(current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }

    public int countNodes() {
        if (root == null)
            return 0;
        
        int count = 0;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TNode current = queue.poll();
            count++;
            if (current.left != null) 
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        return count;
    }

    public boolean search(int data) {
        TNode current = root; 
        while (current != null) {
            if (current.data == data)
                return true;
            if (data < current.data)
                current = current.left;
            else
                current = current.right; 
       }
        return false; 
    }
    
    
    
    // assignment
    
    // Method to delete a node with a given value
   public void delete(int data){
       root = deleteIterative(root, data);
   }


   public TNode deleteIterative(TNode current, int data) {
       TNode parent = null;
       
       while (current != null) {
           if (data < current.data) {
               parent = current;
               current = current.left;
           } else if (data > current.data) {
               parent = current;
               current = current.right;
           } else {
               // Case 1: No children (leaf node)
               if (current.left == null && current.right == null) {
                   if (parent == null)
                       return null;
                   if (parent.left == current)
                       parent.left = null;
                   else
                       parent.right = null;
               }

               // Case 2: One child
               else if (current.left == null) {
                   if (parent == null)
                       return current.right;
                   if (parent.left == current)
                       parent.left = current.right;
                   else
                       parent.right = current.right;
               }
               else if (current.right == null) {
                   if (parent == null)
                       return current.left;
                   if (parent.left == current)
                       parent.left = current.left;
                   else
                       parent.right = current.left;
               }

               // Case 3: Two children
               else {
                   TNode successorParent = current;
                   TNode successor = current.right;
                   while (successor.left != null) {
                       successorParent = successor;
                       successor = successor.left;
                   }
                   current.data = successor.data;
                   if (successorParent.left == successor)
                       successorParent.left = successor.right;
                   else
                       successorParent.right = successor.right;
               }
               return root;
           }
       }
       return root;
   }


        

    
    public static void main(String[] args) {
        BSTree  bst= new  BSTree(50);
        
           // Insert nodes into the BST
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        System.out.println("Pre Order Traversal");
        bst.preorder(bst.root);

        System.out.println("\nIn Order Traversal");
        bst.inorder(bst.root);

        System.out.println("\nPost Order Traversal");
        bst.postorder(bst.root);
        System.out.println("\nLevel Order Traversal");
        bst.levelordertraversal(bst.root);
        System.out.println("\nTotal Nodes: " + bst.countNodes());
        System.out.println("\nSearching for values:");
        System.out.println("Search 40 found: " + bst.search(40));
        System.out.println("Search 6 found: " + bst.search(6));
        
        bst.delete(50);
        
        System.out.println("\nLevel Order Traversal");
        bst.levelordertraversal(bst.root);
    }
}
