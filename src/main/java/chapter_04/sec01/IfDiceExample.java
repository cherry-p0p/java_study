package chapter_04.sec01;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        // int num = (int) (Math.random() * n) + start;
        // start부터 시작하는 n개의 정수 중에 랜덤으로 하나 뽑기

        if(num == 1) {
            System.out.println("1번이 나왔습니다.");
        } else if(num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else if(num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if(num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if(num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
