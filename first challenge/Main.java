package com.mycompany.mavenproject;
public class Main {
    public static void main(String[] args) {
        MyClass original = new MyClass(10);

        try {
            MyClass cloned = (MyClass) original.clone();

            cloned.setNumber(20);

            System.out.println(original.getNumber()); // Output: 10
            System.out.println(cloned.getNumber());  // Output: 20
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
  }
}
}