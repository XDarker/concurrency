package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.Recommend;
import com.xdarker.concurrency.annoations.ThreadSafe;

/**
 * 枚举模式 : 最安全的
 * 单例实例在类装载使用时进行创建
 * Created by XDarker
 * 2018/8/29 13:43
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    //私有空构造
    private SingletonExample7(){ }


    //静态工厂方法
    public  static SingletonExample7 getInstance(){

        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample7 singleton;
        // JVM保证这个方法只被调用一次
        Singleton(){
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance(){
            return singleton;
        }
    }

    public static void main(String[] args) {

        System.out.println(getInstance());
        System.out.println(getInstance());

    }
}
