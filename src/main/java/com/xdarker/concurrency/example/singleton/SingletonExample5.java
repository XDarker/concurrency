package com.xdarker.concurrency.example.singleton;

import com.xdarker.concurrency.annoations.ThreadSafe;
/**
 * 懒汉模式  -》 双重同步锁 + volatile 单例模式
 * 单例实例第一次使用时开始创建
 * 线程不安全
 * Created by XDarker
 * 2018/8/29 13:43
 */
@ThreadSafe
public class SingletonExample5 {

    //私有空构造
    private SingletonExample5(){ }

    //单例对象   volatile禁止指令重排序  可见性
    private volatile static SingletonExample5 instance = null;

    //1 memoty = allocate() 分配对象的内存空间
    //2 ctorInstance() 初始化对象
    //3 instance = memory 设置instance指向刚分配的内存

    //JVM CPU优化 发生了指令重排序
//        执行顺序发生变化

    //静态工厂方法
    public  static SingletonExample5 getInstance(){

            if (instance == null){//双重检测机制
                synchronized (SingletonExample5.class) {
                    if (instance == null) {
                        instance = new SingletonExample5();
                    }
                }
            }
            return instance;
    }
}
