package com.zhd.admin.kotlin.text

import org.junit.Test

/**
 * 默认
 */
interface MyIFace {
    fun bar()//未实现
    fun foo() {//已经实现
        println("该方法在接口中，并且已经实现")
    }
}

class Child : MyIFace {
    override fun bar() {//未实现的接口必须在实现类中加以实现

    }
}


/**
 * 接口中的属性只能是抽象的不允许初始化值，接口不会保存属性值，实现接口是，必须重写属性
 */
interface MyIFace2 {
    var name: String
}

class Child2(override var name: String) : MyIFace2 {
}

//函数重写,实现多个接口时，可能会遇到同一方法继承多个实现的问题
interface A2 {
    fun foo() {
        println("from  A2")
    }

    fun bar()
}

interface B2 {
    fun foo() {
        println("from B2")
    }

    fun bar() {
        println("bar from B2")
    }

}


class D : A2, B2 {

    /**
     * 重写bar方法,多个方法出现名字相同，使用super<name>.method()  加以区分
     */
    override fun foo() {
        super<A2>.foo()
        super<B2>.foo()
    }

    override fun bar() {
        super.bar()
    }
}


class User(var name: String)

fun User.Print() {

    println(name)
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}


/**
 * 扩展函数
 */

open class C2

class D2 : C2()

fun C2.foo() = "c2"

fun D2.foo() = "d2"

/**
 * 父类和子类同事扩展函数，调用时（面向对象思想，传递进去的是子类）,优先调用父类的方法
 * 我们在调用子类的时候，父类中已经存在了一个一样的方法，此时，父类中的扩展方法相当于成员函数
 * 在调用扩展函数时，具体被调用的是哪一个函数，由调用函数的对象表达式来决定的，而不是由动态的类型决定的
 *
 */
fun printFoo(c2: C2) {
    println(c2.foo())
}

open class C3 {
    fun show() {
        println("这是成员函数")
    }
}

fun C3.show() {
    println("这是扩展函数")
}


/**
 * 扩展一个空对象,有个鸡儿的意义啊
 */

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}
//var  str=null
//println(str.toString())


//扩展属性
/**
 * 扩展属性允许定义在类或者kotlin文件中，不予许定义在函数中。
 * 初始化属性因为属性没有后端字段（backing field）
 * 所以不循序被初始化，只能有显示提供的gettter/setter定义
 * 扩展属性只能定义为val
 */
val <T> List<T>.laseIndex: Int
    get() = size - 1

/**
 * 半生对象的扩展(Java中的static)
 */
class MyClass {
    companion object {
        fun foo() {
            println("这是成员方法")
        }
    }
}

fun MyClass.foo() {
    println("这是伴生对象的扩展方法")
}


/**
 * 在一个类中使用扩展另一个类的函数
 * 在A类中对B类进行扩展，B类的扩展方法可以直接调用A类的方法，
 * 同时也可以直接调用B类的方法，nice
 */

class D3 {
    fun bar() {
        println("this is D3.bar")
    }
}


class C4 {
    fun baz() {
        println("this is C4.baz")
    }

    fun D3.foo() {
        bar()
        baz()
    }

    fun show(d: D3) {
        d.foo()
    }
}

/**
 * 以成员的形式定义的扩展函数，可以声明未open，而且可以在子类中覆盖，
 * 也就是说，在这类扩展函数的派发过程中
 * 针对分发接收者是虚拟的，但针对扩展接受者仍然是静态的
 * 对于重写的方法优先调用重写的，扩展方法，优先调用成员方法，扩展方法次级调用
 */

open class DD {
}

class DD1 : DD() {
}

open class CC {
    open fun DD.foo() {
        println("DD.foo in c")
    }

    open fun DD1.foo() {
        println("dd1.foo in c")
    }
}

class IFaceTest() {
    @Test
    fun test() {
    }
}
