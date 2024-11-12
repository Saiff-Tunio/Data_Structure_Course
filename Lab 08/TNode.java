/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newlab.btree;

/**
 *
 * @Saiff Tunio
 */
public class TNode {
    int data;
    TNode left,right;
    
    public TNode (int data){
       this.data=data;
       left=right=null;
  
    }
    public void addchildleft(TNode parent, TNode child){
    parent.left= child;
    }
    public void addchildright(TNode parent, TNode child){
        parent.right= child;
    }
    }


