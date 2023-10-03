/*
7. 다음은 부모 클래스와 자식 클래스 사이의 생성자 관계를 보여주는 프로그램이다.
각 물음에 답하시오. [서술형 8점]
  1) 실행 결과를 적으시오. [4점]
  2) 다음과 같이 실행 결과가 나오게 하려면 어떻게 해야 하는지 구체적으로 설명하시오. [4점]
  ```
  메개변수가 있는 A의 생성자: 3
  메개변수가 있는 B의 생성자: 3
  ```
*/

/////////////////////////////////////////////////////////////////////////////////////////

class A {
    public A() {
        System.out.println("A의 생성자");
    }

    public A(int x) {
        System.out.println("메개변수가 있는 A의 생성자: " + x);
    }
}

class B extends A {
    public B() {
        System.out.println("B의 생성자");
    }

    public B(int x) {
        // super(x); 2) 번
        System.out.println("매개변수가 있는 B의 생성자: " + x);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        B b = new B(3);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// 1)
// A의 생성자
// 매개변수가 있는 B의 생성자: 3

// 2)
// public B(int x) {
// super(x); 2) 번
// System.out.println("매개변수가 있는 B의 생성자: " + x);
// }
// 위와 같이 바꾼다.