package com.coolweather.android.db;

/**
 * Created by admin on 2018/11/27.
 */

public class County {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public  void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return  cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
