/*
1. 다음은 영어와 한글 배열을 생성하고 사용자로부터 영어를 입력받아 한글을 출력하는 프로그램이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [서술형 10점]
*/

// [실행 결과]
// 영어 입력>> abstract
// 추상적인
// 영어 입력>> rivalry
// 경쟁
// 영어 입력>> potent
// 단어가 없습니다
// 영어 입력>> exit
// 종료합니다

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class KEDict {
    public static void main(String[] args) {
        String eng[] = { "froze", "rivalry", "fable", "abstract", "potential" };
        String kor[] = { "얼어붙다", "경쟁", "우화", "추상적인", "잠재적인" };

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("영어 입력>> ");

            // String key = ① [2점] ;
            String key = sc.next();
            // if( ② [2점] )
            if (key.equals("exit"))
                break;
            int i;
            // for( i=0; ③ [2점]; i++ ) {
            for (i = 0; i < eng.length; i++) {
                // if( ④ [2점] ) {
                if (key.equals(eng[i])) {
                    System.out.println(kor[i]);
                    break;
                }
            }
            // if( ⑤ [2점] )
            if (i == eng.length)
                System.out.println("단어가 없습니다");
        }
        System.out.println("종료합니다");
        sc.close();
    }
}
