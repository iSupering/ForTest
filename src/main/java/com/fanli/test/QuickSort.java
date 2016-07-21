package com.fanli.test;

/**
 * Created by chenjie on 2016/7/11.
 */
public class QuickSort {

    public static void main(String[] args) {
//        int array[] = new int[]{1, 4, 234, 12, 35, 32, 5, 12};
//        int array[] = new int[]{1, 4, 234, 12, 35, 32, 5, 12};
        int array[] = new int[]{3,3,3,3,5,5,5,5,4,4,4,4,0};
        sayHello(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sayHello(int[] array, int sIndex, int fIndex) {
        if (sIndex >= fIndex || sIndex < 0 || fIndex >= array.length) {
            return;
        }
        int i = sIndex;
        int j = fIndex;
        int key = array[sIndex];
        while (i < j) {
            while (array[i] < key)  {
                i++;
                if( i > fIndex){
                    break;
                }
            }
            while (array[j] > key ){
                j--;
                if(j < sIndex){
                    break;
                }
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        sayHello(array, sIndex, i-1);
        sayHello(array, j+1, fIndex);
    }
}
