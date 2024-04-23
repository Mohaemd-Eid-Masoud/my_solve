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
public class StackClass {
    int maxStackSize;
    int StackTop;
    int [] list;
    public StackClass(){
    maxStackSize=50;
    StackTop=0;
    list=new int [maxStackSize];
    }
    public StackClass(int maxStackSize){
        this.maxStackSize=maxStackSize;
        this.StackTop=0;
        list=new int [maxStackSize];
    }
    public void initStack(){
        for(int i=0;i<StackTop;i++){
            list[i]=0;
        }
        //StackTop=0;
    }
        
    public boolean IsEmpty(){
        return StackTop==0 ?true:false;
    }
    public boolean IsFull(){
        return (StackTop==maxStackSize);
    }
    public void Push(int input){
        if(IsFull())
            System.out.println("Stack is Full");    
        else {
            list[StackTop]=input;
             StackTop++;
        }       
    }
    public void Pop(){
        if(IsEmpty())
            System.out.println("Stack is Empty");
        else{
            StackTop--;
            list[StackTop]=0;
        }
    }
    public int Peek(){
        if(IsEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return list[StackTop-1];
    }
    @Override
    public String toString(){
        return(Arrays.toString(list));
    }
}
