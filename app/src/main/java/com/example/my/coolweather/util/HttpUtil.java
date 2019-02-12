package com.example.my.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
//        创建一个实例
        OkHttpClient client=new OkHttpClient();
//        创建一个request对象
        Request request=new Request.Builder().url(address).build();
//        创建一个call对象
        client.newCall(request).enqueue(callback );
    }
}
