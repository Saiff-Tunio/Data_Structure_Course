/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_01;

import java.util.*;

/**
 *
 * @author Saiff Tunio
 */
public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Word");
        String word1=sc.nextLine();
        System.out.println("ENter Second Word");
        String word2=sc.nextLine();
        char[]str1 = word1.toLowerCase().toCharArray();
        char[]str2 = word2.toLowerCase().toCharArray();
        if(str1.length == str2.length){
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1, str2))
                System.out.println("its anangram");
            else
                System.out.println("its not anagram");
        }
    }
    
}
