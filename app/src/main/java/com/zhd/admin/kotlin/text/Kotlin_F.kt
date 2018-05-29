package com.zhd.admin.kotlin.text

import org.junit.Test

//kotlin泛型--泛型--即参数化类型，将类型参数化可以用在类接口方法上

//声明一个泛型
class Box<T>(t: T) {
    var value = t
}

//在使用泛型类是我们需要指定参数
//var boxInt = Box<Int>(1)
//var boxString = Box<String>("caonima")
//println(boxInt.value)
//println(boxString.value)

//注意泛型方法的定义位置
//fun <T> judge(t: T) {
//
//}


//泛型约束，我们可以使用泛型约束来设定一个给定参数允许使用的类型 。
//kotlin中使用，对泛型的类型上线进行约束
//最常见的约束是上界(upper bound) 什么蛇皮操作





class F_Test {
    fun <T> judge(t: T) {
        when (t) {
            is Int -> println("是Int")
            is String -> println("$t 是String")
            else -> {
                println("瞎几把乱书")
            }
        }
    }


    @Test
    fun test() {
        judge("轻轻的我走了")
    }
}