/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author WIN(10)X64
 */
public class task {

    public static void main(String[] args) {
//        double begin=System.nanoTime();
//        System.out.println(sum(100));
//        double end=System.nanoTime();
//        System.out.println(end-begin);0
//         double begin1=System.nanoTime();
//        System.out.println(sum(1000000));
//        double end1=System.nanoTime();
//        System.out.println(end1-begin1); 
//        double begin2=System.nanoTime();
//        System.out.println(sum(1000000000));
//        double end2=System.nanoTime();
//        System.out.println(end2-begin2);
//        System.out.println(recsum(5));
        System.out.println(Arrays.toString(Prime()));
    }

    public static int recsum(int n) {

        if (n == 1) {
            return 1;
        }
        return n + recsum(n - 1);
    }
    public static int[] Prime(){
       int arr[]=new int[100];
       for (int i=2,z=0;;i++,z++){
              boolean zk=true;
          for(int j=2;j<i;j++){
            if(i%j==0&&i!=j){zk=false; break;}
          }   if(zk)
            arr[z]=i; 
           }          
        }
    public static int[] copyarray(){
        
        return null;
        
    }
    public static ArrayList prime() {
       ArrayList<Integer> arr=new ArrayList<Integer>();
       for(int i=2;i<=100;i++){
                   boolean zk=true;
          for(int j=2;j<i;j++){
            if(i%j==0&&i!=j){zk=false; break;}
          }  
          if(zk)
            arr.add(i);
       }return arr;
    }

    public static double sum(double n) {
        int sum = 0;
        for (double i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
