class Shape1 {
    protected String name;

    public void paint() {
        draw();
    }

    public void draw() {
        System.out.println(name);
    }
}

public class SuperKeywordEx extends Shape1 {
    protected String name;

    @Override
    public void draw() {
        name = "Circle";
        super.name = "Shape";
        super.draw();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Shape1 b = new SuperKeywordEx();
        b.paint();
    }
}
