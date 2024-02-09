package com.imtiaz_acedamy.course_app_1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.imtiaz_acedamy.course_app_1.databinding.ActivityCouseDetailsBinding;

import java.security.PublicKey;

public class CouseDetailsActivity extends AppCompatActivity {

    ActivityCouseDetailsBinding binding;

    public static String TITLE = "";
    public static String DESCRIPTION = "";
    public static String OWNER_NAME = "";
    public  static  String PRICE = "";
    public static String RATEING = "";
    public static Bitmap MY_BITMAP = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCouseDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.titleTxt.setText(TITLE);
       // binding.des.setText(DESCRIPTION);
        binding.ownerTxt.setText(OWNER_NAME);
        binding.priceTxt.setText(PRICE);
        binding.starTxt.setText(RATEING);

        if (MY_BITMAP != null) binding.pic.setImageBitmap(MY_BITMAP);


    }
}