package com.momo.learn.concurrent.lock;


import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConcurrentLock {

    Class<?> keyGenerate() default Object.class;
    Class<? extends AbstractLock> lockConfig() default DefaultLock.class;

}
