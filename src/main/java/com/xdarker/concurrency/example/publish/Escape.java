package com.xdarker.concurrency.example.publish;
import com.xdarker.concurrency.annoations.UnRecommend;
import com.xdarker.concurrency.annoations.UnThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by XDarker
 * 2018/8/29 13:35
 */
@Slf4j
@UnThreadSafe
@UnRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape(){
        new InnerClass();
    }

    public class InnerClass{
        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
