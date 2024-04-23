/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

/**
 *
 * @author WIN(10)X64
*/
import java.util.Stack;

public class BalancedParentheses {

  public static boolean isBalanced(String parentheses) {
    Stack<Character> stack = new Stack<>();
    for (char parenthesis : parentheses.toCharArray()) {
      if (parenthesis == '(' || parenthesis == '[' || parenthesis == '{') {
        stack.push(parenthesis);
      } else if (parenthesis == ')' || parenthesis == ']' || parenthesis == '}') {
        if (stack.isEmpty() || !isMatchingParenthesis(stack.pop(), parenthesis)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  private static boolean isMatchingParenthesis(char openingParenthesis, char closingParenthesis) {
    return openingParenthesis == '(' && closingParenthesis == ')'
        || openingParenthesis == '[' && closingParenthesis == ']'
        || openingParenthesis == '{' && closingParenthesis == '}';
  }

  public static void main(String[] args) {
    System.out.println(isBalanced("()"));
    System.out.println(isBalanced("((()))"));
    System.out.println(isBalanced("{[]}"));
    System.out.println(isBalanced("("));
    System.out.println(isBalanced("())"));
    System.out.println(isBalanced("{[}"));}
  }

