package com.example.sort;

public class InsertSort {
    //插入排序，稳定， n方

    public static void main(String[] args) {

        int [] a = {2,1,5,6,7,3,4,8};

        int [] b = insertSort(a);

        for(int item:b){
            System.out.printf(""+item);
        }

    }



    //把一个数 和 一个有序数列的末尾数 做比较，大的在后面，小的往前插

    private static int[] insertSort(int[] a){
        int temp; //temp的作用是 哨兵，要插入的数

        for(int i = 1;i<a.length;i++){//i循环控制的是那个待排序的数列
            if(a[i]<a[i-1]){//如果后面的数小于它前面的数，就插入，做升序排列
                temp = a[i];//默认第一个数是有序的，哨兵给第二个数。
                for(int j=i;j>=0;j--) {//j循环控制的是那个有序数列，这里要注意数组的下标从0开始的。
                    if (j > 0 && a[j-1] > temp) {  //如果有序数列的末位数大于待插入的这个数，
                        a[j] = a[j - 1];//末位数后移
                    } else {
                        a[j] = temp; //直到插入的这个数比有序数列的每一位都小，那我就把temp放进去
                        break;
                    }
                }
            }
        }

        return a;
    }

}
