package com.xdarker.concurrency.example.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.Map;

/**
 * Created by XDarker
 * 2018/8/29 14:22
 */
public class ImmutableExample3 {


    private final static ImmutableList list = ImmutableList.of(1,2,3);

    private final static ImmutableSet set = ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer,Integer> map = ImmutableMap.of(1,2,3,4);

    public static void main(String[] args) {


    }

}
