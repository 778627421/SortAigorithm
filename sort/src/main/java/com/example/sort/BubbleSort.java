package com.example.sort;

public class BubbleSort {

    //ð������
    public static void main(String[] args) {
        int [] a = {2,1,5,6,7,3,4,8};

        int [] b = sort(a);

        for(int i=0;i<b.length;i++){
            System.out.printf(""+b[i]);
        }

    }


    //ÿһ����������ķŵ������
    //���ѭ����ʾѭ������
    //�ڲ�ѭ����ʾ��������

    private static int[] sort(int[] a){

        int temp;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    //������
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }

}
