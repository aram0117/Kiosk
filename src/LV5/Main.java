package LV5;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        try {
            kiosk.start();
        } catch (Exception e) {
            System.out.println("잘못된 잡근 방식입니다");
        }
    }
}
