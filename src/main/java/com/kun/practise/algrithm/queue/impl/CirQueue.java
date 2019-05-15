package com.kun.practise.algrithm.queue.impl;

import com.kun.practise.algrithm.queue.Queue;

/**
 * @Author: jrjiakun
 * @Date: 2019/1/28 17:10
 */
public class CirQueue<T> implements Queue<T> {
    private T[] table;
    private int capicity;


    private int head;

    private int tail;


    public T outQueue() {
        //队列为空
        if (head == tail) {
            return null;
        }
        T ele = table[head];
        table[head]=null;
        head++;
        //当队列用完后，循环使用
         head = head % capicity;
         //old code
//        if (head == capicity) {
//            head = 0;
//        }
        return ele;
    }

    public boolean enQueue(T data) {
        if (capicity == 0) {
            table = (T[]) new Object[2];
            capicity = 2;
            head = tail = 0;
        }
        if (null == data) {
            return false;
        }
        // 队列满
        // bug 1
        if ((tail + 1) % capicity == head) {
            explandTable(data);
        } else {
            table[tail++] = data;
            if(tail==capicity){
                tail = 0;
            }
        }
        return true;
    }

    private boolean explandTable(T data) {
        int oldCapcity =  capicity;
        capicity<<=1;
        T[] tempTable = (T[]) new Object[capicity];
        table = tempTable;
        int start = head;
        int end = tail;
        int index = 0;
        while (start != end) {
            tempTable[index] = table[start++];
            // bug 2
             start = start % oldCapcity;
             // old code
//            if ((start == oldCapcity-1)&&start!=end) {
//                start = 0;
//            }
            index++;
        }
        tempTable[index] = data;
        head = 0;
        tail = ++index;
        return true;
    }

    public static void main(String[] args) {
        CirQueue<Integer> cirQueue = new CirQueue();
        cirQueue.enQueue(1);
        cirQueue.enQueue(2);
        cirQueue.outQueue();
        cirQueue.enQueue(3);
        cirQueue.enQueue(4);
        cirQueue.outQueue();
        cirQueue.enQueue(5);
    }
}
