package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class CustomerDTO {

    private Integer customerID;
    private String name;
    private String surname;
    private String email;
    private String contact;
    private String address;
    private String username;
    private String password;
    private List<FoodOrderDTO> foodorderList;
    private Integer restuarantID;

    public CustomerDTO() {
    }


    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<FoodOrderDTO> getFoodorderList() {
        return foodorderList;
    }

    public void setFoodorderList(List<FoodOrderDTO> foodorderList) {
        this.foodorderList = foodorderList;
    }

    public Integer getRestuarantID() {
        return restuarantID;
    }

    public void setRestuarantID(Integer restuarantID) {
        this.restuarantID = restuarantID;
    }

}
