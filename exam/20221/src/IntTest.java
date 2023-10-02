/*
9. 다음은 a, b의 값을 비교하는 프로그램이다.
실행 겨로가를 보고 빈 칸에 들어갈 내용을 완성하시오. [10점]
*/

// [결과]
// a= 5
// b= 3
// a가 크다

// a= 33
// b= 33
// a와 b가 같다.

// a= 1
// b= 10
// b가 크다

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Int {
    private int v;

    public Int(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }
}

public class IntTest {
    static int compare(Int x, Int y) {
        // if( ① [2점] )
        if (x.getV() > y.getV()) {
            // ② [2점] ;
            return 1;
        }
        // else if( ③ [2점] )
        else if (x.getV() < y.getV()) {
            // ④ [2점] ;
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int balance;
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int ta = sc.nextInt();
        System.out.print("b= ");
        int tb = sc.nextInt();
        Int a = new Int(ta);
        Int b = new Int(tb);
        // ⑤ [2점] ;
        balance = compare(a, b);
        if (balance == 1)
            System.out.println("a가 크다");
        else if (balance == -1)
            System.out.println("b가 크다");
        else
            System.out.println("a와 b가 같다.");
        sc.close();
    }
}
