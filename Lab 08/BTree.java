/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package newlab.btree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Saiff Tunio
 */
public class BTree {
    TNode root;
    BTree (int data){
        root =new TNode (data);
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
        if(root== null){
            return;
            
        }
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue. isEmpty()){
            TNode current = queue.poll();
            System.out.print(current.data + " ");
            
            
            if(current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BTree  bt= new  BTree(1);
        
         TNode node2 = new TNode(2);
         bt.root.addchildleft(bt.root, node2);
         
         TNode node3 = new TNode(3);
         bt.root.addchildright(bt.root, node3);
         
         TNode node4 = new TNode(4);
         node2.addchildleft(node2, node4);
         
         TNode node5 = new TNode(5);
         node3.addchildright(node3, node5);
         
         System.out.println("Pre Order Traversal");
         bt.preorder(bt.root);
         System.out.println("");
         System.out.println("In Order Traversal");
         bt.inorder(bt.root);
         System.out.println("");
         System.out.println("Post Order Traversal");
         bt.postorder(bt.root);
         System.out.println("");
         System.out.println("Level Order Traversal");
         bt.levelordertraversal(bt.root);
    }
}
