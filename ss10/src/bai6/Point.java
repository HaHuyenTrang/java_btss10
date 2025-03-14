package bai6;

// Lớp Point (Đại diện cho điểm trong không gian 2D)
public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter và Setter cho x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getter và Setter cho y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Phương thức toString() để hiển thị tọa độ của điểm
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

