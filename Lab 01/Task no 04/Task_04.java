/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_01;

/**
 *
 * @author Saiff Tunio
 */
public class Task_04 {
    public static void main(String[] args) {
//        Exercise 1: Search for an element by its index.

        int[] num =new int[5];
        num[0]=13;
        num[1]=26;
        num[2]=39;
        num[3]=52;
        num[4]=65;
        System.out.println("Element at index 4: " + num[4]);
        
        
//        Exercise 2: Implement linear search to find an element by its value.
        int[] num2 =new int[5];
        num2[0]=4;
        num2[1]=6;
        num2[2]=2;
        num2[3]=8;
        num2[4]=10;
        
        for(int i=0; i<=num2.length-1; i++){
            if(num2[i] == 8) 
                System.out.println("Element 8 found at  Index: " +i);
        }
    
//        Exercise 3: Implement binary search on a sorted array.
        int[] num3 = new int[5];
        num3[0] = 11;
        num3[1] = 22;
        num3[2] = 33;
        num3[3] = 44;
        num3[4] = 55;
        int target = 33;

        int left = 0;
        int right = num3.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num3[mid] == target) {
                System.out.println("Element " +target + " found at index: " + mid);
                found = true;
                break;
            } else if (num3[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        if (!found)
            System.out.println("Element not found");

    }
    
}
