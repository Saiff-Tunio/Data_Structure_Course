 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa_lab_01;

/**
 *
 * @author Saiff Tunio
 */
public class Task_02 {
    public static void main(String[] args) {
//        Exercise 1: Insert an element at the start of the array.
        int[] num =new int[6];
        num[0]=12;
        num[1]=24;
        num[2]=36;
        num[3]=48;
        num[4]=60;
        
        for(int i= num.length-1; i>0; i--){
            num[i]=num[i-1];
        }
        num[0]=6;
        for(int i=0; i<=num.length-1; i ++)
            System.out.println(num[i]);
        
        
//       Exercise 2: Insert an element in the middle of the array.
        int[] num2 =new int[6];
        num2[0]=100;
        num2[1]=200;
        num2[2]=300;
        num2[3]=400;
        num2[4]=500;
        
        for(int i= num2.length-1; i>2; i--){
            num2[i]=num2[i-1];
        }
        num2[2]=250;
        for(int i=0; i<=num2.length-1; i ++)
            System.out.println(num2[i]);
        
//      Exercise 3: Insert an element at the end of the array.
        
        int[] num3 =new int[6];
        num3[0]=3;
        num3[1]=6;
        num3[2]=9;
        num3[3]=12;
        num3[4]=15;
        num3[num3.length-1]=18;
        for(int i=0; i<=num2.length-1; i ++)
            System.out.println(num2[i]);
        }
        
    }
    

