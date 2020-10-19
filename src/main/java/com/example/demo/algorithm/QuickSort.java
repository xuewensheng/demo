package com.example.demo.algorithm;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 10:40 2020/10/9
 */
public class QuickSort {

    public static void main(String[] agrs){
        int[] arr = {3,4,9,3,8,7,4,8,5};
        sort(arr,0,arr.length-1);
        for(int a : arr){
            System.out.println(a);
        }
    }

    public static void sort(int[] arr,int left ,int right){
        if(left >= right) {return;}
        int mid = quickSort(arr,left,right);
        sort(arr,left,mid-1);
        sort(arr,mid+1,right);
    }

    public static int quickSort(int[] arr,int leftBound,int rightBound){
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound-1;

        while(left<=right){
            while(left<=right && arr[left]<=pivot) {left++;}
            while(left<=right && arr[right]>pivot) {right--;}
            if(left<right){swap(arr,left,right);}
        }
        swap(arr,left,rightBound);
        return left;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
