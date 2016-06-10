package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class FoodOrderDTO {

    private Integer foodOrderID;
    private Long orderDate;
    // private Double foodPrice;
    private Integer customerID;
    private Integer restuarantID;
    private Integer orderStatusID;
    private double totalAmount;
    private List<OrderItemDTO> orderitemList;
    private List<PaymentDTO> paymentList;

    public FoodOrderDTO() {
    }



    public Integer getFoodOrderID() {
        return foodOrderID;
    }

    public void setFoodOrderID(Integer foodOrderID) {
        this.foodOrderID = foodOrderID;
    }

    public Long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Long orderDate) {
        this.orderDate = orderDate;
    }


    public double getTotalAmount() {
        return totalAmount;
    }

    /* public Double getFoodPrice() {
    return foodPrice;
    }
    public void setFoodPrice(Double foodPrice) {
    this.foodPrice = foodPrice;
    }*/
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getRestuarantID() {
        return restuarantID;
    }

    public void setRestuarantID(Integer restuarantID) {
        this.restuarantID = restuarantID;
    }

    public Integer getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(Integer orderStatusID) {
        this.orderStatusID = orderStatusID;
    }

    public List<OrderItemDTO> getOrderitemList() {
        return orderitemList;
    }

    public void setOrderitemList(List<OrderItemDTO> orderitemList) {
        this.orderitemList = orderitemList;
    }

    public List<PaymentDTO> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<PaymentDTO> paymentList) {
        this.paymentList = paymentList;
    }



}
