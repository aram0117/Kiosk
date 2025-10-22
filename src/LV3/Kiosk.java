package LV3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 입력 관리 기능
    public void start() {
        // 메뉴 이름, 가격, 설명이 들어간 메뉴아이템 인스턴스
        MenuItem menu1 = new MenuItem("1.ShackBurger", "W6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("2.SmokeShack", "W8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("3.Cheeseburger", "W6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem("4.Hamburger", "W5.4", "비프패티를 기반으로 야채가 들어간 기본버거");

        // list of로 lISt에 메뉴삽입
        List<MenuItem> menuItemList = new ArrayList<>(List.of(menu1, menu2, menu3, menu4));

        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 스위치문에 주문번호 입력조건과 주문실행후 continue로 while문 재실행
        // 0을 입력하면 break로 반복문종료
        while (true) {
            System.out.println("[ SHAKESHACK BURGERS MENU ]");
            // for each문으로 메뉴아이템 하나씩 출력
            for (MenuItem menuItem : menuItemList) {
                System.out.println(menuItem.name + " [가격]" + menuItem.price + " [설명]" + menuItem.explanation);
            }
            System.out.println("0. 종료 |  종료");
            System.out.println("--------------------------------------");

            // 메뉴 번호를 입력 후 주문
            System.out.println("[메뉴번호를 입력하세요]");
            int input = sc.nextInt();

            // 0이 입력되면 종료
            if (input == 0) {
                System.out.println("키오스크를 종료됩니다");
                break;
            }

            // 각 주문번호에 해당하는 메뉴 실행
            switch (input) {
                case 1 -> {
                    System.out.println(menu1.name + " | " + menu1.price + " | " + menu1.explanation);
                    System.out.println("[주문이 완료되었습니다]");
                    System.out.println("--------------------------------------");
                    break;
                }
                case 2 -> {
                    System.out.println(menu2.name + " | " + menu2.price + " | " + menu2.explanation);
                    System.out.println("[주문이 완료되었습니다]");
                    System.out.println("--------------------------------------");
                    break;
                }
                case 3 -> {
                    System.out.println(menu3.name + " | " + menu3.price + " | " + menu3.explanation);
                    System.out.println("[주문이 완료되었습니다]");
                    System.out.println("--------------------------------------");
                    break;
                }
                case 4 -> {
                    System.out.println(menu4.name + " | " + menu4.price + " | " + menu4.explanation);
                    System.out.println("[주문이 완료되었습니다]");
                    System.out.println("--------------------------------------");
                    break;
                }
                // 잘못된 번호입력시 메뉴로 돌아감
                default -> {
                    System.out.println("잘못된 번호입니다 다시 메뉴번호를 입력해주세요");
                    System.out.println("--------------------------------------");
                    continue;
                }
            }
            // 메뉴 주문 후 종료와 키오스크 재실행 여부를 입력
            System.out.println("[1.return 입력 | 재실행 2.아무 문자나 입력 | 종료]");
            String strinput = sc.next();
            if (strinput.equalsIgnoreCase("return")) {
                System.out.println("메뉴로 돌아갑니다");
                continue;
            }
            System.out.println("키오스크를 종료됩니다");
            break;
        }
    }
}



