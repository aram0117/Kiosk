package LV5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 카테고리 메뉴 이름과, 메뉴아이템 리스트 필드
    private String categoryName;
    private List<MenuItem> menuItem;


    // 메뉴 생성자
    // 이넘으로 정의한 메뉴아이템타입을 매개변수로 받음
    Menu(MenuItemType menuItemType) {
        this.categoryName = menuItemType.getCategoryName();
        this.menuItem = getMenuItem(menuItemType);
    }


    // 카테고리이름 게터
    public String getCategoryName() {
        return categoryName;
    }


    // 메뉴아이템 게터
    public List<MenuItem> getMenuItem() {
        return menuItem;
    }


    // enum으로 메뉴아이템타입을 만들어 메뉴아이템 타입에 변수로 받게한다
    private List<MenuItem> getMenuItem(MenuItemType menuItemType) {

        // 메뉴 아이템 리스트 객체 생성
        List<MenuItem> menuItemList = new ArrayList<>();

        // if로 각각 해당하는 메뉴아이템 타입을 equals로 비교하여 메뉴아이템 리스트를 반환한다
        if (MenuItemType.BURGER.equals(menuItemType)) {
            menuItemList = getBurgerItem();
        } else if (MenuItemType.DRINK.equals(menuItemType)) {
            menuItemList = getDrinkItem();
        } else if (MenuItemType.DESSERT.equals(menuItemType)) {
            menuItemList = getDessertItem();
        }
        // 메뉴아이템 리스트 반환
        return menuItemList;
    }


    // 버거 아이템리스트 반환
    private List<MenuItem> getBurgerItem() {
        // 드링크 아이템 리스트 객체 생성
        List<MenuItem> burgerItemList = new ArrayList<>();
        // add로 버거 아이템 리스트에 버거 아이템 객체 추가
        burgerItemList.add(new MenuItem("1.ShackBurger", "W6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("2.SmokeShack", "W8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("3.Cheeseburger", "W6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("4.Hamburger", "W5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));

        return burgerItemList;
    }


    // 드링크 아이템리스트 반환
    private List<MenuItem> getDrinkItem() {
        // 드링크 아이템 리스트 객체 생성
        List<MenuItem> drinkItemList = new ArrayList<>();
        // add로 드링크 아이템 리스트에 드링크 아이템 객체 추가
        drinkItemList.add(new MenuItem("1.Cola", "W1.8", "버거와 빼놓을 수없는 최고의 탄산음료"));
        drinkItemList.add(new MenuItem("2.Milk", "W2.0", "목넘김이 부드러운 신선한 우유"));

        return drinkItemList;
    }


    // 디저트 아이템 리스트 반환
    private List<MenuItem> getDessertItem() {
        // 디저트 아이템 리스트 객체 생성
        List<MenuItem> dessrtItemList = new ArrayList<>();
        // add로 디저트 아이템템 리스트에 디저트 아이템 객체 추가
        dessrtItemList.add(new MenuItem("1.Icecream", "W3.0", "입가심으로 완벽하고 달달한 아이스크림"));
        dessrtItemList.add(new MenuItem("2.Cookie", "W1.5", "고소하고 바삭한 쿠키"));

        return dessrtItemList;
    }
}






