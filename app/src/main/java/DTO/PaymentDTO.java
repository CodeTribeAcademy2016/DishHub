package DTO;

/**
 * Created by User on 5/30/2016.
 */
public class PaymentDTO {

    private Integer paymentID;
    private String paymentType;
    private long paymentDate;
    private double amount;
    private Integer foodOrderID;

    public PaymentDTO() {
    }



    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public long getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(long paymentDate) {
        this.paymentDate = paymentDate;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public Integer getFoodOrderID() {
        return foodOrderID;
    }

    public void setFoodOrderID(Integer foodOrderID) {
        this.foodOrderID = foodOrderID;
    }


}
