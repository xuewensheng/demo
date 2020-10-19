package com.example.demo.algorithm;

import java.util.Arrays;

/**
 * @author : xuewensheng
 * @version ：1
 * @data : Created in 13:48 2020/9/24
 */
public class ShellSort {

    public static void shellSort(int[] arr){
        int gap =1;
        while(gap<arr.length/3){
            gap = gap*3 + 1;
        }
        while(gap>0) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j-gap] > arr[j]) {
                    while (j - gap > 0 &&  arr[j - gap]>temp) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }

            }
            gap=(gap-1)/3;
        }

    }


    public static void main(String[] args){
        int[] arr = {3,4,9,3,8,7,4,8,5};
        shellSort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }

}
