package com.example.sort;

public class BubbleSort {

    //冒泡排序
    public static void main(String[] args) {
        int [] a = {2,1,5,6,7,3,4,8};

        int [] b = sort(a);

        for(int i=0;i<b.length;i++){
            System.out.printf(""+b[i]);
        }

    }


    //每一次排序把最大的放到最后面
    //外层循环表示循环次数
    //内层循环表示交换次数

    private static int[] sort(int[] a){

        int temp;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    //做交换
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }

}
