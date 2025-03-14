package bai5;

// Lớp Circle (Hình tròn)
public class Circle {
    // Thuộc tính private để đảm bảo tính bao đóng
    private double radius;

    // Constructor
    public Circle(double radius) {
        setRadius(radius); // Kiểm tra giá trị hợp lệ
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    // Setter cho radius (Kiểm tra bán kính không âm)
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("fixxx");
            this.radius = 0.0;
        }
    }

    // Phương thức tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Hiển thị thông tin hình tròn
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius + ", Area: " + getArea());
    }
}

