package com.imtiaz_acedamy.course_app_1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.imtiaz_acedamy.course_app_1.Adapter.CouseAdapter;
import com.imtiaz_acedamy.course_app_1.Domain.CouseDomain;
import com.imtiaz_acedamy.course_app_1.R;
import com.imtiaz_acedamy.course_app_1.databinding.ActivityIntroBinding;
import com.imtiaz_acedamy.course_app_1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initRecyclerView();

        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.white));
    }

    private void initRecyclerView() {
        ArrayList<CouseDomain> itemsArrayList = new ArrayList<>();

        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.2, "pic1", "This disease can cause blindness. We have no idea what has happened to cause people to stay away"));
        itemsArrayList.add(new CouseDomain("Full Course android kotlin", "ALex Alba", 460, 4.6, "pic2", "This disease can cause blindness. We have no idea what has happened to cause people to stay away"));
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.3, "pic1", "This disease can cause blindness. We have no idea what has happened to cause people to stay away"));
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.2, "pic1", "This disease can cause blindness. We have no idea what has happened to cause people to stay away"));
        itemsArrayList.add(new CouseDomain("Full Course android kotlin", "ALex Alba", 460, 4.6, "pic2", "This disease can cause blindness. We have no idea what has happened to cause people to stay away"));
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.3, "pic1", "This disease can cause blindness. We have no idea what has happened to cause people to stay away"));

        binding.popularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.popularView.setAdapter(new CouseAdapter(itemsArrayList));


    }

    // Owner Imtiaz || mail: info.devimtiaz@gmail.com
}