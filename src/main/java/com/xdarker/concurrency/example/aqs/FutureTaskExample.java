package com.xdarker.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * Created by XDarker
 * 2018/9/1 13:48
 */
@Slf4j
public class FutureTaskExample {

    public static void main(String[] args) throws Exception {

    FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
        @Override
        public String call() throws Exception {
            log.info("正在do");
            Thread.sleep(5000);
            return "do!!!";
        }
    });

    new Thread(futureTask).start();
    log.info("哈哈哈");
    Thread.sleep(2000);
    String result = futureTask.get();
    log.info("result: {}",result);


    }
}
