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
public class Task_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter word to check palindrome: ");
        String word= sc.nextLine();
        char[]str = word.toCharArray();
        boolean flag= true;
        for (int i=0; i<str.length/2; i++) {
            if (str[i] !=str[str.length -1-i]) {
                flag = false;  // Mismatch found, so it's not a palindrome
                break;  // No need to check further
            }
        }
        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
    }  
}

