/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
public class Recrusion {
    public static void main(String [ ] args){
        //System.out.println(fact(5));
        System.out.println(recfib(1,1,2));
    }

            public static int fact(int n){
                int fct=1;
            for(int i=1;i<=n;i++)
            fct*=i;
        return fct;
            }    
            public static int recfact(int n){
                if(n==1)
                    return 1;
                return n*recfact(n-1);
            }
            public static int power(int x,int y){
                int power=1;
                for (int i=0;i<y;i++){
                    power *=x;}
                    return power;
                }
            public static int recpower(int x,int y){
                if(y==1)
                    return x;
               else return x*power(x,y-1);
            } 
            public static int fibonaci(int n){
                int arr[]=new int[n];
                arr[0]=1;
                arr[1]=1;
                for(int i=2;i<n;i++){
                    arr[i]=arr[i-1]+arr[i-2];
                }
                return arr[n-1];
            }
            public static int recfib(int x,int z,int y){
                //int n=x+z;
             //   x=z;
               // z =n;
//                if(y==3){
//                    return n;
//                }else if(y==2){ return x;}
//                else if (y==1){ return x;}
//                return  recfib(z,n,y-1);
              int a=z+x;
              if(y==3)return a;
                  else if(y==2){ return x;}
                else if (y==1){ return x;}
              
              return recfib(z,a,y-1);
                  }
}
    

