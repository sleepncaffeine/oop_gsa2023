/*
6. 다음은 문자열을 입력받았을 때 공백을 제외한 글자 수를 출력하느 ㄴ프로그램이다.
실행 결과를 보고 빈 킨에 들어갈 내용을 완성하시오. [단답형 4점, 서술형 6점]
*/

// [실행 결과]
// 9
// 10

/////////////////////////////////////////////////////////////////////////////////////////

public class CountSpace {
    static int countSpace(String s) {
        int res = 0;
        // for ( ① [서술형 2점] ) { // 공백이 아닌 경우 결과값 증가
        for (int i = 0; i < s.length(); i++) { // 공백이 아닌 경우 결과값 증가
            // if ( ② [서술형 2점] ) {
            if (s.charAt(i) != ' ') {
                // ③ [단답형 2점] ;
                res++;
            }
        }
        // ④ [서술형 2점] ;
        return res;
    }

    public static void main(String[] args) {
        // System.out.prinln( ⑤ [단답형 2점] ("객체 지향 프로그래밍"));
        System.out.println(countSpace("객체 지향 프로그래밍"));
        // System.out.prinln( ⑥ [단답형 2점] ("자바 자바 자바는 즐거워"));
        System.out.println(countSpace("자바 자바 자바는 즐거워"));
    }
}
