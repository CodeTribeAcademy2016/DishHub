package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class RestuarantDTO {

    private Integer restuarantID;
    private String restuarantName;
    private String address;
    private Double longitude;
    private Double latitude;
    private List<FoodOrderDTO> foodorderList;
    private Integer cityID;
    private List<AdminDTO> adminList;
    private List<MenuDTO> menuList;
    private List<CustomerDTO> customerList;

    public RestuarantDTO() {
    }


    public Integer getRestuarantID() {
        return restuarantID;
    }

    public void setRestuarantID(Integer restuarantID) {
        this.restuarantID = restuarantID;
    }

    public String getRestuarantName() {
        return restuarantName;
    }

    public void setRestuarantName(String restuarantName) {
        this.restuarantName = restuarantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public List<FoodOrderDTO> getFoodorderList() {
        return foodorderList;
    }

    public void setFoodorderList(List<FoodOrderDTO> foodorderList) {
        this.foodorderList = foodorderList;
    }




    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public List<AdminDTO> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<AdminDTO> adminList) {
        this.adminList = adminList;
    }

    public List<MenuDTO> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuDTO> menuList) {
        this.menuList = menuList;
    }

    public List<CustomerDTO> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<CustomerDTO> customerList) {
        this.customerList = customerList;
    }


}
