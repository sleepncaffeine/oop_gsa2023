/*
4. 다음은 음수가 아닐 때까지 키보드로 입력된 정수 데이터를 동적 배열에 추가한 후 합계와 평균을 구하는 프로그램이다.
실행 결과를 참고하여 빈 칸에 들어갈 내용을 완성하시오. [서숧형 12점]
*/

// [결과]
// 80
// 60
// 40
// 20
// -1
// 합계 = 200
// 평균 = 50.0

/////////////////////////////////////////////////////////////////////////////////////////

// ① [2점] ;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ② [2점] ;
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int list;
        int sum = 0;

        // while ( ③ [2점] )
        while ((list = sc.nextInt()) >= 0)
            // ④ [2점] ;
            scores.add(list);

        for (int i = 0; i < scores.size(); i++)
            // ⑤ [2점] ;
            sum += scores.get(i);

        System.out.println("합계 = " + sum);
        // System.out.println("평균 = " + ⑥ [2점] );
        System.out.println("평균 = " + (double) sum / scores.size());
        sc.close();
    }
}
