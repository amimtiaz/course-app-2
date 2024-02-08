package com.imtiaz_acedamy.course_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.imtiaz_acedamy.course_app_1.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {

    ActivityIntroBinding binding;

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
    }
    // Owner Imtiaz || mail: info.devimtiaz@gmail.com
}