package com.coolweather.android.db;

/**
 * Created by admin on 2018/11/26.
 */

public class City {
    private  int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return  cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
