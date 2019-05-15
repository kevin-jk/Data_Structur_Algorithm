package com.kun.practise.algrithm.list;

import java.util.ArrayList;

/**
 * Created by jrjiakun on 2018/12/24
 */
public class MySingleList<E> implements MyList<E>{

    private MyNode head;
    private MyNode tail;

    public boolean add(E data) throws Exception{
        MyNode p = head, q= tail;
        if(p==null){
            p = new MyNode(data);
            q = p;
        }else{
            MyNode newNode = new MyNode(data);
            q.next = newNode;
            q = newNode;
        }
        //check
        if(p!=head||q!=tail){
            throw new Exception("链表被其他线程修改");
        }else{
            head = p;
            tail  = q;
        }
        return true;
    }

    public E delete(E data) {
        MyNode p = head, q= tail ,r = p;
        if(r==null){
            return null;
        }else{
            MyNode pre = null;
            while(r.next!=null&&!r.getData().equals(data)){
                pre = r;
                r = r.next;

            }
            ArrayList  s = new ArrayList();
            s.remove(1);
            // 头结点
            if(r==p){
               if(r!=head){

               }
               head = r.next;
               r.data = null;
                if(q==r){
                   tail = head;

                }
                return data;
            }
            //
            if(r==q){
                pre.next = null;
                tail = pre;
                r.data=null;
                return data;
            }

            pre.next  = r.next;
            r.next = null;
            r.data = null;
            return data;
        }
    }

    public int size() {
        return 0;
    }

    class MyNode<E>{
      private  E data;
        MyNode next;

       public  MyNode(E data){
           this.data  = data;
       }
        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }
    }

}
