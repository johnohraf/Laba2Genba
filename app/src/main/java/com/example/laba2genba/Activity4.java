package com.example.laba2genba;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void changeButtonColor(View view) {
        Button button1 = findViewById(R.id.button1);
        button1.setBackgroundTintList(getResources().getColorStateList(R.color.light_green_color));
    }
}