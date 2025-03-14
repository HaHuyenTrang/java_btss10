package bai5;

// Lớp Cylinder (Hình trụ) kế thừa từ Circle
public class Cylinder extends Circle {
    // Thuộc tính private height để bảo vệ dữ liệu
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius); // Gọi constructor của lớp cha
        setHeight(height); // Kiểm tra giá trị hợp lệ
    }

    // Getter cho height
    public double getHeight() {
        return height;
    }

    // Setter cho height (Chiều cao không âm)
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("fixxx");
            this.height = 0.0;
        }
    }

    // Phương thức tính thể tích hình trụ (PI * radius^2 * height)
    public double getVolume() {
        return getArea() * height;
    }

    // Hiển thị thông tin hình trụ
    public void displayInfo() {
        System.out.println("Cylinder - Radius: " + getRadius() + ", Height: " + height + ", Volume: " + getVolume());
    }
}

