/*
4. 다음 프로그램을 보고 물음에 답하시오.
*/

// 1) 오류가 발생하는 곳을 찾아 행 번호를 적고 그 이유를 설명하시오. [단답형 1점, 서술형 2점]
// 2) 1)의 오류 발생 코드를 주석 처리한 이후 실행 결과를 적으시오. [단답형 2점]

/////////////////////////////////////////////////////////////////////////////////////////

class CircleC {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public CircleC(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        CircleC c1 = new CircleC(3.0);
        CircleC c2 = new CircleC(5.0);

        // print();
        System.out.println("원의 수: " + CircleC.numOfCircles);
        System.out.println("원의 수: " + c2.numCircles);
    }

    void print() {
        System.out.println("원의 수를 출력합니다.");
    }
}
