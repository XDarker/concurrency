package com.xdarker.concurrency.demo;

import java.util.concurrent.Semaphore;

/**
 * Created by XDarker
 * 2018/8/28 13:42
 */
public class SemaphoreDemo {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(4,false);
        try {
            // 从信号量中获取一个允许机会
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " start at " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " stop at " + System.currentTimeMillis());
            // 释放允许，将占有的信号量归还
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
