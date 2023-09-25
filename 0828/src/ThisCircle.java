public class ThisCircle {
    int radius;

    public ThisCircle(int radius) {
        this.radius = radius;
    }

    public void set(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        ThisCircle ob1 = new ThisCircle(1);
        ThisCircle ob2 = new ThisCircle(2);
        ThisCircle ob3 = new ThisCircle(3);

        ob1.set(4);
        ob2.set(5);
        ob3.set(6);
    }

}
