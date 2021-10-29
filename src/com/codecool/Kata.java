package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!

        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        System.out.println(min);
        System.out.println(max);

        int newLength = max - min + 1;

        System.out.println(newLength);

        int[] result = new int[newLength];
        ArrayList<Integer> resultArrayList = new ArrayList<>();


//        resultArrayList.get(i);
//        resultArrayList.add(i+min);
//      String[] array = resultArrayList.toArray();

        for (int i = 0; i < newLength; i++) {
            result[i] = i + min;
            resultArrayList.set(i, i + min);
        }

        System.out.println(Arrays.toString(resultArrayList.toArray()));
        return result;
    }
}
