/*
7. 다음 프로그램의 실행 결과를 적으시오. [6점]
*/

/////////////////////////////////////////////////////////////////////////////////////////

class SuperA {
    int x = 10;
}

class SubA extends SuperA {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        SubA sb = new SubA();
        sb.method();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// x=20
// this.x=20
// super.x=10