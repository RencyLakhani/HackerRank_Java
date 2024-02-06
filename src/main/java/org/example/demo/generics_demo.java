package org.example.demo;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class generics_demo {
    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add(1);
        ls.add(2);ls.add(3);
        ls.add("Hello");
        ls.add("World");

        Iterator iterator = ls.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
