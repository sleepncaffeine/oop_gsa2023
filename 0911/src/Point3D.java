public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super();
        super.move(x, y);
        this.z = z;
    }

    public void moveUp() {
        this.z++;
    }

    public void moveDown() {
        this.z--;
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")" + "의 점";
    }

    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }
}
