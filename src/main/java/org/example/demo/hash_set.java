package org.example.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hash_set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        HashSet<String> two_per = new HashSet<>();
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            two_per.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(two_per.size());
        }
//        Iterator iterator = two_per.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

        //        for(int i=1; i< t-1; i++)
//        {
//            if(!(pair_left[i].equals(pair_left[i-1]) && pair_right[i].equals(pair_right[i])))
//            {
//                count++;
//                System.out.println(count);
//            }
//        }
    }
}
