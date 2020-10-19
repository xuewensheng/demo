package com.example.demo.algorithm;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 14:43 2020/10/10
 */
public class CountSort {

    public static void main(String[] args){

        int[] arr = {3,4,9,3,8,7,4,8,5};
        arr = countSort(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }

    public static int[] countSort(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int d = max-min;
        int[] a = new int[d+1];
        for(int i=0;i<arr.length;i++){
            a[arr[i]-min]++;
        }
        for(int i=1;i<a.length;i++){
            a[i] = a[i]+a[i-1];
        }
        int[] ar = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           ar[--a[arr[i]-min]] = arr[i];

        }
        return ar;
    }
}
