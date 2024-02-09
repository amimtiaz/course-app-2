package com.imtiaz_acedamy.course_app_1.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.imtiaz_acedamy.course_app_1.R;
import com.imtiaz_acedamy.course_app_1.databinding.ActivityCouseDetailsBinding;

import org.w3c.dom.Text;

import java.security.PublicKey;
import java.util.Locale;

public class CouseDetailsActivity extends AppCompatActivity {

    ActivityCouseDetailsBinding binding;
    private TextToSpeech textToSpeech;
    private boolean isSpeaking = false;

    public static String TITLE = "";
    public static String DESCRIPTION = "";
    public static String OWNER_NAME = "";
    public  static  String PRICE = "";
    public static String RATEING = "";
    public static Bitmap MY_BITMAP = null;

    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCouseDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.titleTxt.setText(TITLE);
        binding.des.setText(DESCRIPTION);
        binding.ownerTxt.setText(OWNER_NAME);
        binding.priceTxt.setText(PRICE);
        binding.starTxt.setText(RATEING);

        if (MY_BITMAP != null) binding.pic.setImageBitmap(MY_BITMAP);

        addIconInit();
        buyNowInit();


    }

    private void buyNowInit() {
        binding.buyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(CouseDetailsActivity.this, "Added to Cart", Toast.LENGTH_SHORT).show();
                
            }
        });
    }



    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */

    private void addIconInit() {


        textToSpeech = new TextToSpeech(CouseDetailsActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });



        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              onButtonClick(v);

            }
        });



        /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */

    }


    public void onButtonClick(View view) {
        if (!isSpeaking) {
            convertTextToSpeech(binding.des.getText().toString());
            isSpeaking = true;
        } else {
            stopSpeaking();
            isSpeaking = false;
        }
    }

    public void convertTextToSpeech(String text) {
        if (textToSpeech != null) {
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }

    public void stopSpeaking() {
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            textToSpeech.stop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}