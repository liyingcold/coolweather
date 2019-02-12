package com.example.my.coolweather;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;


import pub.devrel.easypermissions.EasyPermissions;

public class MainActivity extends AppCompatActivity implements EasyPermissions.PermissionCallbacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.hide();
        }
//        所需要申请的权限
        String[] perms={Manifest.permission.ACCESS_WIFI_STATE,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.READ_PHONE_STATE,Manifest.permission.READ_PHONE_STATE};
//检查是否得到该权限
        if (EasyPermissions.hasPermissions(this,perms)){
            Log.i("TAG","已获得权限");
        }else {
            EasyPermissions.requestPermissions(this,"必要权限",0,perms);
        }


        SharedPreferences pref=PreferenceManager.getDefaultSharedPreferences(this);
        if (pref.getString("weather",null)!=null){
            Intent intent=new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//将结果转发到easyPermission
        EasyPermissions.onRequestPermissionsResult(requestCode,permissions,grantResults,this);
    }


    @Override
    public void onPermissionsGranted(int requestCode,List<String> perms) {
        Log.i("TAG","获取成功的权限:");
    }

    @Override
    public void onPermissionsDenied(int requestCode,List<String> perms) {
        Log.i("TAG","获取失败的权限");
    }
}
