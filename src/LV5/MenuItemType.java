package LV5;

public enum MenuItemType {

    // 카테고리 타입
    BURGER("1. Burger"),
    DRINK("2. Drink"),
    DESSERT("3. Dessert");


    // 변하지 않는 상수인 final 디스플레이네임 속성
    private final String displayName;


    // 생성자
    MenuItemType(String displayName) {
        this.displayName = displayName;
    }

    // 카테고리 이름 게터
    public String getCategoryName() {
        return this.displayName;
    }
}

