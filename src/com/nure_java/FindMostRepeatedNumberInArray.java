package com.nure_java;
import java.util.Arrays;

// задача 10 из заданий к лабораторной роботе 1
// Задан массив целых чисел. Определить, какое число встречается в нем чаще всего

public class FindMostRepeatedNumberInArray {
    public static void call(int[] array) {
        Arrays.sort(array);

        int element = Integer.MIN_VALUE, max_count=1, count=1;

        for(int i=1; i<array.length; i++){
            if(array[i] == array[i-1]) {
                count++;
            } else {
                if(count>max_count) {
                    max_count = count;
                    element = array[i-1];
                }
                count =1;
            }
        }

        System.out.println(element+": "+max_count);
    }
}
