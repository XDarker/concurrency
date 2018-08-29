package com.xdarker.concurrency.example.publish;

import com.xdarker.concurrency.annoations.UnThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by XDarker
 * 2018/8/29 13:29
 */
@Slf4j
@UnThreadSafe
public class UnSafePublish {

    private String[] states = {"a", "b", "c"};

    private String[] getStates() {
        return states;

    }

    public static void main(String[] args) {
        UnSafePublish unSafePublish = new UnSafePublish();
        log.info("{}", Arrays.toString(unSafePublish.getStates()));

        unSafePublish.getStates()[0] = "d";
        log.info("{}", Arrays.toString(unSafePublish.getStates()));

    }
}