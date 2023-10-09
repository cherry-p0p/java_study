package chapter_05.sec02;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        System.out.println("Scores[0] : " + scores[0]);
        System.out.println("Scores[1] : " + scores[1]);
        System.out.println("Scores[2] : " + scores[2]);

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / 3 );
    }
}