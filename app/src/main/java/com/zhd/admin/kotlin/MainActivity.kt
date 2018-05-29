package com.zhd.admin.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.junit.Test


class MainActivity : AppCompatActivity() {

    @Test
    fun test() {
        show("ÄãºÃ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun show(name: String) {
        print("aaaa$name")
    }
}
