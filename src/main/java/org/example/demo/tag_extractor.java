package org.example.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tag_extractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0)
        {
            String txt = in.nextLine();
            Pattern p = Pattern.compile("<([^\\s>/]+)");
            Matcher m = p.matcher(txt);
            while(m.find()) {
                String tag = m.group(1);
                System.out.println(tag);
            }
        }
    }

}
