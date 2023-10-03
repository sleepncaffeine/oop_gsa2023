/*
5. 다음 프로그램의 실행 결과를 적고 결과에 대한 이유를 적으시오. [단답형 4점, 서술형 4점]
*/

/////////////////////////////////////////////////////////////////////////////////////////

class Circle1 {
    double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

public class ObjectArgumentDemo {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(7.0);
        Circle1 c2 = new Circle1(7.0);

        method(c1);
        System.out.println("원(c1)의 반지름 : " + c1.radius);

        method(c2.radius);
        System.out.println("원(c2)의 반지름 : " + c2.radius);
    }

    public static void method(Circle1 c) {
        c.radius = 0.0;
    }

    public static void method(double r) {
        r = 0.0;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// 결과:
// 원(c1)의 반지름 : 0.0
// 원(c2)의 반지름 : 7.0

// 이유:
// method(c1)에서 c1.radius의 값이 0.0으로 바뀌었기 때문에
// method(c1)에서는 c1의 주소값이 전달되었기 때문에 c1.radius의 값이 바뀌었다.
// method(c2.radius)에서 c2.radius의 값이 바뀌지 않았다.
// method(c2.radius)에서는 c2.radius의 값이 복사되어 전달되었기 때문이다.
