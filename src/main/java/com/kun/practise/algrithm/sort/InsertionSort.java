package com.kun.practise.algrithm.sort;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/2 10:47
 *
 * 插入排序
 */
public class InsertionSort extends AbstractSort {
    @Override
    void innerSort(int[] a, int length) {
        for(int i =1;i<length-1;i++){
            int temp = a[i];
            int j=i-1;
            for(;j>=0;j--){
                if(temp<a[j]){
                   a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = temp;
        }
    }
}
