/*
3. 다음은 Car 클래스를 이용하여 두 개의 인스턴스를 생성한 후, 각 인스턴스의 color, gearType, door의 수를 출력하는 프로그램이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [10점]
*/

// [결과]
// c1의 color=black, gearType=auto, door=4
// c2의 color=red, gearType=auto, door=4

/////////////////////////////////////////////////////////////////////////////////////////

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        // ① [2점] ;
        this("black", "auto", 4);
    }

    Car(String color) {
        // ② [2점] ;
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        // ③ [2점] ;
        this.color = color;
        // ④ [2점] ;
        this.gearType = gearType;
        // ⑤ [2점] ;
        this.door = door;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("red");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }

}
