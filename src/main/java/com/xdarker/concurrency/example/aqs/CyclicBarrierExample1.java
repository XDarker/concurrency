package com.xdarker.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by XDarker
 * 2018/8/29 22:10
 */
@Slf4j
public class CyclicBarrierExample1 {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            Thread.sleep(1000);
            executorService.execute(() -> {
                try {
                    test(threadNum);
                } catch (Exception e) {
                    log.error("execption:{}",e);
                }finally {
                }
            });
        }
    }

    public static void test(int threadNum) throws Exception {
        Thread.sleep(1000);
        log.info("{} is ready",threadNum);
        cyclicBarrier.await();
        log.info("{} continue");
    }
}
