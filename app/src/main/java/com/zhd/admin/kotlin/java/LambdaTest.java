package com.zhd.admin.kotlin.java;

import org.junit.Test;

/**
 * lambda 学习
 * <p>
 * 这篇博客不错  https://www.zhihu.com/question/20125256/answer/324121308
 */
public class LambdaTest {
    MyLambdaInterface mBlock = (s) -> System.out.print(s);


    public void ecact(MyLambdaInterface myLambdaInterface, String string) {
        myLambdaInterface.doSomeShift(string);
    }

    @Test
    public void test() {
        ecact(str -> System.out.print(str), "");
    }
}
