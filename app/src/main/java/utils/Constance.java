package utils;

/**
 * Created by User on 5/30/2016.
 */
public class Constance {

    //login variables
    public static  String requestType = "RequestType";
    public static  String email = "email";
    public static  String password = "password";
    public static String loginRequest = "24";
    public static String registerRequest = "20";
    //register variables
    public static String name="name";
    public static String surname = "surname";
    public static String contact = "contact";
    public static String address = "address";
    public static String username = "username";
    public static String restuarantId = "restuarantID";

    public static  String dishHubUrl = "http://146.64.85.17:8080/NsizwaRestaurant/rs";



    public static final int REGISTER_RESTAURANT = 1,
    // UPDATE_RESTAURANT = 2,
    DELETE_RESTAURANT = 3;

    public static final int //REGISTER_ADMIN = 10,
            UPDATA_ADMIN = 11,
            DELETE_ADMIN = 12,
            GET_ADMIN = 13,
            LOGIN_ADMIN = 14;

    public static final int REGISTER_CUSTOMER = 20,
            UPDATE_CUSTOMER = 21,
            DELETE_CUSTOMER = 22,
            GET_CUSTOMER = 23;
            //LOGIN_CUSTOMER = 24;

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


}
