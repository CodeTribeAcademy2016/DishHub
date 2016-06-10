package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class OrderStatusDTO {

    private Integer orderStatusID;
    private String orderStatusName;
    private List<FoodOrderDTO> foodorderList;

    public OrderStatusDTO() {
    }



    public Integer getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(Integer orderStatusID) {
        this.orderStatusID = orderStatusID;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public List<FoodOrderDTO> getFoodorderList() {
        return foodorderList;
    }

    public void setFoodorderList(List<FoodOrderDTO> foodorderList) {
        this.foodorderList = foodorderList;
    }

}
