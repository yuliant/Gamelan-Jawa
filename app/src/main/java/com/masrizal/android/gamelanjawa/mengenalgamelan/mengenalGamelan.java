package com.masrizal.android.gamelanjawa.mengenalgamelan;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.masrizal.android.gamelanjawa.R;
import com.masrizal.android.gamelanjawa.mengenalgamelan.adapter.adapterGamelan;
import com.masrizal.android.gamelanjawa.mengenalgamelan.model.itemGamelan;

import java.util.ArrayList;

public class mengenalGamelan extends AppCompatActivity {
    private String[] dataJudul, dataDeskripsi ;
    private TypedArray dataGambar, dataBanner;
    private adapterGamelan adapter;
    private ArrayList<itemGamelan> itemGamelans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengenal_gamelan);
        this.setTitle("Mengenal Gamelan");

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        adapter = new adapterGamelan(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(mengenalGamelan.this, DetailGamelan.class);
                intent.putExtra(DetailGamelan.DETAIL_MOVIE, itemGamelans.get(i));
                startActivity(intent);
            }
        });
    }

    private void addItem() {
        itemGamelans = new ArrayList<>();
        for (int i = 0; i < dataJudul.length; i++) {
            itemGamelan gamelan = new itemGamelan();
            gamelan.setGambar(dataGambar.getResourceId(i, -1));
            gamelan.setBanner(dataBanner.getResourceId(i, -1));
            gamelan.setJudul(dataJudul[i]);
            gamelan.setDeskripsi(dataDeskripsi[i]);
            itemGamelans.add(gamelan);
        }
        adapter.setGamelan(itemGamelans);
    }

    private void prepare() {
        dataGambar = getResources().obtainTypedArray(R.array.data_gambar);
        dataBanner = getResources().obtainTypedArray(R.array.data_banner);
        dataJudul = getResources().getStringArray(R.array.data_judul);
        dataDeskripsi = getResources().getStringArray(R.array.data_deskripsi);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
