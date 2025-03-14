package bai4;

// Lớp Book với tính đóng gói
public class Book {
    // Thuộc tính private
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // Kiểm tra tính hợp lệ của price
    }

    // Getter cho title
    public String getTitle() {
        return title;
    }

    // Setter cho title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter cho author
    public String getAuthor() {
        return author;
    }

    // Setter cho author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter cho price
    public double getPrice() {
        return price;
    }

    // Setter cho price (Kiểm tra giá không âm)
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("fix");
            this.price = 0.0;
        }
    }

    // Phương thức hiển thị thông tin sách
    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

