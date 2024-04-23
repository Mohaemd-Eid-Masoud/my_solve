/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;
import java.util.Stack;
/**
 *
 * @author WIN(10)X64
 */
public class Lab4 {
    public static void main(String[]args){
        //#1  convert from for loop to container and handle it////***
//    String str="{{}}(([}]))";
//    char []open={'{','(','['};
//    char []close={'}',')',']'};
//    boolean x=false;
//        Stack<Character> s=new Stack<Character>();
//        for(int i=0;i<str.length();i++){
//            for(int z=0;z<open.length;z++){
//        if(str.charAt(i)==open[z]){
//        s.push(str.charAt(i));
//        x=true;}else { 
//            } }
//        for(int j=0;j<close.length;j++) {
//            if(str.charAt(i)==close[j]&&open[j]==s.peek()){
//        s.pop();}
//            else break;}}
//        if(!s.empty())System.out.println("Not Organized");
//        
//        else System.out.println("Organized");
//// #2
        //String str="asdafssfffs";
//        String str = "aaabbas";
//        Stack<Character> s=new Stack<Character>();
//        for(int i=0;i<str.length();i++){
//            if(s.empty())s.push(str.charAt(i));
//            else
//            if(str.charAt(i)!=s.peek())
//          s.push(str.charAt(i));
//               
//            else { s.pop();}
//        }
//        System.out.println(s);
          Stack<Character> s=new Stack<Character>();
          String str="{{{}([]])";
          char str1[]= {'{','(','['};
          char str2[]= {'}',')',']'};
          String st ="{([";
          String st1="})]";
//          str.indexOf(0);
//          for(int i=0;i<str.length();i++){
//              if(str.charAt(i)==str.charAt(i)){
//                  s.push(str.charAt(i));
//              if(!s.empty()&&str.charAt(i)==str2[i]){
//               s.pop();
//              }
//              } 
//              
//          }
            for(int i=0;i<str.length();i++){
                if(s.empty()||s.peek()=='{'||s.peek()=='('||s.peek()=='['&&str.charAt(i)==st.charAt(0)||str.charAt(i)==st.charAt(1)||str.charAt(i)==st.charAt(2)){
                      s.push(str.charAt(i));
                    
                    if(s.peek()=='{'||s.peek()=='('||s.peek()=='['&&str.charAt(i)==st1.charAt(0)||str.charAt(i)==st1.charAt(1)||str.charAt(i)==st1.charAt(2))
                    s.pop();
                 else break;
                }
            }
                               System.out.println(s);

              if(s.empty()) System.out.println("Organized");
              else System.out.println("Not Organized");
    

}    
}    

