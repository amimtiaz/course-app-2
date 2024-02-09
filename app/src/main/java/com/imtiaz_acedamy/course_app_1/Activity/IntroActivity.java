package com.imtiaz_acedamy.course_app_1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.imtiaz_acedamy.course_app_1.R;
import com.imtiaz_acedamy.course_app_1.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {

    ActivityIntroBinding binding;

    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.loginBtn.setOnClickListener(v -> {
            //To go MainActivity
            startActivity(new Intent(IntroActivity.this, MainActivity.class));
        });

        Window window = IntroActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(IntroActivity.this, R.color.purple));
    }
    // Owner Imtiaz || mail: info.devimtiaz@gmail.com
}