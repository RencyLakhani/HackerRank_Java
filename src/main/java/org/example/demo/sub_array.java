package org.example.demo;

import java.util.Scanner;

public class sub_array {
    public static void main(String args[]) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

//         The array elements
        int sum = 0;
//        System.out.println("The subarrays are-");

        // For loop for start index
        for (int i = 0; i < array.length; i++)

            // For loop for end index
            for (int j = i; j < array.length; j++) {

                // For loop to print subarray elements
                for (int k = i; k <= j; k++) {
//                    System.out.print(array[k] + " ");
                    sum = sum + array[k];
//                    System.out.println(sum);

                }
//                System.out.println(" -> " + sum);
                if (sum < 0) {
                    c++;
                }
//                System.out.println("");
                sum = 0;
            }


        System.out.println(c);

//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] < 0) {
//                c++;
//            }
//        }
//        int sum =0,temp = 0;
//        for (int i = 0; i <= array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                sum = array[i] + array[j];
//
//            }
//        }
//        System.out.println(c);
    }
//
//        for (int i = 0; i <= array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                if (i != j) {
//                    int sum = array[i] + array[j];
//                    System.out.println(i + " " + j + " sum is " + sum);
//                    if (sum < 0) {
//                        ++c;
//                    }
//                }
//            }
//        }
//        System.out.println(c);
//    }
}
