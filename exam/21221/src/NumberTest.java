/*
3. 다음은 주어진 문자열이 모두 숫자이면 true를, 아니면 false를 반환하는 프로그램이다.
주석과 실행 결과를 참고하여 빈 칸에 들어갈 내용을 완성하시오. [서술형 12점]
*/

// [결과]
// 333은/는 숫자입니까? true
// 3434gsa은/는 숫자입니까? false

/////////////////////////////////////////////////////////////////////////////////////////

public class NumberTest {
    public static boolean isNumber(String str) {
        // 주어진 문자열이 null이거나 빈 문자열이면 false 반환
        // ① [2점] {
        if (str == null || str.equals("")) {
            // ② [2점] ;
            return false;
        }

        // 주어진 문자열을 한 문자씩 읽어 char 타입 변수 ch에 저장하고
        // ch가 숫자가 아니면 false를 반환
        // ③ [2점] {
        for (int i = 0; i < str.length(); i++) {
            // ④ [2점] ;
            char ch = str.charAt(i);
            // ⑤ [2점] {
            if (ch < '0' || ch > '9') {
                // ② [2점] ;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "333";
        // System.out.println(str+"은/는 숫자입니까? "+ ⑥ [2점] );
        System.out.println(str + "은/는 숫자입니까? " + isNumber(str));
        str = "3434gsa";
        // System.out.println(str+"은/는 숫자입니까? "+ ⑥ [2점] );
        System.out.println(str + "은/는 숫자입니까? " + isNumber(str));
    }
}
