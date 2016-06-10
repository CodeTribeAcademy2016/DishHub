package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class MenuItemDTO {

    private Integer menuItemID;
    private String itemName;
    private Double itemPrice;
    private String itemUrl;
    private List<OrderItemDTO> orderitemList;
    private Integer menuID;

    public MenuItemDTO() {
    }



    public Integer getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(Integer menuItemID) {
        this.menuItemID = menuItemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public List<OrderItemDTO> getOrderitemList() {
        return orderitemList;
    }

    public void setOrderitemList(List<OrderItemDTO> orderitemList) {
        this.orderitemList = orderitemList;
    }

    public Integer getMenuID() {
        return menuID;
    }

    public void setMenuID(Integer menuID) {
        this.menuID = menuID;
    }

}
