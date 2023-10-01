/*
1. 다음은 5개의 문자열을 읽어 스택 객체에 저장하고 이를 꺼내 반대 순서로 출력하는 프로그램이다.
주석과 실행 결과를 보고 빈 칸에 들어갈 코드를 완성하시오. [단답형 9점, 서숧형 3점]
*/

// [실행 결과]
// >> the sound of autumn coming
// coming autumn of sound the

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

interface StackInterface {
    int length();

    String pop();

    boolean push(String ob);
}

// class StringStack ① [단답형 1.5점] StackInterface {
class StringStack implements StackInterface {
    private String[] element;
    private int index;

    public StringStack(int capacity) {
        element = new String[capacity];
        index = 0;
    }

    @Override
    public int length() {
        return index;
    }

    @Override
    public String pop() {
        if (index == 0) // 스택이 비었음
            return null;
        // ② [단답형 1.5점] ; // 스택 포인터 감소
        --index; // 스택 포인터 감소
        // return ③ [단답형 2점] ;
        return element[index];
    }

    @Override
    public boolean push(String ob) {
        // if( index == ④ [단답형 2점] ) // 스택이 가득 참
        if (index == element.length) // 스택이 가득 참
            return false;
        // ⑤ [단답형 2점] = ob; // 스택에 저장 후 스택 포인터 증가
        element[index++] = ob; // 스택에 저장 후 스택 포인터 증가
        return true;
    }
}

public class StackTest {
    public static void main(String[] args) {
        StringStack s = new StringStack(10);
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
        for (int i = 0; i < 5; i++) {
            String text = sc.next();
            // ⑥ [서술형 1.5점] ;
            s.push(text);
        }

        int count = s.length();
        for (int i = 0; i < count; i++)
            // System.out.print( ⑦ [서술형 1.5점] + " ");
            System.out.print(s.pop() + " ");

        sc.close();
    }
}
