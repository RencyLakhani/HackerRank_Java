package org.example.demo;

import java.math.BigInteger;
import java.util.Scanner;

public class big_Integer {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
//         x1 = new BigInteger(String.valueOf(x));
//         x2 = new BigInteger(String.valueOf(y));

        BigInteger multi,sum;
        sum = x.add(y);
        multi = x.multiply(y);


        System.out.println(sum);
        System.out.println(multi);
    }
}
