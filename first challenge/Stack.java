/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
public class Stack {
    public static void main(String[]args){
        System.out.println("Start main");
        A();
        System.out.println("end main");
    }
    public static void A(){
        System.out.println("Start A");
        B();
        System.out.println("end A");
    }
    public static void B(){
        System.out.println("Start B");
        C();
        System.out.println("end B");
    }
    public static void C(){
        System.out.println("Start C");
        System.out.println("end C");
    }
}
