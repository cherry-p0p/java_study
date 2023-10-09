package chapter_05.sec02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};  // 배열 변수를 이미 선언한 후 값 목록들이 나중에 결정되면 new 연산자 사용
        int sum1 = 0;
        for(int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        int sum2 = add ( new int[] {83, 90, 87} );
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    public static int add(int[] scores) {
        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
