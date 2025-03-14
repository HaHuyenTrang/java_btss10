package bai3;

public class TestCar {
    public static void main(String[] args) {
        // Tạo đối tượng Car với thông tin ban đầu
        Car car1 = new Car("Toyota", "shin", 2020);
        car1.displayInfo(); // Hiển thị thông tin xe

        // Thử thay đổi thông tin xe
        car1.setMake("Honda");
        car1.setModel("Civic");
        car1.setYear(2025); // Năm không hợp lệ (lớn hơn năm hiện tại)

        // Hiển thị lại thông tin sau khi cập nhật
        car1.displayInfo();

        // Tạo một xe khác với năm không hợp lệ
        Car car2 = new Car("Ford", "Eveerest", 1980); // Năm nhỏ hơn 1885
        car2.displayInfo();
    }
}
