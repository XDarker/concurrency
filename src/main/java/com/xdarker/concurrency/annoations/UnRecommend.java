package com.xdarker.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 【不推荐】类或者写法 注解  标示
 * Created by XDarker
 * 2018/8/27 21:17
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)   //运行范围
public @interface UnRecommend {

    String value() default "";
}
