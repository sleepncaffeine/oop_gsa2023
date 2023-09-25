class MyPoint {
    private int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        MyPoint p = (MyPoint) obj;
        if (x == p.x && y == p.y)
            return true;
        else
            return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        MyPoint a = new MyPoint(3, 4);
        MyPoint b = new MyPoint(3, 4);
        MyPoint c = new MyPoint(5, 6);
        if (a == b)
            System.out.println("a==b");
        if (a.equals(b))
            System.out.println("a is equal to b");
        if (a.equals(c))
            System.out.println("a is equal to c");
    }
}
