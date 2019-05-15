package com.kun.practise.algrithm.sort;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/13 11:20
 */
public class MergeSort extends AbstractSort {
    @Override
    void innerSort(int[] a, int length) {
        merge_inner(a,0,length-1);
    }

    private void merge_inner(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int q = (start + end) / 2;

        merge_inner(a, start, q);
        merge_inner(a, q + 1, end);
        merge(a, start, end, q);
    }

    private void merge(int[] a, int start, int end, int mid) {
        int[] temp1 = new int[end - start + 1];
        int low = start;
        int high = mid + 1;
        int index = start;
        while (low < mid && high < end) {
          if(a[low]<a[high]){
              temp1[index]=a[low];
              low++;
          }else {
              temp1[index]=a[high];
              high++;
          }
            index++;
        }

        // 判断哪个子数组中有剩余，然后拷贝

        if(low<mid){
          while(low<=mid){
              temp1[index++] = a[low++];
          }
        }else{
            while(high<=end){
                temp1[index++] = a[high++];
            }
        }

        //copy
        for(int i=start;i<end;i++){
            a[i] = temp1[i];
        }
    }
}
