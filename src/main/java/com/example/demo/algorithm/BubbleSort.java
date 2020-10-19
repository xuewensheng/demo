package com.example.demo.algorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author : xuewensheng
 * @version ：1
 * @data : Created in 16:58 2020/9/21
 */
public class BubbleSort {
    public static void  sort(Integer[] arr){
        for(int i = arr.length-1;i>=0;i--){
            for(int j = 0; j<i;j++){
              if(arr[j+1]<arr[j]){
                  swap(arr,j,j+1);
              }
            }

        }
    }
    public static void swap(Integer[] arr,int i,int j){
     arr[i] = arr[i]^arr[j];
     arr[j] = arr[i]^arr[j];
     arr[i] = arr[i]^arr[j];
    }
    public static void main(String[] args){
        Integer[] arr = {3,4,9,3,8,7,4,8,5};
        sort(arr);
        Arrays.asList(arr).forEach(a->System.out.println(a));
    }

}
