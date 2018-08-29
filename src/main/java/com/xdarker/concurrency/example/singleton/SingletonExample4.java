package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.UnThreadSafe;

/**
 * 懒汉模式  -》 双重同步锁单例模式
 * 单例实例第一次使用时开始创建
 * 线程不安全
 * Created by XDarker
 * 2018/8/29 13:43
 */
@UnThreadSafe
public class SingletonExample4 {

    //私有空构造
    private SingletonExample4(){ }

    //单例对象
    private static SingletonExample4 instance = null;

    //1 memoty = allocate() 分配对象的内存空间
    //2 ctorInstance() 初始化对象
    //3 instance = memory 设置instance指向刚分配的内存

    //JVM CPU优化 发生了指令重排序
//        执行顺序发生变化

    //静态工厂方法
    public  static SingletonExample4 getInstance(){

            if (instance == null){//双重检测机制
                synchronized (SingletonExample4.class) {
                    if (instance == null) {
                        instance = new SingletonExample4();
                    }
                }
            }
            return instance;
    }
}
