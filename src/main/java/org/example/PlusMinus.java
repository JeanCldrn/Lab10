package org.example;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 1) {
                positives++;

            } else if (arr.get(i) >= -1) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.println(String.format("%5f", positives / arr.size()));
        System.out.println(String.format("%5f", zeros / arr.size()));
        System.out.println(String.format("%5f", negatives / arr.size()));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}


