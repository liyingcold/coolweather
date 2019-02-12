package com.example.my.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public Basic basic;
    public Update update;
    public String status;
    public Now now;

    @SerializedName("lifestyle")
    public List<LifeStyle> lifeStyleList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
