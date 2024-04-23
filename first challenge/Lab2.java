/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author WIN(10)X64
 */
public class Lab2 {
    public  static void main(String []args){
        int arr[]=new int[5000];
        Random rand=new Random();
//       
//        for (int i=0;i<arr.length;i++){
//            arr[i]=rand.nextInt(10000);
//        }
//         int arr1[]=new int[5000];
//        for (int i=0;i<arr1.length;i++){
//            arr1[i]=rand.nextInt(10000);
//        }
//        int arr2[]=new int[5000];
//        for (int i=0;i<arr2.length;i++){
//            arr2[i]=rand.nextInt(10000);
//        }

//       
       for(int i=0,z=0;i<5000;i++,z+=2){
           arr[i]=z;
        }
      int arr1[]=new int[5000];
        for (int i=0,z=0;i<arr1.length;i++,z+=2){
            arr1[i]=z;
        }
        int arr2[]=new int[5000];
        for (int i=0,z=0;i<arr2.length;i++,z+=2){
            arr2[i]=z;
        }
//         for(int i=0;i<5000;i++){
//             arr[i]=rand.nextInt(6000);for(int i=0 ,z=10000;i<5000;i++,z-=2){
//           arr[i]=z;
//       }
//       for(int i=0;i<5000;i++)System.out.print(Arrays.toString(arr));
//         int    
//         }
        
        
         
       double begin= System.nanoTime();
       SelectionSort(arr);
       System.out.println(Arrays.toString(arr));
       double end= System.nanoTime();
        System.out.println(end-begin);
         double begin1= System.nanoTime();
       BubbleSort(arr1);
       System.out.println(Arrays.toString(arr1));
       double end1= System.nanoTime();
        System.out.println(end1-begin1);
        double begin2= System.nanoTime();
       InsertSort(arr2);
       System.out.println(Arrays.toString(arr2));
       double end2= System.nanoTime();
        System.out.println(end2-begin2);
//       double begin3= System.nanoTime();
//       int index=LinSearch(arr,200);
//        if(index==-1)
//            System.out.println("Not Found");
//        else System.out.println(arr[index]);
//       double end3= System.nanoTime();
//        System.out.println(end3-begin3);
//         InsertSort(arr);
//        double begin4= System.nanoTime();
//       int index1=BinarySearch(arr,5000,200);
//       if(index1==-1)
//            System.out.println("Not Found");
//       else System.out.println(arr[index1]);
//         double end4= System.nanoTime();
//        System.out.println(end4-begin4);
    }
     public static int[] SelectionSort(int arr[]){
       for (int i=0;i<arr.length;i++){
           int min=i;
           for(int j=i;j<arr.length;j++){
               if(arr[j]<arr[min])
                   min=j;
           }
           int temp=arr[min];
           arr[min]=arr[i];
           arr[i]=temp;
       }
        return arr ;
   }
   public static int[] BubbleSort(int arr[]){
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }      
           }
       }
        return arr;
       
   }
   public static int[] InsertSort(int arr[]){
       for(int i=1;i<arr.length;i++){
           for(int j=i;j>0&&arr[j]<arr[j-1];j--){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }
           }
        return arr;
       }
    public static int LinSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
        
            } 
    public static int BinarySearch(int []list,int listlength,int key){
        int first=0 ,last=listlength-1;
        int mid = 0;
        boolean found=false;
        while(first <= last && !found){
            mid=(first+last)/2;
            if(list[mid]==key){
                found = true;
            }
            else {if(key>list[mid])
                first=mid+1;
            else{
                   last=mid-1; 
                }
        }}
        if(found)
            return mid;
        else
        return -1;
    }
}
