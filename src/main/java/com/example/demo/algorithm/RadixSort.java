package com.example.demo.algorithm;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 15:37 2020/10/12
 */
public class RadixSort {

    public static void main(String[] args){

        int[]data =
                {73, 22, 93, 43, 55, 14, 28, 65, 39, 81, 33, 100};
        RadixSort.radixSort(data, 3);
        for(int i = 0; i < data.length; i++)
        {
            System.out.println(data[i] + "");
        }

    }

    public static void radixSort(int[] arr,int d){
        int k = 0;
        int n = 1;
        int m = 1; //控制键值排序依据在哪一位
        int[][] temp = new int[10][arr.length]; //数组的第一维表示可能的余数0-9
        int[] order = new int[10]; //数组orderp[i]用来表示该位是i的数的个数
        while(m <= d)
        {
            for(int i = 0; i < arr.length; i++)
            {
                int lsd = ((arr[i] / n) % 10);
                temp[lsd][order[lsd]] = arr[i];
                order[lsd]++;
            }
            for(int i = 0; i < 10; i++)
            {
                if(order[i] != 0)
                    for(int j = 0; j < order[i]; j++)
                    {
                        arr[k] = temp[i][j];
                        k++;
                    }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
            m++;
        }

    }

}
