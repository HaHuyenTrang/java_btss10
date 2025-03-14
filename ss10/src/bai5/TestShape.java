package bai5;

public class TestShape {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle = new Circle(5);
        circle.displayInfo();

        // Thử đặt bán kính không hợp lệ
        circle.setRadius(-3);
        circle.displayInfo();

        // Tạo đối tượng Cylinder
        Cylinder cylinder = new Cylinder(4, 10);
        cylinder.displayInfo();

        // Thay đổi giá trị bán kính và chiều cao
        cylinder.setRadius(3);
        cylinder.setHeight(10);
        cylinder.displayInfo();

        // Thử đặt chiều cao không hợp lệ
        cylinder.setHeight(-1);
        cylinder.displayInfo();
    }
}
