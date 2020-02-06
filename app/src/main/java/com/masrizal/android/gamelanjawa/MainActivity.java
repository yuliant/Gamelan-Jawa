package com.masrizal.android.gamelanjawa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.masrizal.android.gamelanjawa.mengenalgamelan.mengenalGamelan;
import com.masrizal.android.gamelanjawa.tentang.tentang;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMengenalGamelan(View view) {
        Intent intent = new Intent(MainActivity.this, mengenalGamelan.class);
        startActivity(intent);
    }

    public void toTentang(View view) {
        Intent intent = new Intent(MainActivity.this, tentang.class);
        startActivity(intent);
    }
}
