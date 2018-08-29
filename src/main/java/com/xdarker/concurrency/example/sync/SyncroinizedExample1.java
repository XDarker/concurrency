package com.xdarker.concurrency.example.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by XDarker
 * 2018/8/29 13:00
 */
@Slf4j
public class SyncroinizedExample1 {

    //修饰一个代码块  锁住的是对象
    public void test1(){

        synchronized (this){
            for (int i = 0; i < 10; i++){
                log.info("test1-{}",i);
            }
        }
    }
    //修饰一个方法
    public synchronized void test2(){
        for (int i = 0; i < 10; i++){
            log.info("test1-{}",i);
        }
    }

    public static void main(String[] args) {
        SyncroinizedExample1 syncroinizedExample1 = new SyncroinizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() -> {
            syncroinizedExample1.test1();
        });
        executorService.execute(() -> {
            syncroinizedExample1.test1();
        });
    }
}
