package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.UnThreadSafe;

/**
 * 懒汉模式
 * 单例实例第一次使用时开始创建
 * 线程不安全
 * Created by XDarker
 * 2018/8/29 13:43
 */
@UnThreadSafe
public class SingletonExample1 {

    //私有空构造
    private SingletonExample1(){ }

    //单例对象
    private static SingletonExample1 instance = null;

    //静态工厂方法
    public  static SingletonExample1 getInstance(){

            if (instance == null){
                instance =  new SingletonExample1();
            }
            return instance;
    }
}
