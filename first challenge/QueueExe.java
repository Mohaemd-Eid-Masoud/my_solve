/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
public class QueueExe {
    public static void main(String[]args){
        QueueClass Q=new QueueClass();
        Q.enqueue(5);
        Q.enqueue(8);
        Q.enqueue(1);
        Q.enqueue(4);
        System.out.println(Q);
    }
}
