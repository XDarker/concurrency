package com.xdarker.concurrency.example.immutable;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

/**
 * Created by XDarker
 * 2018/8/29 14:22
 */
public class ImmutableExample2 {


    private  static Map<Integer,Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map = Collections.unmodifiableMap(map); //不可以再修改
    }

    public static void main(String[] args) {

        //基础类型 不能修改

        //引用类型  引用对象指向不可修改 值可以修改
        // map = Maps.newHashMap();  不可修改

        map.put(1,3);
        System.out.println(map.get(1));
    }

}
