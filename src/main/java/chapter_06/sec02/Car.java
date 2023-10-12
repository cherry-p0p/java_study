package chapter_06.sec02;

public class Car {
    // 필드 : 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터를 저장하는 곳
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    // 초기값이 저장되지 않은 필드는 생성 시 자동으로 기본 초기값으로 설정, int의 경우에는 초기값 0
    int speed;
}
