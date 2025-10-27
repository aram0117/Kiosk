package LV4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 카테고리 메뉴 이름과, 메뉴아이템 리스트속성
    String categoryname;
    List<MenuItem> menuItem;

    // 메뉴 생성자
    Menu(String categoryname, List<MenuItem> menuItem) {
        this.menuItem = menuItem;
        this.categoryname = categoryname;
    }

    // List of로 한번에 메뉴아이템 객체를 추가하는 방법1
    // 메뉴아이템 리스트 생성후 카테고리에 해당하는 메뉴아템 객체를 add로 추가하는 방법2

    // 버거 아이템리스트 반환
    public static List<MenuItem> getBurgerItem() {
        // 버거 아이템 리스트 객체 생성
        List<MenuItem> burgerItemList = new ArrayList<>();
        // add로 버거 아이템 리스트에 머러 아이템 객체 추가
        burgerItemList.add(new MenuItem("1.ShackBurger", "W6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("2.SmokeShack", "W8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("3.Cheeseburger", "W6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("4.Hamburger", "W5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));
        return burgerItemList;
    }

    // 드링크 아이템리스트 반환
    public static List<MenuItem> getDrinkItem() {
        // 드링크 아이템 리스트 객체 생성
        List<MenuItem> drinkItemList = new ArrayList<>();
        // add로 드링크 아이템 리스트에 드링크 아이템 객체 추가
        drinkItemList.add(new MenuItem("1.Cola", "W1.8", "버거와 빼놓을 수없는 최고의 탄산음료"));
        drinkItemList.add(new MenuItem("2.Milk", "W2.0", "목넘김이 부드러운 신선한 우유"));
        return drinkItemList;
    }

    // 디저트 아이템 리스트 반환
    public static List<MenuItem> getDessertItem() {
        // 디저트 아이템 리스트 객체 생성
        List<MenuItem> dessrtItemList = new ArrayList<>();
        // add로 디저트 아이템템 리스트에 디저트 아이템 객체 추가
        dessrtItemList.add(new MenuItem("1.Icecream", "W3.0", "입가심으로 완벽하고 달달한 아이스크림"));
        dessrtItemList.add( new MenuItem("2.Cookie", "W1.5", "고소하고 바삭한 쿠키"));
        return dessrtItemList;
    }
}




