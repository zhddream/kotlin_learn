package com.zhd.admin.kotlin.text

import org.junit.Test

//kotlin可以创建一个只包含数据的类,关键字为data
data class D_User(var name: String, var age: Int) {

}

/**
 * data数据类的用法
 */
//val jack = D_User(name = "jack", age = 45)
//val jack_son = jack.copy(age = 20)
//println("father is ${jack}")
//println("son is ${jack_son}")


//一下这种方式，神操作
//
//val jane = D_User("jane", 1)
//val (name, age) = jane
//println("$name , $age ,")
/**
 * 数据类以及结构申明
 */

//密封类

class D_Test {
    @Test
    fun test() {
    }
}