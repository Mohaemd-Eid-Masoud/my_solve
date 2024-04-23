/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
 */
 class Fraction {
    int x,y;
    public Fraction(){
        x=1; y=2;
    }
  public Fraction(int a,int b){
      x=a; y=b;
  }
  public void doOperation(Fraction f1,Fraction f2){
      this.x+=f1.x+f2.x; this.y+=f1.y+f2.y;
  }
  public void printFraction(){
      System.out.println("Fraction = "+x+"/"+y);
  }
}
public class Exam{
    public static void main(String[]args){
        Fraction frac=new Fraction();
        frac.doOperation(new Fraction(1,3), new Fraction(1,4));
        frac.printFraction();
    }
    
}
