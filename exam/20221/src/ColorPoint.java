/*
5. 다음은 2차원 상의 한 점을 표현하는 Point 클래스와 Point 클래스를 상속받은 ColorPoint 클래스럴 작성한 프로그램이다.
실행 결과를 보고 빈 칸을 채우시오. [18점]
*/

// [결과]
// YELLOW색(5,10)

/////////////////////////////////////////////////////////////////////////////////////////

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // ① [2점] {
    public int getX() {
        // ② [2점] ;
        return x;
    }

    // ③ [2점] {
    public int getY() {
        // ④ [2점] ;
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ColorPoint extends Point {
    private String color;

    // ⑤ [2점] {
    public ColorPoint(int x, int y, String color) {
        // ⑥ [2점] ;
        super(x, y);
        // ⑦ [2점] ;
        this.color = color;
    }

    // ⑧ [2점] {
    public void setPoint(int x, int y) {
        // ⑨ [2점] ;
        move(x, y);
    }

    void setColor(String color) {
        this.color = color;
    }

    void show() {
        System.out.println(color + "색" + "(" + getX() + "," + getY() + ")");
    }

    public static void main(String[] args) {
        ColorPoint cd = new ColorPoint(3, 3, "White");
        cd.setPoint(5, 10);
        cd.setColor("YELLOW");
        cd.show();
    }
}
