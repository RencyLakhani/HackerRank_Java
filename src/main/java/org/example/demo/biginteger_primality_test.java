package org.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Random;

public class biginteger_primality_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger big_n = new BigInteger(n);
        boolean status = big_n.isProbablePrime(1);
        if (status) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }



        bufferedReader.close();
    }
}
