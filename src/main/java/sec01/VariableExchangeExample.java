package sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x: " + x + ", y: " + y);

        int temp = x; // 변수 x값 3을 temp라는 변수에 저장
        x = y; // 변수 y값 5를 x에 저장
        y = temp; // 변수 temp값 3을 y에 저장
        System.out.println("x: " + x + ", y: " + y);
        // 푸쉬 확인
    }
}