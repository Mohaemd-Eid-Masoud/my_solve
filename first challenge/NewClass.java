/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
public class NewClass {
    public static void main(String[] args){
        int sum=0;
        int asd[][]={{10,20,30,40,50,60,70,80,90,100},
                     {10,20,30,40,50,60,70,80,90,100},
                     {10,20,30,40,50,60,70,80,90,100},
                     {10,20,30,40,50,60,70,80,90,100}};
        for (int i=0;i<asd.length;i++)
           for(int j=i;j<asd[0].length;j++)    
               sum+=asd[i][j];
        System.out.println("Sum = "+sum);        
    }
}
