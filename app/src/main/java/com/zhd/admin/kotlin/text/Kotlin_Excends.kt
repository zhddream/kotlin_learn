package com.zhd.admin.kotlin.text

import org.junit.Test

//kotlin中所有类都继承Any类，他是所有的类的超类，对于没有超类型生命的类是默认超类
class example //默认继承any类

//any类默认提供了三个函数
//equals()
//hashcode()
//toString()
//注意：any不是java.lang.Object
//如果一个类要被继承，它必须被open关键字修饰

open class Base(p: Int)//基类

class Deriver(p: Int) : Base(p)//子类


//子类中存在构造函数

open class MyPerson(var name: String, var pwd: String) {

}

/**
 * 子类中包含主函数，必须在子类的主函数中生命父类的参数
 * kotlin 会默认分配get和set方法
 */
class Student(name: String, pwd: String, var age: Int) : MyPerson(name, pwd) {

}

/**
 * 子类中不存在主构造函数 ,必须在次级构造函数中，对基类的东西初始化,草泥马的语法
 */

class Student2 : MyPerson {
    constructor(name: String, pwd: String) : super(name, pwd) {

    }
}

open class MyPerson2(name: String) {
    constructor(name: String, age: Int) : this(name) {
        println("")
    }
}

class mStudent : MyPerson2 {
    constructor(name: String, age: Int, score: String) : super(name, age) {

    }
}

/**
 * kotlin中的重写
 * kotlin 中,class和fun默认是final的，因此不可被继承或重写，想重写或实现继承，需要手动添加open关键字
 *
 */

open class MyPerson3 {
    open fun study() {
        println("轻轻的我走了,正如我轻轻地来,我轻轻的招手，作别西天的云彩")
    }
}

/**
 * 当子类继承父类时，必须加上构造，随便哪个地方总之要加上
 */
class mStudent1 : MyPerson3 {
    constructor()

    override fun study() {
        super.study()
        println("那河畔的金柳，是夕阳中的新娘，波光里的艳影，在我的心头荡漾")
    }
}


/**
 * 多个方法的重写
 */

open class A {
    open fun f() {
        println("I'm class A's method")
    }
}

/**
 * 接口的默认方法是open的
 */
interface B {

    fun f() {
        println("B")
    }
}

class C : A, B {
    constructor()

    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

/**
 * 属性重写
 *
 */
//你可以用一个var属性重写一个val属性，
// 但是反过来不行。因为val属性本身定义了getter方法，
// 重写为var属性会在衍生类中额外声明一个setter方法
open class Foo {
    open val x: Int = 1

}

class aaa : Foo() {
    override val x: Int = 2
}

/**
 * 骚操作
 */
//你可以在主构造函数中使用 override 关键字作为属性声明的一部分
interface MFoo {
    var count: Int
}

class Bar1(override var count: Int) : MFoo


class Bar2 : MFoo {
    override var count = 0
}

/**
 * val为不可变变量 类似于Java中的final，只可被初始化一次，因此，不存在set方法,只有get方法
 */
class Caonma(var name: String, val pwd: String) {
}


class MyTest() {

    @Test
    fun mTest() {
        val caonma = Caonma("张三", "123456")
        println("get ${caonma.name}")
        println("get ${caonma.pwd}")
    }
}