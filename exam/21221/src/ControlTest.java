/*
9. 다음은 Control 인터페이스를 구현한 TV 클래스와 Com 클래스를 이용한 프로그램이다.
각 물음에 답하시오. [서술형 28점]
  1) ①, ②에 들어갈 내용을 완성하시오. [4점]
  2) ③, ④의 가장 큰 차이점에 대해 설명하시오. [4점]
  3) 실행 시 오류가 발생하는 부부능ㄹ 찾아 이유와 해결 방법을 적으시오. [4점]
  4) 배열과 for-each문을 이용하여 ControlTest 클래스를 구현하시오. [16점]
*/
/////////////////////////////////////////////////////////////////////////////////////////

interface Control {
    default void repair() { // ③ [2점]
        System.out.println("REPAIR");
    }

    static void reset() { // ④ [2점]
        System.out.println("RESET");
    }

    private void show(String s) {
        System.out.println(s);
    }

    void turnOn();

    void turnOff();
}

// ① [2점] {
class TV implements Control {
    @Override
    public void turnOn() {
        System.out.println("turn on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off TV");
    }
}

// ② [2점] {
class Com implements Control {
    @Override
    public void turnOn() {
        System.out.println("turn on Com");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off Com");
    }
}

public class ControlTest {
    public static void main(String[] args) {
        TV tv = new TV();
        Com com = new Com();

        tv.turnOn();
        tv.turnOff();
        tv.repair();
        com.turnOn();
        com.turnOff();
        com.repair();
        tv.reset();
        com.reset();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// 2)
// ③ default 메소드는 인터페이스를 구현한 클래스에서 오버라이딩이 가능하다.
// ④ static 메소드는 인터페이스를 구현한 클래스에서 오버라이딩이 불가능하다.

// 3)
// 실행 시 오류가 발생하는 부분은 tv.reset(); com.reset(); 이다.
// Control.reset()과 같이 정적 메소드 호출을 통해 해결할 수 있다.
// 또는, reset 함수를 static이 아닌 default 메소드로 바꾸어 해결할 수 있다.

// 4)
// public class ControlTest {
// public static void main(String[] args) {
// Control[] devices = new Control[2];
// devices[0] = new TV();
// devices[1] = new Com();

// for (Control device : devices) {
// device.turnOn();
// device.turnOff();
// device.repair(); // repair()는 default 메소드이므로 오버라이딩하지 않아도 사용 가능
// }
// Control.reset(); // reset()은 정적(static) 메소드이므로 인터페이스 이름을 통해 호출
// }
// }
