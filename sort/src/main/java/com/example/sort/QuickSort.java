package com.example.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };

        quicksort(arr,0,arr.length-1);

        for(int item:arr){
            System.out.printf(item+",");
        }

    }


    private static void quicksort(int[] a,int low,int high){

        //先取一个基准数

        //定义 两个指针high,low
        //使用递归 持续 1过程和2过程
        //1过程:从队尾开始，如果末尾值<base,把a[low] = a[high],如果末位置>=base,high--;
        //2过程:从队头开始，如果队头值<=base,low++,如果队头值>base,把a[high] = a[low];
        //当low>=high是,结束上述过程

        if(low<high){

            int base = getBaseNum(a,low,high);

            quicksort(a,0,base-1);

            quicksort(a,base+1,high);

        }


    }


    private static int getBaseNum(int[] a,int low,int high){

        int temp = a[low];

        while(low<high){
            while (low < high && a[high]>=temp)
                high--;

            a[low] = a[high];


            while (low < high && a[low]<=temp)
                low++;

            a[high] = a[low];
        }

        //循环结束，low的值不等于temp;需要把temp给low

        a[low] = temp;


        return low;
    }





}
