package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.ThreadSafe;
import com.xdarker.concurrency.annoations.UnRecommend;

/**
 * 懒汉模式（线程安全）
 * 单例实例第一次使用时开始创建
 * 线程不安全
 * Created by XDarker
 * 2018/8/29 13:43
 */
@ThreadSafe
@UnRecommend
public class SingletonExample3 {

    //私有空构造
    private SingletonExample3(){ }

    //单例对象
    private static SingletonExample3 instance = null;

    //静态工厂方法
    public  static synchronized SingletonExample3 getInstance(){

            if (instance == null){
                instance =  new SingletonExample3();
            }
            return instance;
    }
}
