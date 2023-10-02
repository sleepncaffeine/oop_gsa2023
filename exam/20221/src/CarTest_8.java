/*
8. Car 클래스와 이를 상속받는 Bus 클래스를 다음과 같이 작성했을 때. 프로그램 실행 결과를 적으시오. [4점]
*/

/////////////////////////////////////////////////////////////////////////////////////////

class Car1 {
    public void drive() {
        System.out.println("차가 달려갑니다.");
    }
}

class Bus extends Car1 {
    public void drive() {
        System.out.println("버스가 달려갑니다.");
    }
}

public class CarTest_8 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Car1 car = bus;

        bus.drive();
        car.drive();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// 버스가 달려갑니다.
// 버스가 달려갑니다.