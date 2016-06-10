package Transfer;

import java.util.List;

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
public class ResponseDTO {

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

    private String message;
    private Integer statuscode;
    private Integer requestType;

    private List<RestuarantDTO> restuarantList;
    private List<ProvinceDTO> provinceList;
    private List<FoodOrderDTO> foodorderList;
    private List<OrderItemDTO> orderitemList;
    private List<PaymentDTO> paymentList;
    private List<MenuItemDTO> menuitemList;
    private List<CityDTO> cityList;
    private List<AdminDTO> adminList;
    private List<MenuDTO> menuList;
    private List<CustomerDTO> customerList;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public List<RestuarantDTO> getRestuarantList() {
        return restuarantList;
    }

    public void setRestuarantList(List<RestuarantDTO> restuarantList) {
        this.restuarantList = restuarantList;
    }

    public List<ProvinceDTO> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceDTO> provinceList) {
        this.provinceList = provinceList;
    }

    public List<FoodOrderDTO> getFoodorderList() {
        return foodorderList;
    }

    public void setFoodorderList(List<FoodOrderDTO> foodorderList) {
        this.foodorderList = foodorderList;
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

    public List<MenuItemDTO> getMenuitemList() {
        return menuitemList;
    }

    public void setMenuitemList(List<MenuItemDTO> menuitemList) {
        this.menuitemList = menuitemList;
    }

    public List<CityDTO> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDTO> cityList) {
        this.cityList = cityList;
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
