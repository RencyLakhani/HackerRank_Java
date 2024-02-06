package org.example.demo;

import java.util.Scanner;

public class tshirt_hunt {
    public static int smallestSuccessfulHacks(int p, int x, int y) {
        int i = (x / 50) % 475;
        int hacksNeeded = 0;

        for (int count = 0; count < 25; count++) {
            i = (i * 96 + 42) % 475;
            int place = 26 + i;

            if (place == p && x >= y) {
                break;
            }

            if (place <= x && place >= y) {
                continue;
            }

            hacksNeeded++;
            x += 100;
        }
        return hacksNeeded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int p = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Output
        int result = smallestSuccessfulHacks(p, x, y);
        System.out.println(result);

        scanner.close();
    }
}
