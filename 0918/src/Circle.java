public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Shape donut = new Circle(10); // 반지름이 10인 원 객체
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}
