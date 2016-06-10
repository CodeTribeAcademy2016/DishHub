package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class CityDTO {

    private Integer cityID;
    private String cityName;
    private List<RestuarantDTO> restuarantList;
    private Integer provinceID;

    public CityDTO() {
    }


    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<RestuarantDTO> getRestuarantList() {
        return restuarantList;
    }

    public void setRestuarantList(List<RestuarantDTO> restuarantList) {
        this.restuarantList = restuarantList;
    }



    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }





}
