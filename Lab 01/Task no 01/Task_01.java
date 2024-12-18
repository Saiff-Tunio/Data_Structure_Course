/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_01;

/**
 *
 * @author Saiff Tunio
 */
public class Task_01 {
    public static void main(String [] args){
        
/*
        Exercise 1: Declare an integer array of size 6 and initialize it with the values 
        {5, 15, 25, 35, 45, 55}. Write a program to print all elements of the array.
*/      

        int[] nums = new int[6];
        nums [0] = 5;
        nums [1] = 15;
        nums [2] = 25;
        nums [3] = 35;
        nums [4] = 45;
        nums [5] = 55;
        for(int i =0; i<= nums.length-1; i++){
            System.out.println(nums[i]);
        }
        

//        Exercise 2: Modify the program to print each element with its corresponding index.
        
        for(int i =0; i<=nums.length-1; i++){
            System.out.println("Element at index " +i + ": " + nums[i]);
        }
        
    }
}
