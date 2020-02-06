package com.masrizal.android.gamelanjawa.mengenalgamelan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.masrizal.android.gamelanjawa.R;
import com.masrizal.android.gamelanjawa.mengenalgamelan.model.itemGamelan;

import java.util.ArrayList;

public class adapterGamelan extends BaseAdapter {
    private Context context;
    private ArrayList<itemGamelan> itemGamelans;

    public void setGamelan(ArrayList<itemGamelan> itemGamelans) {
        this.itemGamelans = itemGamelans;
    }
    public adapterGamelan(Context context) {
        this.context = context;
        itemGamelans = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return itemGamelans.size();
    }

    @Override
    public Object getItem(int position) {
        return itemGamelans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_gamelan, parent, false);
        }

        ViewHolder viewHolder = new ViewHolder(convertView);
        itemGamelan gamelan = (itemGamelan) getItem(position);
        viewHolder.bind(gamelan);
        return convertView;
    }

    private class ViewHolder {
        private TextView tvJudul;
        private ImageView imgGambar;

        ViewHolder(View view) {
            tvJudul = view.findViewById(R.id.tv_judul);
            imgGambar = view.findViewById(R.id.img_gambar);
        }

        void bind(itemGamelan itemGamelans) {
            tvJudul.setText(itemGamelans.getJudul());
            imgGambar.setImageResource(itemGamelans.getGambar());
        }
    }
}
