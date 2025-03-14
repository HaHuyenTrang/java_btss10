package bai6;

// Lớp MoveablePoint kế thừa từ Point (Điểm có thể di chuyển)
public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    // Constructor
    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y); // Gọi constructor của lớp cha
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter và Setter cho xSpeed
    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter và Setter cho ySpeed
    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Phương thức move() để cập nhật tọa độ của điểm
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }


    public String toString() {
        return super.toString() + " with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}

