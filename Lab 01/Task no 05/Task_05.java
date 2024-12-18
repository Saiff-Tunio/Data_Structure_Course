/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_01;

/**
 *
 * @author Saiff Tunio
 */
import java.util.Scanner;
public class Task_05 {
    public static int[] reverseArray(int []arr){
        int [] rev= new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
            
        
        return rev;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[5];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter Element at index "+i +": ");
            arr[i] = sc.nextInt();
        }
        int[] reversed = reverseArray(arr);
        System.out.println("Reversed Array:");
        for (int i=0; i<reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
