package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fu on 2018/3/28.
 */

public class Basic {

    @SerializedName("city")              //JSON中一些字段可能不适合直接作为java字段命名，采用映射方式建立关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
