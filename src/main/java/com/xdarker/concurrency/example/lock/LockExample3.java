package com.xdarker.concurrency.example.lock;

import com.xdarker.concurrency.annoations.ThreadSafe;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by XDarker
 * 2018/8/27 22:31
 */
@Slf4j
@ThreadSafe
public class LockExample3 {

    private final TreeMap<String, Data> map = new TreeMap();

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();


}
