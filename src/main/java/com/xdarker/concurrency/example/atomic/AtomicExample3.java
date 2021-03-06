package com.xdarker.concurrency.example.atomic;

import com.xdarker.concurrency.annoations.ThreadSafe;
import com.xdarker.concurrency.annoations.UnThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by XDarker
 * 2018/8/27 22:31
 */
@Slf4j
@ThreadSafe
public class AtomicExample3 {

    //请求总数
    public static int clientTotal = 5000;

    //同时并执行的线程数
    public static int threadTotal = 200;

    /**
     * 高并发优先
     */
    public static LongAdder count = new LongAdder();

    public static void main(String[] args) throws Exception{

        ExecutorService executorService = Executors.newCachedThreadPool();

        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

        for (int i = 0; i< clientTotal; i++){
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                }catch (Exception e){
                    log.error("exeception",e);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        log.info("count:{}",count);

    }

    public static void add(){
        count.increment();
    }
}
