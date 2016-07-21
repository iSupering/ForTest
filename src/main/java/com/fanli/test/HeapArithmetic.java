package com.fanli.test;

/**
 * Created by chenjie on 2016/7/21.
 */
public class HeapArithmetic {

    public static void siftDown(int[] array, int n, int i) {
        if (n < 2 * i) {
//            System.out.println(("节点" + i + "是一个叶节点不需要往下调整..."));
            return;
        }
        int left = array[i * 2];
        int root = array[i];
        int index = -1;
        if (left < root) {
            index = 2 * i;
        }
        if (2 * i + 1 <= n) {
            if (array[2 * i + 1] < left && index != -1) {
                index = index + 1;
            }
        }
        if (index != -1) {
            swap(array, i, index);
            siftDown(array, n, index);
        }
    }

    public static void siftUp(int[] array, int n, int i) {
        if (i == 1) {
//            System.out.println(("已经往上调整至根结点，调整完毕..."));
            return;
        }
        int root = i / 2;
        if (array[root] > array[i]) {
            swap(array, root, i);
            siftUp(array, n, root);
        }
    }

    private static void swap(int[] array, int i, int j) {
        array[i] = array[j] + array[i];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

    public static void display(int[] array) {

        if (array != null) {
            int j = 1;
            int tmp = 1;
            while (j < array.length) {
                for (int i = 0; i < tmp; i++) {
                    System.out.print((array[j] + " "));
                    j++;
                    if (j >= array.length) {
                        break;
                    }
                }
                System.out.println();
                tmp *= 2;
            }
        }
    }

    public static void creat(int[] array, int n) {
        for (int i = n / 2; i > 0; i--) {
            siftDown(array, n, i);
        }
    }
}
