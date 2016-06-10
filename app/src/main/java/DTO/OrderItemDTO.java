package DTO;

/**
 * Created by User on 5/30/2016.
 */
public class OrderItemDTO {

    private Integer orderItemID;
    private Integer menuItemID;
    private Integer foodOrderID;
    // private double price;

    public OrderItemDTO() {
    }



    public Integer getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(Integer orderItemID) {
        this.orderItemID = orderItemID;
    }

    public Integer getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(Integer menuItemID) {
        this.menuItemID = menuItemID;
    }

    public Integer getFoodOrderID() {
        return foodOrderID;
    }

    public void setFoodOrderID(Integer foodOrderID) {
        this.foodOrderID = foodOrderID;
    }


}
