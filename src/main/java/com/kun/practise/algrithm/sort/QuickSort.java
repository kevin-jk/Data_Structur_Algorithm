package com.kun.practise.algrithm.sort;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/14 9:50
 */
public class QuickSort extends AbstractSort {
    @Override
    void innerSort(int[] a, int length) {
        quckSort(a,0,length-1);
    }

    private void quckSort(int []a, int start,int end){
        if(start>=end){
            return;
        }
        int pos = partition(a,start,end);
        quckSort(a,start,pos-1);
        quckSort(a,pos+1,end);
    }

    private int partition(int a[],int start, int end){
        int target = a[start];
        int low = start+1;
        int high = end;
        while(low<high){
            while(low<high&&a[high]>target){
                high--;
            }
            a[low] = a[high];
            while(low<high&&a[low]<target){
                low++;
            }
            a[high] = a[low];
        }
        a[low]= target;
        return low;
    }
}
