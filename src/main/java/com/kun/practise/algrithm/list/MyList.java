package com.kun.practise.algrithm.list;

/**
 * Created by jrjiakun on 2018/12/24
 */
public interface MyList<K> {
    boolean add(K data) throws Exception;
    K delete(K data);
    int size();
}
