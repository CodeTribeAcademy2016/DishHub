package Transfer;

import DTO.AdminDTO;
import DTO.CityDTO;
import DTO.CountryDTO;
import DTO.CustomerDTO;
import DTO.FoodOrderDTO;
import DTO.MenuDTO;
import DTO.MenuItemDTO;
import DTO.OrderItemDTO;
import DTO.OrderStatusDTO;
import DTO.PaymentDTO;
import DTO.ProvinceDTO;
import DTO.RestuarantDTO;

/**
 * Created by User on 5/30/2016.
 */
public class RequestDTO {

    private Integer adminID;
    private Integer cityID;
    private Integer countryID;
    private Integer customerID;
    private Integer foodorderID;
    private Integer menuID;
    private Integer menuitemID;
    private Integer orderitemID;
    private Integer orderstatusID;
    private Integer paymentID;
    private Integer provinceID;
    private Integer restuarantID;


    private AdminDTO admin;
    private CityDTO city;
    private CountryDTO country;
    private CustomerDTO  customer;
    private FoodOrderDTO foodorder;
    private MenuDTO menu;
    private MenuItemDTO menuitem;
    private OrderItemDTO orderitem;
    private OrderStatusDTO orderstatus;
    private PaymentDTO payment;
    private ProvinceDTO province;
    private RestuarantDTO restuarant;

    private int RequestType;

    public static final int REGISTER_RESTAURANT = 1,
    // UPDATE_RESTAURANT = 2,
    DELETE_RESTAURANT = 3;

    public static final int REGISTER_ADMIN = 10,
            UPDATA_ADMIN = 11,
            DELETE_ADMIN = 12,
            GET_ADMIN = 13,
            LOGIN_ADMIN = 14;

    public static final int REGISTER_CUSTOMER = 20,
            UPDATE_CUSTOMER = 21,
            DELETE_CUSTOMER = 22,
            GET_CUSTOMER = 23,
            LOGIN_CUSTOMER = 24;

    public static final int ADD_MENU = 30,
            UPDATE_MENU = 31,
            VIEW_MENU = 32,

    UPDATE_CITY = 33,
            UPDATE_PROVINCE = 34,
            UPDATE_ORDER_ITEM = 35,
            UPDATE_ORDER_STATUS = 36,
            UPDATE_PAYMENT = 37,
            UPDATE_FOOD_ORDER = 38;


    public static final int ADD_MENU_ITEM = 40,
            UPDATE_MENU_ITEM = 41,
            SELECT_MENU_ITEM = 42,
            ADD_ORDER_STATUS =  43  ,
            REMOVE_MENU_ITEM =44;

    public static final int ADD_FOOD_ORDER = 50,
            PLACE_FOOD_ORDER = 51,
            ACCEPT_FOOD_ORDER = 52,
            VIEW_FOOD_ORDER = 53,
            CANCEL_FOOD_ORDER = 54,
            UPDATE_RESTAURANT = 55,
            GET_FOOD_ORDER_STATUS = 56,
            GET_RESTUARANT_BY_CITY = 57;

    public static final int ADD_COUNTRY = 60,
            ADD_CITY = 61,
            ADD_PAYMENT = 62,
            ADD_LONGITUDE = 63,
            ADD_PROVINCE = 64;

    public static final int GET_PROVINCE_BY_COUNTRY = 70,
            GET_ALL_PROVINCE = 71,
            GET_ALL_CITY = 72,
            GET_CITY_PROVINCE = 73,
            GET_MENU = 74,
            GET_MENU_ITEMS = 75,
            GET_MENU_ITEM = 76,
            GET_ORDER_ITEM = 77,
            GET_FOOD_ORDER = 78,
            GET_PAYMENT = 79,
            GET_COUNTRY = 80;



    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getFoodorderID() {
        return foodorderID;
    }

    public void setFoodorderID(Integer foodorderID) {
        this.foodorderID = foodorderID;
    }

    public Integer getMenuID() {
        return menuID;
    }

    public void setMenuID(Integer menuID) {
        this.menuID = menuID;
    }

    public Integer getMenuitemID() {
        return menuitemID;
    }

    public void setMenuitemID(Integer menuitemID) {
        this.menuitemID = menuitemID;
    }

    public Integer getOrderitemID() {
        return orderitemID;
    }

    public void setOrderitemID(Integer orderitemID) {
        this.orderitemID = orderitemID;
    }

    public Integer getOrderstatusID() {
        return orderstatusID;
    }

    public void setOrderstatusID(Integer orderstatusID) {
        this.orderstatusID = orderstatusID;
    }

    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Integer getRestuarantID() {
        return restuarantID;
    }

    public void setRestuarantID(Integer restuarantID) {
        this.restuarantID = restuarantID;
    }

    public AdminDTO getAdmin() {
        return admin;
    }

    public void setAdmin(AdminDTO admin) {
        this.admin = admin;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public FoodOrderDTO getFoodorder() {
        return foodorder;
    }

    public void setFoodorder(FoodOrderDTO foodorder) {
        this.foodorder = foodorder;
    }

    public MenuDTO getMenu() {
        return menu;
    }

    public void setMenu(MenuDTO menu) {
        this.menu = menu;
    }

    public MenuItemDTO getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(MenuItemDTO menuitem) {
        this.menuitem = menuitem;
    }

    public OrderItemDTO getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(OrderItemDTO orderitem) {
        this.orderitem = orderitem;
    }

    public OrderStatusDTO getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(OrderStatusDTO orderstatus) {
        this.orderstatus = orderstatus;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

    public RestuarantDTO getRestuarant() {
        return restuarant;
    }

    public void setRestuarant(RestuarantDTO restuarant) {
        this.restuarant = restuarant;
    }

    public int getRequestType() {
        return RequestType;
    }

    public void setRequestType(int RequestType) {
        this.RequestType = RequestType;
    }



}
