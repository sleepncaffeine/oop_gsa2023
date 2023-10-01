/*
2. 다음은 5개의 정수를 입력받아 합을 구하는 프로그램이다. [8점]
  1) 빈 칸을 채워 InputMismatchException 예외를 처리하는 프로그램으로 완성하시오. [4점]
  2) ③, ④의 의미를 정확하게 설명하시오. [각 2점]
*/

// [결과]
// 5개의 정수를 입력하시오.
// 0>>5
// 1>>2
// 2>>a
// 정수가 아닙니다. 다시 입력하세요.
// 2>>7
// 3>>9
// 4>>r
// 정수가 아닙니다. 다시 입력하세요.
// 4>>3
// 합은 26

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하시오.");
        int sum = 0, n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ">>");
            try {
                // ① [2점]
                n = sc.nextInt();
            }
            // ② [2점] {
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                sc.next(); // ③ 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
                i--; // ④ for문의 증감식에서 i가 1 감소한다.
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        sc.close();
    }
}
