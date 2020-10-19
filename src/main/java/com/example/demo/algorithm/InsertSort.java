package com.example.demo.algorithm;

import java.util.Arrays;

/**
 * @author : xuewensheng
 * @version ：1
 * @data : Created in 10:31 2020/9/22
 */
public class InsertSort {

    public static void  sort(Integer[] arr){
        for(int i = 1;i<arr.length;i++){
            //每次需要插入的数
            int temp = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        Integer[] arr = {3,4,9,3,8,7,4,8,5};
        sort(arr);
        Arrays.asList(arr).forEach(a->System.out.println(a));
    }
}
