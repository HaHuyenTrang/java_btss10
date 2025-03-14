package bai3;

import java.time.Year; // Dùng để lấy năm hiện tại

// Lớp Car với tính đóng gói
public class Car {
    // Thuộc tính private
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year); // Kiểm tra tính hợp lệ của year
    }

    // Getter cho make
    public String getMake() {
        return make;
    }

    // Setter cho make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter cho model
    public String getModel() {
        return model;
    }

    // Setter cho model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter cho year
    public int getYear() {
        return year;
    }

    // Setter cho year (Kiểm tra năm hợp lệ)
    public void setYear(int year) {
        int currentYear = Year.now().getValue(); // Lấy năm hiện tại
        if (year > 1885 && year <= currentYear) { // Ô tô xuất hiện sau năm 1885
            this.year = year;
        } else {
            System.out.println("fix " + currentYear);
            this.year = currentYear; // Gán giá trị mặc định nếu nhập sai
        }
    }

    // Phương thức hiển thị thông tin xe
    public void displayInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

