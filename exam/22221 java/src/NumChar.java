/*
10. 다음은 0~9의 문자로 된 숫자를 입력받았을 때, 입력값이 0~9의 모든 숫자를 각각 한 번씩만 사용한 것인지 확인하는 프로그ㅐㄻ이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [서술형 10점]
*/

// [실행 결과]
// false
// true
// true
// false
// false

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;

public class NumChar {
    static boolean chkDupNum(String data) {
        // ① [2점] ; // 참조 변수명은 res
        ArrayList<String> res = new ArrayList<String>();
        for (String c : data.split("")) {
            // if ( ② [2점] ) {
            if (res.contains(c)) {
                /// ③ [2점] ;
                return false;
            } else {
                // ④ [2점] ;
                res.add(c);
            }
        }
        // ⑤ [2점] ;
        return res.size() == 10;
    }

    public static void main(String[] args) {
        System.out.println(chkDupNum("01234"));
        System.out.println(chkDupNum("6789012345"));
        System.out.println(chkDupNum("0123456789"));
        System.out.println(chkDupNum("00123456789"));
        System.out.println(chkDupNum("012322456789"));
    }
}
