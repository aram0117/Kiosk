package LV5;

public class MenuItem {
    // 메뉴 아이템 필드
    private String name;
    private String price;
    private String explanation;

    // 메뉴 아이템 생성자
    MenuItem(String name, String price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // 이름 게터
    public String getName() {
        return name;
    }

    // 가격 게터
    public String getPrice() {
        return price;
    }

    // 설명 게터
    public String getExplanation() {
        return explanation;
    }

    // 투스트링 재정의
    @Override
    public String toString() {
        return name + " | " + price + " | " + explanation;
    }
}

