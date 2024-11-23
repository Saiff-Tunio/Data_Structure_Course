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
        if(newNode == null){
            return;
        }
        System.out.print(" "+newNode.data);
        preorder(newNode.left);
        preorder(newNode.right);
        
    }
    
    public void inorder(TNode newNode){
        if(newNode == null){
            return;
        }
        inorder(newNode.left);
        System.out.print(" "+newNode.data);
        inorder(newNode.right);
        
    }
    
    public void postorder(TNode newNode){
        if(newNode == null){
            return;
        }
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
        System.out.println("");
        System.out.println("In Order Traversal");
        bst.inorder(bst.root);
        System.out.println("");
        System.out.println("Post Order Traversal");
        bst.postorder(bst.root);
        System.out.println("");
        System.out.println("Level Order Traversal");
        bst.levelordertraversal(bst.root);
        System.out.println("\nTotal Nodes: " + bst.countNodes());
        System.out.println("\nSearching for values:");
        System.out.println("Search 40 found: " + bst.search(40));
        System.out.println("Search 6 found: " + bst.search(6));
        
    }
}
