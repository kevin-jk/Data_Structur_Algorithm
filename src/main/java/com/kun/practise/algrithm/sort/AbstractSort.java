package com.kun.practise.algrithm.sort;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/2 10:21
 */
public abstract class AbstractSort implements Sort {
    public void sort(int[] a) {
       if(null==a|| a.length<2){
           return;
       }
       innerSort(a,a.length);
    }

    /**
     * 不同的排序方法实现排序逻辑
     *
     * @param a 待排序的数组
     * @param  length 待排序数组的长度
     * @Return void
     * */
   abstract void innerSort(int[]a,int length);

    protected void swap(int []a, int start, int end){
        int t = a[start];
        a[start] = a[end];
        a[end] = t;
    }
}
