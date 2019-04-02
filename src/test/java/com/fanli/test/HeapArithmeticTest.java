package com.fanli.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chenjie on 2016/7/21.
 */
public class HeapArithmeticTest {
    @Test
    public void siftDown() throws Exception {

    }

    @Test
    public void siftUp() throws Exception {

    }

    @Test
    public void display() throws Exception {

    }

    @Test
    public void creat() throws Exception {
        int [] array = new int[]{-1,1,4,3,2,6,5,9,8,7,2};
        HeapArithmetic.creat(array,array.length-1);
        HeapArithmetic.display(array);
    }

    @Test
        public void heapSort() throws Exception{
        int [] array = new int []{-1,1,6,2,3,5,76,234,63,6,234};
        HeapArithmetic.heapSort(array,array.length - 1);
        HeapArithmetic.display(array);
    }

}