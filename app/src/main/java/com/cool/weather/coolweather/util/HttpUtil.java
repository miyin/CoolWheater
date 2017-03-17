package com.cool.weather.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/3/13.
 */

public class HttpUtil {

    /**
     * 发送请求
     * @param url
     * @param callBack
     */
    public static  void sendRequest(String url,Callback callBack){
        OkHttpClient clientQueue=new OkHttpClient();
        Request request=new Request.Builder().url(url).build();
        clientQueue.newCall(request).enqueue(callBack);
    }
}
