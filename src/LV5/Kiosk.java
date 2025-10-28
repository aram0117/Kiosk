package LV5;

import java.util.Scanner;

public class Kiosk {

    // 카테고리 메뉴 필드
    private Menu burger;
    private Menu drink;
    private Menu dessert;

    // 스캐너
    Scanner sc;

    // 버거게터
    public Menu getBurger() {
        return burger;
    }

    // 드링크 게터
    public Menu getDrink() {
        return drink;
    }

    // 디저트 게터
    public Menu getDessert() {
        return dessert;
    }


    // 생성자
    // 키오스크에 각 버거, 드링크, 디저트 메뉴 객체를 생성
    Kiosk() {
        burger = new Menu(MenuItemType.BURGER);
        drink = new Menu(MenuItemType.DRINK);
        dessert = new Menu(MenuItemType.DESSERT);

        // 스캐너 객체 생성
        sc = new Scanner(System.in);
    }

    // 키오스크의 첫시작
    // 카테고리 메뉴와 그 메뉴를 선택하여 각 메뉴 아이템리스트를 보여주거나 종료하는 입력기능
    public void start() {
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            System.out.println(burger.getCategoryName());
            System.out.println(drink.getCategoryName());
            System.out.println(dessert.getCategoryName());
            System.out.println("0. 종료");

            // 숫자 입력 받기
            System.out.println("[메뉴 카테고리 번호를 입력해주세요]");
            int input = sc.nextInt();


            // 숫자 0을 입력하면 종료
            switch (input) {
                case 1 -> {
                    burgerMenuOrder();
                }
                case 2 -> {
                    drinkMenuOrder();
                }
                case 3 -> {
                    dessertMenuOrder();
                }
                case 0 -> {
                    System.out.println("키오스크를 종료합니다");
                }
                // 조건 외에 다른 정수 입력시 재입력
                default -> {
                    System.out.println("잘못된 입력입니다 다시 입력해 주세요");
                    continue;
                }
            }
            break;
        }
    }


    // 버거 주문기능
    public void burgerMenuOrder() {
        while (true) {
            System.out.println("[[BurgerMenu]]");
            // 버거 메뉴아이템 순차적 접근 후 출력
            for (MenuItem burgerItem : burger.getMenuItem()) {
                System.out.println(burgerItem);
            }
            System.out.println("0. 뒤로가기");
            System.out.println("---------------------");
            System.out.println("주문할 메뉴번호를 입력하세요");
            int input = sc.nextInt();

            switch (input) {
                case 1, 2, 3, 4 -> {
                    System.out.println(burger.getMenuItem().get(input - 1));
                    exit();
                }
                case 0 -> {
                    System.out.println("뒤로가기 실행");
                    start();
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 입력해주세요");
                    continue;
                }
            }
            break;
        }
    }

    // 드링크 주문 기능
    public void drinkMenuOrder() {

        while (true) {
            System.out.println("[[DrinkMenu]]");
            // 드링크 메뉴아이템 순차적 접근 후 출력
            for (MenuItem drinkItem : drink.getMenuItem()) {
                System.out.println(drinkItem);
            }
            System.out.println("0. 뒤로가기");
            System.out.println("---------------------");
            System.out.println("주문할 메뉴번호를 입력하세요");
            int input = sc.nextInt();


            switch (input) {
                case 1, 2 -> {
                    System.out.println(drink.getMenuItem().get(input - 1));
                    exit();
                }
                case 0 -> {
                    System.out.println("뒤로가기 실행");
                    start();
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 입력해주세요");
                    continue;
                }
            }
            break;
        }
    }


    // 디저트 주문 기능
    public void dessertMenuOrder() {

        while (true) {
            System.out.println("[[DessertMenu]]");

            // 디저트 메뉴아이템 순차적 접근 후 출력
            for (MenuItem dessertItem : dessert.getMenuItem()) {
                System.out.println(dessertItem);
            }
            System.out.println("0. 뒤로가기");
            System.out.println("---------------------");
            System.out.println("주문할 메뉴번호를 입력하세요");
            int input = sc.nextInt();

            switch (input) {
                case 1, 2 -> {
                    System.out.println(dessert.getMenuItem().get(input - 1));
                    exit();
                }
                case 0 -> {
                    System.out.println("뒤로가기 실행");
                    start();
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 입력해주세요");
                    continue;
                }
            }
            break;
        }
    }


    // 주문이 완료된 후 종료여부를 선택하는 기능
    public void exit() {
        while (true) {
            System.out.println("[주문이 완료되었습니다]");
            System.out.println("키오스크를 종료 하시겠습니까?");
            System.out.println("0. 종료  |  1. 재시작");
            int input = sc.nextInt();

            switch (input) {
                case 0 -> {
                    System.out.println("키오스크를 종료합니다");
                }
                case 1 -> {
                    System.out.println("키오스크를 재시작 합니다");
                    start();
                }
                default -> {
                    System.out.println("잘못된 입력입니다 다시 입력해주세요");
                    continue;
                }
            }
            break;
        }
    }
}










