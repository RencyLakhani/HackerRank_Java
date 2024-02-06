package org.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> ls = new ArrayList();
        for(int i =0;i<size;i++)
        {
            ls.add(sc.nextInt());
        }
        int no_quries = sc.nextInt();
        String operation;
        for(int i=0;i<no_quries; i++)
        {
            operation = sc.next();
            switch (operation)
            {
                case "Insert":
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    ls.add(index,value);
                    continue;
                case "Delete":
                    int del_index = sc.nextInt();
                    ls.remove(del_index);
            }
        }
        for(Integer i : ls)
        {
            System.out.print(i + " ");
        }
    }
}
