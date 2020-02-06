package com.masrizal.android.gamelanjawa.tentang;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.masrizal.android.gamelanjawa.R;

public class tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        this.setTitle("Tentang");

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
