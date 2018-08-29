package com.xdarker.concurrency.example.atomic;

import com.xdarker.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Created by XDarker
 * 2018/8/27 22:31
 */
@Slf4j
@ThreadSafe
public class AtomicExample6 {

    private static AtomicBoolean isHappend = new AtomicBoolean(false);

    public static void main(String[] args) {

        for (int i = 0; i<10; i++) {
            if (isHappend.compareAndSet(false, true)) {
                log.info("isHappender", isHappend.get());
            }
        }
    }
}
