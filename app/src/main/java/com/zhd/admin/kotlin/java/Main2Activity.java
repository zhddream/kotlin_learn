package com.zhd.admin.kotlin.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.zhd.admin.kotlin.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View view) {
        EditText editText = findViewById(R.id.editText);
        Toast.makeText(this, "" + editText.getText().toString().trim(), Toast.LENGTH_SHORT).show();
    }
}
