package com.example.demo.algorithm;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * @author : xuewensheng
 * @version ：1
 * @data : Created in 15:44 2020/9/21
 */
public class DataCheck {

    static int[] generateRandomArray(){
        SecureRandom random = new SecureRandom();

        int[] arr = new int[10];
        for(int i = 0;i < arr.length;i++){
            arr[i] = random.nextInt();
        }
        return arr;
    }

    static void check(){
       int[] arr = generateRandomArray();
       int[] arr2 = Arrays.copyOf(arr,10);

       Arrays.sort(arr);
       SelectionSort.sort(arr2);

       boolean same = true;
       for(int i=0 ; i < arr2.length; i++){
           if(arr[i] != arr2[i]) {
               same = false;
           }
       }
       System.out.println(same);
    }

    public static void main(String[] args){
        check();
    }
}
