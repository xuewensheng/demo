package com.example.demo.algorithm;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 16:23 2020/9/29
 */
public class MergeSort {

    public static void mergeSort(int[] arr,int leftPoint,int rightPoint,int rightBound){
     int mid = rightPoint-1;
     int i = leftPoint;
     int j = rightPoint;
     int k = 0;
     int[] temp = new int[rightBound-leftPoint+1];
     while(i<=mid && j<=rightBound){
        if(arr[i]<arr[j]){
            temp[k] = arr[i];
            k++;
            i++;
        }else{
            temp[k] = arr[j];
            k++;
            j++;
        }
     }
     while(i<=mid) {
         temp[k++] = arr[i++];
     }
     while(j<=rightBound){
         temp[k++] = arr[j++];
     }
        for(int m=0;m<temp.length;m++){
            arr[leftPoint+m] = temp[m];
        }
    }

    public static void sort(int[] arr,int left,int right){
        if(left == right) {
            return;
        }
        int mid = left+(right-left)/2;
        //左边排序
        sort(arr,left,mid);
        //右边排序
        sort(arr,mid+1,right);

        mergeSort(arr,left,mid+1,right);
    }

    public static void main(String[] args){
        int[] arr = {3,4,8,9,2,5,7,8,9};
        sort(arr,0,arr.length-1);
        for(int a : arr){
            System.out.println(a);
        }
    }
}
