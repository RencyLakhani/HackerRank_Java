package org.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class d2_array_demo {
    static int[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList())
                );

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        converlisttoarray(arr);
        System.out.println(find_spattern(array));
        bufferedReader.close();
    }

    public static int[][] converlisttoarray(List<List<Integer>> list) {
        int rows = list.size();
        int cols = list.get(0).size();
        array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = list.get(i).get(j);
            }
        }
        return array;
    }


    private static int find_spattern(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
               int sum = chechkpattern(arr, i, j);
                System.out.println("sum of " + i + j + " == " +sum);
                if (max < sum) {
                    max = sum;
                }
            }
        }
//        System.out.println(" maximum among all this ==  : " + max);
        return max;
    }

    private static int chechkpattern(int[][] arr, int i, int j) {
        int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        +arr[i + 1][j + 1] +
                arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        return sum;
    }


}
