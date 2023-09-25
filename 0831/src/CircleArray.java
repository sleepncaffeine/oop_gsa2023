class Circles {
    int radius;

    public Circles(int radius) {
        this.radius = radius;
    } // 생성자

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circles[] c;
        c = new Circles[5];

        for (int i = 0; i < c.length; i++)
            c[i] = new Circles(i);

        for (int i = 0; i < c.length; i++)
            System.out.print((int) (c[i].getArea()) + " ");
    }
}
