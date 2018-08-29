package com.xdarker.concurrency.example.atomic;

import com.xdarker.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by XDarker
 * 2018/8/27 22:31
 */
@Slf4j
@ThreadSafe
public class AtomicExample5 {

    @Getter
    private volatile int count = 100;

    private static AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class,"count");

    private static AtomicExample5 example5 = new AtomicExample5();

    public static void main(String[] args) {

        if (updater.compareAndSet(example5,100,120)){
            log.info("updater success1,{}",example5.getCount());
        }

        if (updater.compareAndSet(example5,100,120)){
            log.info("updater success2,{}",example5.getCount());
        }else {
            log.info("updater failed,{}",example5.getCount());
        }
    }
}
