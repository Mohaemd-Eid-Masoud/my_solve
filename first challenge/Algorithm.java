/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

import java.util.Arrays;

/**
 *
 * @author WIN(10)X64
 */
public class Algorithm {
    public static void main(String [] args){
        int arr[]={2,62,5,1,51,11,50,55,59,13};
        //System.out.println(LinSearch(arr, 13));
////        String arr2[]={"Mohamed","Ali","Zaki"};
        //int index=LinSearch(arr,62);
        //System.out.println(arr2[index]);
        //int arr3[]={2,4,6,8,10,12,14,16,18,20,22};
         //   System.out.println(BinarySearch(arr3, 11, 22));
//        SelectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(SelectionSort(arr));
    InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int LinSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }return -1;
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
       
   }

