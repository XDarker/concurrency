package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载使用时进行创建
 * Created by XDarker
 * 2018/8/29 13:43
 */
@ThreadSafe
public class SingletonExample6 {

    //私有空构造
    private SingletonExample6(){ }

    //单例对象
    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }



    //静态工厂方法
    public  static SingletonExample6 getInstance(){
            return instance;
    }

    public static void main(String[] args) {

        System.out.println(getInstance());
        System.out.println(getInstance());

    }
}
