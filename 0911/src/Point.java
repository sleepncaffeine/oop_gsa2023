class Point {
    private int x, y;

    public Point() {
        this.x = this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}