package org.example.demo;

import java.util.Scanner;

public class One_D_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        scan.close();
        int[]  a = new int[n];
        for(int i=0;i<a.length ; i++)
        {
            a[i] = scan.nextInt();
        }
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
