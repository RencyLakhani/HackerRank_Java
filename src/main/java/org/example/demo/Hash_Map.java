package org.example.demo;

import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        ;
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);

        }
//        System.out.println("---");
//        for (String s : map.keySet()) {
//            System.out.println(s);
//        }
//        List<String> hash = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            hash.add(in.nextLine());
//        }

//        for (String s : hash) {
//            if (map.containsKey(s)) {
//                System.out.println(s + "=" + map.get(s));
//            }else {
//                System.out.println("Not found");
//            }
//        }

            while(in.hasNext())
            {
                String s = in.nextLine();
                try
                {
                   int find = map.get(s);
                   System.out.println(find + "=" + s);
                }catch(Exception e)
                {
                    System.out.println("Not Found");
                }

            }
    }
}
