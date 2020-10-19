package com.example.demo.algorithm;

/**
 * @author : xuewensheng
 * @version ：1
 * @data : Created in 14:43 2020/9/21
 */
public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {7,9,4,5,3,5,2};
        arr = sort(arr);
        for(int a : arr){
            System.out.print(a);
        }

    }

    public static int[] sort(int[] arr){
        for(int j=0; j < arr.length-1;j++) {
            int minPos = j;
            for (int i = j+1; i < arr.length; i++) {
                minPos = arr[minPos] > arr[i] ? i : minPos;
            }
            System.out.println(arr[minPos]);
            int temp = arr[j];
            arr[j] = arr[minPos];
            arr[minPos] = temp;

        }
        return arr;
    }

}
