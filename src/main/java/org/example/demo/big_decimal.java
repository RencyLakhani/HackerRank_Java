package org.example.demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class big_decimal {


    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String[] s=new String[n];
//        System.out.println(s.length);
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        Comparator<String> customComparator = (s1, s2) -> {
            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);
            return bd2.compareTo(bd1); // Reverse order for descending sorting
        };

        // Sorting the array using custom comparator
        Arrays.sort(s, customComparator);



//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (s[j].compareTo(s[j + 1]) < 0) {
//                    // Swap s[j] and s[j+1]
//                    String tmp = s[j];
//                    s[j] = s[j + 1];
//                    s[j + 1] = tmp;
//                }
//            }
//        }
            //Output
//        DecimalFormat df = new DecimalFormat("0.00");
            for (int i = 0; i < n; i++) {
                System.out.println(s[i]);
            }
        }

}
