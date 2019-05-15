package com.kun.practise.algrithm.list;

import java.util.Arrays;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/3 15:08
 */
public class MainThread {
    public static void main(String[] args) {
        Resource resource = new Resource();
        byte[] resourceContainer = resource.getResouceByte();
        resourceContainer[0] = 1;
        System.out.println(Arrays.toString(resourceContainer));
    }
}
