/*
1. 다음은 생성자 오버로딩 프로그램이다.
실행 결과를 참고하여 빈 칸에 들어갈 내용을 완성하시오. [서술형 10점]
*/

// [결과]
// c1의 색상은 black이고 반지름은 10.0입니다.
// c2의 색상은 red이고 반지름은 10.0입니다.
// c3의 색상은 blue이고 반지름은 5.0입니다.
// c4의 색상은 yellow이고 반지름은 5.0입니다.

/////////////////////////////////////////////////////////////////////////////////////////

class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        // ① [2점] ;
        this.radius = radius;
        // ② [2점] ;
        this.color = color;
    }

    public Circle(double radius) {
        // ③ [2점] ;
        this(radius, "red");
    }

    public Circle(String color) {
        // ④ [2점] ;
        this(5.0, color);
    }

    public Circle() {
        // ⑤ [2점] ;
        this(5.0, "yellow");
    }
}

public class CircleTest {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle(10.0, "black");
        Circle c2 = new Circle(10.0);
        Circle c3 = new Circle("blue");
        Circle c4 = new Circle();
        System.out.println("c1의 색상은 " + c1.color + "이고 반지름은 " + c1.radius + "입니다.");
        System.out.println("c2의 색상은 " + c2.color + "이고 반지름은 " + c2.radius + "입니다.");
        System.out.println("c3의 색상은 " + c3.color + "이고 반지름은 " + c3.radius + "입니다.");
        System.out.println("c4의 색상은 " + c4.color + "이고 반지름은 " + c4.radius + "입니다.");
    }
}
