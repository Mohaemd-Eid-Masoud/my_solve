/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject.codeforces;
/**
 *
 * @author WIN(10)X64
 */
import java.util.Scanner;

public class Friends {

    static int friends(int n, int m, int k) {
        int friends = 0;
        for (int i = 1; i <= m; i++) {
            if (__sameArmy(i, m + 1, k)) {
                friends++;
            }
        }
        return friends;
    }

    static boolean __sameArmy(int i, int j, int k) {
        int count = 0;
        int x = i;
        int y = j;
        while (count <= k) {
            if ((x & 1) != (y & 1)) {
                count++;
            }
            x >>= 1;
            y >>= 1;
        }
        return count <= k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(friends(n, m, k));
    }
}