package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.ThreadSafe;
/**
 * 饿汉模式
 * 单例实例z在类装载使用时进行创建
 * Created by XDarker
 * 2018/8/29 13:43
 */
@ThreadSafe
public class SingletonExample2 {

    //私有空构造
    private SingletonExample2(){ }

    //单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    //静态工厂方法
    public  static SingletonExample2 getInstance(){
            return instance;
    }
}
