/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
public class Tester {
    public static void main(String []args){
        CellPhone cell=new CellPhone();
        cell.dial();
        
    }}
    class Phone{
          void dial(){
            System.out.println("dialing");
        }
    }
    class CellPhone extends Phone {
    
    void dial(){
        super.dial();
        System.out.println("Cell");
    }    
    }

