package com.zhd.admin.kotlin.text

import android.os.Build
import android.text.TextUtils
import org.junit.Test

/**
 * kotlin基础语法学习
 */
class HelloWorld {
    /**
     * 返回值可以直接写在参数列表后面
     */
    fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 直接在方法后面写 =  骚操作
     */
    fun sum2(a: Int, b: Int) = a + b

    /**
     *无返回值函数Unit，类似于Java中的void
     */
    fun printSum(a: Int, b: Int): Unit {
        print(a + b)
    }

    /**
     * 无返回值函数，Unit可以省略
     */
    fun prineSum(a: Int, b: Int) {
        print(a + b)
    }

    /**
     * 可变长参数,使用vararg表示
     */
    fun vars(vararg a: Int) {
        for (item in a) {
            print("当前的东西是" + item)
        }
    }


    /**
     * 变量的定义
     */
    val a: Int = 1
    val b = -1

    fun strTest() {

        var aTest = 1
        val s1 = "a is $aTest"
        aTest = 2
        val s2 = "${s1.replace("is", "was")},but now is $aTest"
        print(s2)
    }


    /**
     * 空处理机制
     */
    fun nullFunction(age: String) {
        var age: String? = null//加？  表示可为空
//        var ages = age!!.toInt()//为空抛出yi异常
        var ages1 = age?.toInt()
        var ages2 = age?.toInt() ?: -1
        print(ages1)
    }


    /**
     * 当传递进来的文字不能转换为一个整数时，返回null,很神器的操作
     */
    fun printInt(str: String): Int? {
        return str.toInt()
    }

    /**
     * 这段在教程中属于智障操作
     */
    fun nullUse(args: Array<Int>) {
        if (args.size < 2) {
            print("输入的长度过低")
            return
        } else {
            val x = args[0]
            val y = args[1]
            print(x * y)
        }
    }

    fun getStringLength(obj: Any): Int? {

        if (obj is String) {
            return obj.length
        }
        return null
    }

    /**
     * 区间的使用
     * step步长  从第一个开始
     */
    fun quJian() {
        for (i in 1..4 step 2) {
            print(i) // 输出“1234”
        }
        println()
        for (i in 4 downTo 1 step 3) {
            print(i)
        } // 什么都不输出
    }

    /**
     * 等号的使用
     * kotlin中一样存在Int数据类型128的问题，狗日的写的教程真垃圾
     */
    fun myEquals() {
        var a: Int? = 128
        var b: Int? = 128
        println(a == b)
        println(a === b)
        b = 1
        println(a)
    }


    /**
     *
     */

    fun weiYi() {

    }

    /**
     * 测试。。的作用域 []  闭区间
     */
    fun showNumber() {
        for (a in 0..9) {
            print(a)
        }
    }

    /**
     * 测试until的作用域 [)  左毕右开
     */
    fun showNumber2() {
        for (a in 0 until 9) {
            print(a)
        }
    }

    /**
     * 将字符转换为Int
     */
    fun char2Int(mChar: Char): Int {

        if (mChar !in '0'..'9') {
            throw IllegalArgumentException("put is not a ranage")
        } else {
            return mChar.toInt()
        }
    }


    /**
     * 创建数组  vararg 这种参数的传递方式，将vararg整体作为一个item传入数组array1中
     * array1可以通过get  和  set 操作生成的数据
     * e:  array1[0].get(2)
     */
    fun createArray1(vararg arrayItem: Int) {
        val array1 = arrayOf(arrayItem)
        print(array1[0].get(2))
    }

    /**
     * 创建数组  i  是默认从0开始 然后  0，1，2，3
     */
    fun createArray2() {
        val array2 = Array(3, { i -> (i * 2) })
        print(array2[0])
        print(array2[1])
        print(array2[2])
    }

    /**
     * 从string中，顺次打印单个字,相比Java的String.getChar(index) 更方便
     */
    fun showCharOfString(str: String) {
        for (c in str) {
            println(c)
        }
    }

    /**
     * 方法名 做一些顽皮的事，也就是  蛇皮操作
     */
    fun doSomeingNaughty() {
        val text: String = """
            |蛇皮操作
            |蛇皮操作
            |蛇皮操作
            """.trimMargin(">")
        print(text)
    }


    /**
     * 字符串中穿插代码段
     */
    fun fuck() {
        val s: String = "adcs"
        val str = "$s.length is ${s.length}"
        print(str)
    }

    /**
     * 展示特殊的字符
     */
    fun showSpecialChar() {
        var specialString: String = "${'$'}99"
        print(specialString)
    }

    /**
     * if表达式的使用1
     */
    fun funIf1() {
        var a: Int = 100
        var b: Int = 200
        var max = a
        if (a < b) {
            max = b
        }
        if (a > b) {
            max = a
        } else {
            max = b
        }

        val max2 = if (a > b) a else b

        val max3 = ""?.length ?: -1
    }

    /**
     * 使用In运算符检测某个数字是否位于某个区间
     */
    fun testIn() {
        val x = 5
        val y = 9
        if (a in 0..9) {
            print(x)
        }
    }

    /**
     * 使用when做条件控制
     */
    fun testWen(number: Int) {
        when (number) {
            1 -> print("input number is 1")
            2 -> print("input number is 2")
            else -> print("瞎几把乱输$number")
        }
    }

    /**
     *当输入的内容是0或者1的时候,输出正确
     */
    fun testWen2(number: Int) {
        when (number) {
            0, 1 -> print("input number is ok")
            else -> print("瞎几把乱输$number")
        }
    }


    /**
     * 检测是否在某个区间内
     */
    fun testWen3(number: Int) {
        when (number) {
            in 0..9 -> print("input is in 0--9")
            else -> print("瞎几把乱输$number")
        }
    }

    /**
     *输入类型检测
     */
    fun testWen4(number: Any) {
        when (number) {
            is String -> print("input is String")
            is Int -> print("input is int")
            else -> print("瞎几把乱输${number}")
        }
    }


    /**
     * 测试when不传递参数的情况下
     */
    fun testWhen5(number: Int) {
        when {
            number == 1 -> print("input is true")
            number == 2 -> print("input is false")
            else -> print("瞎几把乱输")
        }
    }

    /**
     *测试when情况下in的使用
     */
    fun testWhenIn(str: String) {
        val mSet = setOf<String>("aaa", "bbb", "ccc")
        when {
            str in mSet -> print("aaa在set中")
            str in mSet -> print("aaa在set中")
            else -> print("瞎几把乱输")
        }
    }

    /**
     * for循环遍历
     * mArray.indices 返回当前array的可用索引范围
     *
     */
    fun searchArray() {
        val mArray = arrayOf(1, 2, 3)
        for (i in mArray.indices) {
            print(mArray.get(i))
        }
    }

    /**
     * 遍历list
     */
    fun searchList() {
        val mList = listOf<String>("轻轻的我走了", "正如我轻轻地来", "我挥一挥衣袖", "不带走一片云彩")
        for (item in mList.indices) {
            println(mList.get(item))
        }
    }

    /**
     *测试dowhile 的使用
     */
    fun testDoWhile() {
        var index = 15
        do {
            println(index)
            index--
        } while (index > 10)
    }

    /**
     * 测试标签的作用 ，跳转到制定位置
     */
    fun testLabel() {
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i == j) {
                    print("执行成功")
                    break@loop
                }
            }
        }
    }

    @Test
    fun test() {
        testLabel()
    }
}