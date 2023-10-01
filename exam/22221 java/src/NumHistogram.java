/*
2. 다음은 0~99 사이의 정수를 1-개 입력받아 10단위 간격의 히스토그램을 출력하는 프로그램이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [서술형 10점]
*/

// [실행 결과]
// 1번째 값: 9
// 2번째 값: 76
// 3번째 값: 34
// 4번째 값: 72
// 5번째 값: 7
// 6번째 값: 12
// 7번째 값: 55
// 8번째 값: 80
// 9번째 값: 89
// 10번째 값: 52
// [출력]
// 0~9:**
// 10~19:*
// 20~29:
// 30~39:*
// 40~49:
// 50~59:**
// 60~69:
// 70~79:**
// 80~89:**
// 90~99:

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class NumHistogram {
    public static void main(String args[]) {
        String[] arr = new String[10];
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 값: ");
            // ① [2점] ;
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            // arr[i] = ② [2점] ;
            arr[i] = (i * 10) + "~" + ((i + 1) * 10 - 1) + ":";
        }

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                // if( ③ [2점] )
                if (i == num[j] / 10)
                    // ④ [2점] ;
                    arr[i] += "*";

        System.out.println("[출력]");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
