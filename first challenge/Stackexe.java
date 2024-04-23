/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
public class Stackexe {
    public static void main (String[]args){
        StackClass st=new StackClass(20);
        st.Push(3);
        st.Push(6);
        st.Push(2);
        st.Push(5);
        st.Pop();
        st.Push(10);
        System.out.println(st);
        System.out.println(st.Peek());
    }
}
