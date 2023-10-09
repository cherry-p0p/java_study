package chapter_05.sec01;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";  // strVar1과 strVar2은 동일한 문자열 "신민철"을 참조, 동일한 String 객체 참조

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }


        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");  // new 연산자는 힙 영역에 새로운 연산자를 만듦, 객체 생성 연산자

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }  // 따라서 new 연산자로 객체를 생성했을 경우 문자열은 같지만 참조가 다름

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}