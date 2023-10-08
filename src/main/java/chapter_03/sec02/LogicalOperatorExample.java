package chapter_03.sec02;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if( (charCode >= 65) & (charCode <= 90) ) { // & 논리곱: 피연산자 모두 true일 경우에만 연산결과 true
            System.out.println("대문자군요");
        }


        int value = 6;

        if( (value%2 == 0) | (value%3 ==0) ) { // | 논리합: 피연산자 중 하나만 true이면 연산결과 true
            System.out.println("2 또는 3의 배수군요");
        }
    }
}
