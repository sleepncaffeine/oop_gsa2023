/*
1. 다음은 369 게임 프로그램이다. 규칙에 맞게 프로그램을 완성하시오. [8점]
*/

// [규칙]
// 1. 1~99의 정수를 입력받는다.
// 2. 3,6,9 중 하나가 있는 경우에는 "박수짝"을 출력한다.
// 3. 3,6,9 중 두 개 있는 경우에는 "박수짝짝"을 출력한다.
// 4. 3,6,9 중 하나도 없으면 "박수없음"을 출력한다.

// [결과]
// 1~99 사이의 정수를 입력하세요>>36
// 박수짝짝
//
// 1~99 사이의 정수를 입력하세요>>6
// 박수짝
//
// 1~99 사이의 정수를 입력하세요>>22
// 박수없음

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하세요>>");
        int n = scanner.nextInt();
        // ① [2점] ;
        int first = n / 10;
        // ② [2점] ;
        int second = n % 10;
        if (first == 0)
            first = 1;

        if (second == 0)
            second = 1;
        // ③ [2점]
        if (first % 3 == 0 && second % 3 == 0)
            System.out.println("박수짝짝");
        // ④ [2점]
        else if (first % 3 == 0 || second % 3 == 0)
            System.out.println("박수짝");
        else
            System.out.println("박수없음");
        scanner.close();
    }
}
