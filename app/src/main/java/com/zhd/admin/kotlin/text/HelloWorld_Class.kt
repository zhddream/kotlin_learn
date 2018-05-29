package com.zhd.admin.kotlin.text

import org.junit.Test
import javax.security.auth.Subject

/**
 * 定义类
 */
class Runoob {

}

/**
 * 定义空类
 */
class Empty

/**
 * 定义类并添加方法
 */
class Runoob2 {
    fun foo() {
        print("")
    }
}

/**
 * 创建带属性的类
 */
class Runoob3 {
    var name: String = "徐志摩"
    var url: String = "www.baidu.com"
    var city: String = "康桥"
}

/**
 * 创建带构造器的类--主构造器 在类名的后面
 */

class Runoob4 constructor(name: String) {

}

/**
 *测试get和set方法，系统会默认生成get  和  set
 */
class Person {
    var lastName: String = "zhang"
        get() = field.toUpperCase()//将变量赋值后转换为大写
        set
    var no: Int = 100
        get() = field
        set(value) {
            if (value > 10) {
                field = value
            } else {
                field = -1
            }
        }

    var height: Float = 145.4f
        private set
}

class TestSubject {

}

/**
 * 测试 初始化代码的功能,主构造器中不能包含任何代码，初始化代码可以放在初始化代码段中，初始化代码使用init作为关键字
 */
class Person2 constructor(name: String) {
    init {
        print("name is $name")
    }
}

/**
 * 测试构造函数中传递值然后在类中直接使用
 */
class Person3 constructor(name: String) {
    var url: String = "http://www.baidu.com"
    var county: String = "中国"
    var siteName = name

    init {
        println("初始化网站名:$name")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

/**
 * 次级构造函数
 */
class Person4 {
    constructor(parent: String) {
    }
}


/**
 * 主构造函数和刺激构造函数
 *
 * 如果类中同时存在主构造和次构造函数，次构造函数必须代理主构造函数(使用  this  关键字   :this(name))
 */
class Person5 constructor(name: String) {
    constructor(name: String, pwd: String) : this(name) {

    }
}

/**
 * 测试  构造函数设置为private   在写单例模式的时候可以用到
 *
 *  val person6=Person6.getInstance()    person6.testP()
 */
class Person6 private constructor() {

    /**
     * 静态方法，单利模式
     */
    companion object {
        fun getInstance(): Person6 {
            return Person6()
        }
    }

    public fun getInstance(): Person6 {
        return Person6()
    }

    fun testP() {
        println("神兽草泥马")
    }
}

/*测试抽象类*/
/**
 * kotlin中所有的类默认是final  的，使用open  是的base类可以被其他类继承
 * 其他和Java中挺像的
 */
open class BaseClass {
    open fun test() {}
}

abstract class Derived : BaseClass() {
    override abstract fun test()
}

/*测试抽象类*/

/**
 *测试嵌套类
 */
class Out() {
    private val bar: Int = 1

    class Nested {
        fun foo(): Int {
            return 2
        }
    }
}

/**
 * 测试内部类,这段在教程上属于SB操作
 *
 * 内部类默认可以持有外部类的引用所以内部类可以直接访问外部类的属性
 */
class Out2() {
    private var bar: Int = 1
    var v = "成员属性"

    /**
     * 内部类,内部类将持有外部类的引用,所以，内部类可以直接访问外部类
     */
    inner class CaoNiMa {
        fun foo() = bar
        fun testInner() {
            var o = this@Out2
            println("内部类可以引用外部类的成员，例如" + o.v)
        }
    }
}

/**
 * 接口回调,重点来了
 *
 *
 *
 */
class Test2 {

    //这种操作，实例化匿名内部类的时候需要先写个object，谢特
//    val testInterFace = Test2()
//    testInterFace.setFace(object : Test2.TestInterFace{
//        override fun test() {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//    })

    var v = "成员属性"

    fun setFace(testInterFace: TestInterFace) {
        testInterFace.test()
    }

    interface TestInterFace {
        fun test()
    }

}

/*类的修饰符*/
// abstract  抽象类
// final  类不可继承，默认属性
//  enum  枚举类型
//open  设置该类可被继承
// annotation 注解类

class test {

    /**
     * 实例化类对象
     */
    fun createClass() {

        var runoob3 = Runoob3()//第一种
        runoob3.city
    }

    @Test
    fun test() {

        val testInterFace = Test2()
        testInterFace.setFace(object : Test2.TestInterFace {
            override fun test() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}