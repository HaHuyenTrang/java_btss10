package bai4;

public class TestBook {
    public static void main(String[] args) {
        // Tạo đối tượng Book với thông tin ban đầu
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1900);
        book1.displayInfo(); // Hiển thị thông tin sách

        // Thử thay đổi thông tin sách
        book1.setTitle("HẠnh phúc 1 tang gia");
        book1.setAuthor("J.K. Rowling");
        book1.setPrice(-10.50); // Giá không hợp lệ (âm)

        // Hiển thị lại thông tin sau khi cập nhật
        book1.displayInfo();

        // Tạo một sách khác với giá không hợp lệ
        Book book2 = new Book(" Hobbit", "TRang. Tolkien", -5.00);
        book2.displayInfo();
    }
}
