class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}

class Ambulance extends Car {
    void siren() {
        System.out.println("siren~~~");
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        Ambulance am = null;

        fe.water();
        car = fe; // car = (Car)fe;에서 형변환이 생략된 형태다.
        // car.water(); // 컴파일 에러, Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입
        fe2.water();
        am = (Ambulance) car; // 컴파일은 OK, 실행시 에러
        am.siren();
    }
}
