package com.example.my.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    @SerializedName("cond_txt_d")
    public String info;


    public String date;

    @SerializedName("tmp_max")
    public String temperatureX;

    @SerializedName("tmp_min")
    public String temperatureN;



}
