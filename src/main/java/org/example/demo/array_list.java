package org.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class array_list {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> sub_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            for(int j=0 ; j<i;j++)
            {
                sub_list.add(sc.nextInt());
                continue;
            }
        }


        for (int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i));
           System.out.print("sublist "+sub_list);
//            for(int j=0 ; j<i;j++)
//            {
//                System.out.println(sub_list.get(j));
//            }
        }

    }


//        ArrayList<Integer> b_list = null;
//        int b=0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0 ; i<n ; i++)
//        {
//            b = sc.nextInt();
//            b_list = new ArrayList<>(b);
//            for(int j= 0 ; j<b ; j++)
//            {
//                b_list.add(sc.nextInt());
//            }
//        }
//        System.out.println("total number " + n);
//        for (int i = 0 ; i<n ; i++)
//        {
//            System.out.print("size of inner list : "+ b );
//            for(int j= 0 ; j<b ; j++)
//            {
//                System.out.print("  "+b_list.get(j) + " ");
////                b_list.add(sc.nextInt());
//            }
//            System.out.println("");
//        }

}
