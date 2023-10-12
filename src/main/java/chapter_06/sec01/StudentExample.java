package chapter_06.sec01;

// 실행 클래스
public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        // Student 클래스는 하나지만 new 연산자를 사용한 만큼 객체가 메모리에 생성
        // 이러한 객체들은 Student의 인스턴
        Student s2 = new Student();
        System.out.println("s1 변수가 또 다른 Student 객체를 참조합니다.");
    }
}