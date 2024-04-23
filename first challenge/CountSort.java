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
public class CountSort {
    public static void main(String[] args){
        int arr[]={3,6,4,1,3,4,1,4};
        int max=0;
        for(int i=1;i<arr.length;i++){
            if (arr[i]>arr[max])
                max=i;
        }
        int C[]=new int[arr[max]];
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            C[temp-1]++;
        }
        int C_Cu[]=new int[arr[max]];
        C_Cu[0]=C[0];
        for(int i=1;i<C.length;i++){
            C_Cu[i]=C_Cu[i-1]+C[i];
        }
        int A[]=new int[arr.length];
        for(int i=A.length-1;i>=0;i--){
            
        }
        int[] Arraynew=new int[A.length];
        for(int i=0;i<A.length;i++){
            int index=Arraynew[i];
            int value=C_Cu[index];
            Arraynew[value-1]=Arraynew[i];
            C_Cu[index]--;
        }
        for(int i=0;i<A.length;i++){
            Arraynew[i]++;
        }
    }
}
