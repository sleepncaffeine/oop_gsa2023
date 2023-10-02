/*
6. 다음의 코드를 컴파일하면 에러가 발생한다.
그 이유를 구체적으로 설명하고 에러를 수정하기 위한 해결 방안을 적으시오. [6점]
  1) 이유 [3점]
  2) 해결방안 [3점]
*/

/////////////////////////////////////////////////////////////////////////////////////////

class Parent {
    public Parent(String a) {
        System.out.println("Parent-1");
    }
    // public Parent() {
    // System.out.println("Parent");
    // }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child-1");
    }
}

public class ConsTest {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// 이유: 부모 클래스에 기본 생성자가 없기 때문에 자식 클래스에서 super()를 통해 부모 클래스의 생성자를 호출할 수 없다.
// 해결방안: 부모 클래스에 기본 생성자를 추가한다.