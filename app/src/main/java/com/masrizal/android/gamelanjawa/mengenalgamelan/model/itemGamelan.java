package com.masrizal.android.gamelanjawa.mengenalgamelan.model;

import android.os.Parcel;
import android.os.Parcelable;

public class itemGamelan implements Parcelable {
    private int gambar;
    private int banner;
    private String judul;
    private String deskripsi;

    public int getBanner() {
        return banner;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.gambar);
        dest.writeInt(this.banner);
        dest.writeString(this.judul);
        dest.writeString(this.deskripsi);
    }

    public itemGamelan() {
    }

    protected itemGamelan(Parcel in) {
        this.gambar = in.readInt();
        this.banner = in.readInt();
        this.judul = in.readString();
        this.deskripsi = in.readString();
    }

    public static final Creator<itemGamelan> CREATOR = new Creator<itemGamelan>() {
        @Override
        public itemGamelan createFromParcel(Parcel source) {
            return new itemGamelan(source);
        }

        @Override
        public itemGamelan[] newArray(int size) {
            return new itemGamelan[size];
        }
    };
}
