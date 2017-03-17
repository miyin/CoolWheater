package com.cool.weather.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/13.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;
//    private int countyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

//    public int getCountyId() {
//        return countyId;
//    }

//    public void setCountyId(int countyId) {
//        this.countyId = countyId;
//    }
}
