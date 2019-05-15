package com.kun.practise.algrithm.sort;

import java.util.Arrays;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/2 10:21
 *
 * 空间复杂度：O(1)
 * 稳定
 * 时间复杂度 O(n~2)
 *
 * 最好的情况： 已经有序，1次冒泡
 * 最坏的情况：完全倒序， 6次冒泡
 *
 */
public class BubbleSort extends AbstractSort {
    @Override
    void innerSort(int[] a, int length) {
        for(int i=length-1;i>0;i--){
            boolean changeFlag = false;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    changeFlag = true;
                    swap(a,j,j+1);
                }
            }
            System.out.println(Arrays.toString(a));
            if(!changeFlag){
                break;
            }
        }
    }



    public static void main(String []args){
        int a[] = new int []{4,5,6,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
    }
}
