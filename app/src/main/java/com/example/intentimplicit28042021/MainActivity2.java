package com.example.intentimplicit28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.intentimplicit28042021.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.buttonBackToScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("string","result ok");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}