package chapter_03.sec02;

public class SignOperatorExample {
    public static void main(String[] arge) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        int result3 = -b; // byte result3 = -b 안됨
        System.out.println("result3=" + result3);
    }
}
