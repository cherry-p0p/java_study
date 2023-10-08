package chapter_02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hours = 3;
        int minute = 5;
        System.out.println(hours + "시간 " + minute + "분");

        int total = hours * 60 + minute;
        System.out.println("총 " + total + "분");
    }
}
