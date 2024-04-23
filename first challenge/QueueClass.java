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
public class QueueClass {
       int Front,Back;
       int list[];
       int Counter=0;
       int maxQueueSize;
    public QueueClass(){
        maxQueueSize=7;
        Counter=0;
        Front=0;
        Back=maxQueueSize-1;
        list=new int[maxQueueSize];
    }
    public QueueClass(int maxQueueSize){
        Counter=0;
        Front=0;
        Back=maxQueueSize-1;
        list=new int[maxQueueSize];
    }
    public boolean IsEmpty(){
        return(Counter==0);
    }
    public boolean IsFull(){
        return (Counter==maxQueueSize);
    }
    public void enqueue(int input){
        if(IsFull())
            System.out.println("Queue is Full");
        else{
            Back = (++Back) % maxQueueSize;
            list [Back] = input;
            Counter++;
        }
    }
    public void dequeue(){
        if(IsEmpty())
            System.out.println("Queue is Empty");
        else{
            list[Front]=0;
            Front= (++Front)%maxQueueSize;
            Counter--;
        }
    }
    public int Front(){
        if(IsEmpty())
            System.out.println("Queue is Empty");
        return -1;
    }
    public int Back(){
        if(IsFull())
            System.out.println("Queue is Full");
    return maxQueueSize;
    }
       @Override
    public String toString(){
        return Arrays.toString(list);
    }
    
}
