package LV4;

import java.util.Scanner;

public class Kiosk {
    // Menu 객체 생성을 통해 이름 설정
    // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
    Menu burger = new Menu("1.Burger", Menu.getBurgerItem());
    Menu drink = new Menu("2.Drink", Menu.getDrinkItem());
    Menu dessert = new Menu("3.Dessert", Menu.getDessertItem());

    Scanner sc = new Scanner(System.in);

    // 키오스크의 첫시작
    // 카테고리 메뉴와 그 메뉴를 선택하여 각 메뉴 아이템리스트를 보여주거나 종료하는 입력기능
    public void start() {
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            System.out.println(burger.categoryname);
            System.out.println(drink.categoryname);
            System.out.println(dessert.categoryname);
            System.out.println("0. 종료");
            // 숫자 입력 받기
            System.out.println("[메뉴 카테고리 번호를 입력해주세요]");
            int input = sc.nextInt();
            // 숫자 0을 입력하면 종료
            switch (input) {
                case 1 -> {
                    burgermenuorder();
                }
                case 2 -> {
                    drinkmenuorder();
                }
                case 3 -> {
                    dessertmenuorder();
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

    // 선택한 메뉴카테고리를 보고 주문할 메뉴 선택후 주문하고 종료및 재실행 기능
    // 버거 주문
    public void burgermenuorder() {
        while (true) {
            System.out.println(burger.menuItem);
            System.out.println("0. 뒤로가기");
            System.out.println("---------------------");
            System.out.println("주문할 메뉴번호를 입력하세요");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println(burger.menuItem.get(0));
                    exit();
                }
                case 2 -> {
                    System.out.println(burger.menuItem.get(1));
                    exit();
                }
                case 3 -> {
                    System.out.println(burger.menuItem.get(2));
                    exit();
                }
                case 4 -> {
                    System.out.println(burger.menuItem.get(3));
                    exit();
                }
                case 0 -> {
                    System.out.println("뒤로가기 실행");
                    start();
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 입력해주세요");
                    burgermenuorder();
                }
            }
            break;
        }
    }

    // 음료 주문
    public void drinkmenuorder() {
        while (true) {
            System.out.println(drink.menuItem);
            System.out.println("0. 뒤로가기");
            System.out.println("---------------------");
            System.out.println("주문할 메뉴번호를 입력하세요");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println(drink.menuItem.get(0));
                    exit();
                }
                case 2 -> {
                    System.out.println(drink.menuItem.get(1));
                    exit();
                }
                case 0 -> {
                    System.out.println("뒤로가기 실행");
                    start();
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 입력해주세요");
                    drinkmenuorder();
                }
            }
            break;
        }
    }

    // 디저트 주문
    public void dessertmenuorder() {
        while (true) {
            System.out.println(dessert.menuItem);
            System.out.println("0. 뒤로가기");
            System.out.println("---------------------");
            System.out.println("주문할 메뉴번호를 입력하세요");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println(dessert.menuItem.get(0));
                    exit();
                }
                case 2 -> {
                    System.out.println(dessert.menuItem.get(1));
                    exit();
                }
                case 0 -> {
                    System.out.println("뒤로가기 실행");
                    start();
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 입력해주세요");
                    dessertmenuorder();
                }
            }
            break;
        }
    }


    // 종료여부를 선택하는 기능
    public void exit() {
        while (true) {
            System.out.println("[주문이 완료되었습니다]");
            System.out.println("키오스크를 종료 하시겠습니까?");
            System.out.println("0. 종료  |  ALL NUMBER. 재실행");
            int input2 = sc.nextInt();
            if (input2 == 0) {
                System.out.println("키오스크를 종료합니다");
                break;
            } else {
                System.out.println("키오스크를 다시 시작합니다");
                start();
            }
            break;
        }
    }
}










