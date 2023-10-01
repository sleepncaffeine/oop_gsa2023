/*
8. 다음 프로그램의 실행 결과를 적으시오. [서술형 10점]
*/

// 매개변수 있는 A 생성자
// 매개변수 없는 A 생성자
// 매개변수 있는 A 생성자
// 매개변수 있는 A 생성자
// 매개변수 없는 A 생성자
// 매개변수 있는 B 생성자
// 매개변수 없는 B 생성자
// 매개변수 있는 A 생성자
// 매개변수 없는 A 생성자
// 매개변수 있는 B 생성자

/////////////////////////////////////////////////////////////////////////////////////////

class A {
    A() {
        this(3);
        System.out.println("매개변수 없는 A 생성자");
    }

    A(int a) {
        System.out.println("매개변수 있는 A 생성자");
    }
}

class B extends A {
    B() {
        this(3);
        System.out.println("매개변수 없는 B 생성자");
    }

    B(int a) {
        System.out.println("매개변수 있는 B 생성자");
    }
}

public class Thisclass {
    public static void main(String[] args) {
        A aa1 = new A();
        A aa2 = new A(3);
        B bb1 = new B();
        B bb2 = new B(3);
    }
}