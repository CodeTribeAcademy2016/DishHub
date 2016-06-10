package DTO;

import java.util.List;

/**
 * Created by User on 5/30/2016.
 */
public class MenuDTO {

    private Integer menuID;
    private String menuName;
    private Integer restuarantID;
    private List<MenuItemDTO> menuitemList;

    public MenuDTO() {
    }



    public Integer getMenuID() {
        return menuID;
    }

    public void setMenuID(Integer menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getRestuarantID() {
        return restuarantID;
    }

    public void setRestuarantID(Integer restuarantID) {
        this.restuarantID = restuarantID;
    }

    public List<MenuItemDTO> getMenuitemList() {
        return menuitemList;
    }

    public void setMenuitemList(List<MenuItemDTO> menuitemList) {
        this.menuitemList = menuitemList;
    }

}
