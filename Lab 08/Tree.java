/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Saiff
 */



class Node {
    String data;
    Node[] children;
    int count;
    
    public Node(String data, int child) {
        this.data = data;
        this.children = new Node[child];
        this.count = 0;
    }
    
    // Create a Method of Add Child
    public void addChild(Node child){
        if(count < children.length){
            children[count++]=child;
            System.out.println(child.data + " has been added");
        } else{
            System.out.println("Node is Already filled");
        }
    }
}



public class Tree {
    
    private Node root;

    public Tree(String rootValue, int MaxChildren) {
        root = new Node(rootValue, MaxChildren);
        System.out.println("Node: \""+ rootValue + "\" Have been Created.");
    }
    
    // Method of display 
    public static void display(Node node, int level) {
        if (node == null) {
            return;
    }
    // Indentation for better visualization
    for (int i = 0; i < level; i++) {
       System.out.print("  ");
    }
    System.out.println(node.data);
    // Recursively call display for each child node
        for (Node child : node.children) {
            display(child, level + 1);
        }
    }


    
   public static void main(String[] args) {
        Tree tree = new Tree("A", 2);
        Node B = new Node("B", 3);
        Node C = new Node("C", 2);
        
        tree.root.addChild(B);
        tree.root.addChild(C);
        
        Node D = new Node("D", 2);
        Node E = new Node("E", 2);
        Node F = new Node("F", 2);
        
        B.addChild(D);
        B.addChild(E);
        B.addChild(F);
        
        Node G = new Node("G", 2);
        Node H = new Node("H", 2);
        Node I = new Node("I", 2);
        C.addChild(G);
        C.addChild(H);
        D.addChild(I);
        tree.display(tree.root, 3);
     
}
}
