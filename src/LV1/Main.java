package LV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 인스턴스 구현
        Scanner sc = new Scanner(System.in);

        // 0을 입력하면 반복문이 참이되어 키오스크를 종료
        while (true) {
            // 햄버거 메뉴
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1 ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2 SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");
            System.out.println("[메뉴번호를 입력하세요]");
            int input = sc.nextInt();

            // 스위치문에 주문번호 입력조건과 주문실행후 continue로 while문 재실행
            // 0을 입력하면 break로 반복문종료
            switch (input) {
                case 1 -> {
                    System.out.println("메뉴선택 : 1.ShackBurger");
                    System.out.println("--------------------------------------");
                    continue;
                }
                case 2 -> {
                    System.out.println("메뉴선택 : 2.SmokeShack");
                    System.out.println("--------------------------------------");
                    continue;
                }
                case 3 -> {
                    System.out.println("메뉴선택 : 3.Cheeseburger");
                    System.out.println("--------------------------------------");
                    continue;
                }
                case 4 -> {
                    System.out.println("메뉴선택 : 4.Hamburger");
                    System.out.println("--------------------------------------");
                    continue;
                }
                case 0 -> {
                    // 스위치문 종료
                    break;
                }
                default -> {
                    System.out.println("잘못된 번호입니다 다시 메뉴번호를 입력해주세요");
                    System.out.println("--------------------------------------");
                    continue;
                }
            }
            // 반복문 종료
            System.out.println("키오스크를 종료됩니다");;
            break;
        }
    }
}

