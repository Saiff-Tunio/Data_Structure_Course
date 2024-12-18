/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_01;

/**
 *
 * @author Saiff Tunio
 */
public class Task_03 {
    public static void main(String[] args) {
        
//        Exercise 1: Delete an element from a specific position.
        int[] num =new int[5];
        num[0]=8;
        num[1]=16;
        num[2]=24;
        num[3]=32;
        num[4]=40;
        
        for(int i= 2; i<num.length-1; i++){
            num[i]=num[i+1];
        }
        num[num.length-1]=0;
        
        for(int i=0; i<=num.length-1; i ++)
            System.out.println(num[i]);
        
    }
    
}
