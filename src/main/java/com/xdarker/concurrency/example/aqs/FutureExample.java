package com.xdarker.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by XDarker
 * 2018/9/1 13:48
 */
@Slf4j
public class FutureExample {

    static class Myallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            log.info("正在do");
            Thread.sleep(5000);
            return "do!!!";
        }

        public static void main(String[] args) throws Exception {
            ExecutorService executorService = Executors.newCachedThreadPool();
            Future<String> future = executorService.submit(new Myallable());
            log.info("do something");
            Thread.sleep(1000);
            String result = future.get();
            System.out.println(result);
        }
    }
}
