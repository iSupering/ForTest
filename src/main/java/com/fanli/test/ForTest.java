package com.fanli.test;

/**
 * Created by chenjie on 2016/7/21.
 */
public class ForTest {
    public static void main(String [] args){
        for(int i = 101 ; i< 200;i++){
            int j;
            for(j = 2;j<i/2;j++){
                if(i%j == 0){
                    break;
                }
            }
            if(j >= i/2){
                System.out.println(i);
            }

//            System.out.println("this is a new Test haha");
        }
        //我感觉 我真的很喜欢 骂人呀，哇哈哈
        int s ;
        System.out.println("我是一只小小鸟，怎么飞也飞不高");

    }
}
