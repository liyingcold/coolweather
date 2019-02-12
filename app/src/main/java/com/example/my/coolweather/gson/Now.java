package com.example.my.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("cond_txt")
    public String info;

    @SerializedName("tmp")
    public String temperature;



}
