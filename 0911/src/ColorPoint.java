public class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super();
        this.color = "BLACK";
    }

    public ColorPoint(int x, int y) {
        super();
        super.move(x, y);
        this.color = "BLACK";
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.color + "색의 (" + super.getX() + ", " + super.getY() + ")의 점";
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // (0, 0) black
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10, 10); // (10, 10) black
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
