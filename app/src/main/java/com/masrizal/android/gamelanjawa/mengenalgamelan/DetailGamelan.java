package com.masrizal.android.gamelanjawa.mengenalgamelan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.masrizal.android.gamelanjawa.R;
import com.masrizal.android.gamelanjawa.mengenalgamelan.model.itemGamelan;

public class DetailGamelan extends AppCompatActivity {
    public static final String DETAIL_MOVIE = "detail_movie";
    private TextView tvJudul, tvDeskripsi;
    private ImageView imgGambar, imgBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gamelan);
        this.setTitle("Detail Gamelan");

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imgGambar = findViewById(R.id.img_gambar);
        imgBanner = findViewById(R.id.img_banner);
        tvJudul = findViewById(R.id.tv_judul);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);

        terimaDetail();
    }

    private void terimaDetail() {
        itemGamelan itemGamelans = getIntent().getParcelableExtra(DETAIL_MOVIE);
        imgGambar.setImageResource(itemGamelans.getGambar());
        imgBanner.setImageResource(itemGamelans.getBanner());
        tvJudul.setText(itemGamelans.getJudul());
        tvDeskripsi.setText(itemGamelans.getDeskripsi());
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
