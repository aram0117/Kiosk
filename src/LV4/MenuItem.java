package LV4;

public class MenuItem {
    // 메뉴아이템 필드
    // 속성
    String name;
    String price;
    String explanation;
    // 메뉴 아이템 생성자
    public MenuItem(String name, String price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // toString 함수로 인스턴스 값 재정의
    @Override
    public String toString() {
        return name + " | " +  price + " | " + explanation;
    }
}

