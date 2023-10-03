/*
8. 다음 프로그램에서 오류가 발생하는 곳을 찾아 이유를 적으시오. [서술형 6점]
*/

/////////////////////////////////////////////////////////////////////////////////////////

class Modi01 {
    private int pr = 1;
    int defa = 2;
    protected int prot = 3;
    public int pub = 4;

    public void show() {
    }
}

class Modi02 extends Modi01 {
    void print() {
        System.out.println(pr);
        System.out.println(defa);
        System.out.println(prot);
        System.out.println(pub);
    }

    public void show() {
    }
}

public class ModiTest {
    public static void main(String[] args) {
        Modi02 modi = new Modi02();
        System.out.println(modi.pr);
        System.out.println(modi.defa);
        System.out.println(modi.prot);
        System.out.println(modi.pub);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// pr 변수는 private으로 선언되어 있어서 외부에서 접근할 수 없다.
