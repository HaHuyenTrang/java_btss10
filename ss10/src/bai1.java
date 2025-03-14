public class bai1 {
    //1.Tính đóng gói (Encapsulation) là một nguyên tắc trong lập trình hướng đối tượng giúp bảo vệ dữ liệu bên trong đối tượng bằng cách giới hạn quyền truy cập trực tiếp vào dữ liệu. Thay vì cho phép truy cập trực tiếp, chúng ta cung cấp các phương thức đặc biệt (getter và setter) để kiểm soát dữ liệu.
    //
    //Tại sao tính đóng gói quan trọng?
    //Bảo vệ dữ liệu: Ngăn chặn truy cập hoặc sửa đổi dữ liệu một cách không kiểm soát.
    //Kiểm soát quyền truy cập: Chỉ cho phép truy cập dữ liệu thông qua các phương thức an toàn.
    //Dễ bảo trì và mở rộng: Dễ dàng thay đổi nội bộ mà không ảnh hưởng đến mã bên ngoài.
    //Tăng tính bảo mật: Giúp giảm thiểu lỗi và các vấn đề bảo mật.
    //2. Làm thế nào để áp dụng tính đóng gói trong Java?
    //Trong Java, để áp dụng tính đóng gói, chúng ta thực hiện các bước sau:
    //
    //Khai báo các biến thành private để ngăn chặn truy cập trực tiếp từ bên ngoài.
    //Cung cấp các phương thức getter và setter để truy cập và cập nhật giá trị một cách an toàn.
    //Getter và Setter là gì?
    //Getter: Dùng để lấy giá trị của thuộc tính.
    //Setter: Dùng để cập nhật giá trị của thuộc tính.




    //// Lớp LibraryBook với tính đóng gói
    //public class LibraryBook {
    //    // Thuộc tính private (chỉ có thể truy cập trong lớp này)
    //    private String title;
    //    private String author;
    //
    //
    //    // Constructor để khởi tạo sách
    //    public LibraryBook(String title, String author, int availableCopies) {
    //        this.title = title;
    //        this.author = author;
    //
    //    }
    //
    //    // Getter cho title
    //    public String getTitle() {
    //        return title;
    //    }
    //
    //    // Setter cho title
    //    public void setTitle(String title) {
    //        this.title = title;
    //    }
    //
    //    // Getter cho author
    //    public String getAuthor() {
    //        return author;
    //    }
    //
    //    // Setter cho author
    //    public void setAuthor(String author) {
    //        this.author = author;
    //    }
    //
    //    // Getter cho availableCopies
    //    public int getAvailableCopies() {
    //        return availableCopies;
    //    }
    //
    //    // Setter cho availableCopies (Chỉ cho phép giá trị >= 0)
    //    public void setAvailableCopies(int availableCopies) {
    //        if (availableCopies >= 0) {
    //            this.availableCopies = availableCopies;
    //        } else {
    //            System.out.println(".");
    //        }
    //    }
    //

    //
    //    // Phương thức hiển thị thông tin sách
    //    public void displayInfo() {
    //        System.out.println("tiêu đề: " + title + ", tác giả: " + author);
    //    }
    //
    //    // Phương thức chính để kiểm tra
    //    public static void main(String[] args) {
    //        // Tạo một đối tượng LibraryBook
    //        LibraryBook book = new LibraryBook("Harry Potter", "J.K. Rowling", 3);
    //
    //        // Hiển thị thông tin sách
    //        book.displayInfo();
    //
    //        // Mượn một quyển sách
    //        book.borrowBook();
    //        book.displayInfo();
    //
    //        // Trả lại một quyển sách
    //        book.returnBook();
    //        book.displayInfo();
    //
    //        // Thử đặt giá trị không hợp lệ
    //        book.setAvailableCopies(-2);
    //    }
    //}


    //4. Lợi ích của việc sử dụng tính đóng gói
    //Bảo vệ dữ liệu: Hạn chế truy cập trực tiếp, giúp dữ liệu không bị thay đổi ngoài tầm kiểm soát.
    //Kiểm soát quyền truy cập: Chỉ cho phép thay đổi dữ liệu thông qua các phương thức cụ thể.
    //Dễ dàng bảo trì và cập nhật: Nếu cần thay đổi cách lưu trữ dữ liệu, chỉ cần chỉnh sửa trong lớp mà không ảnh hưởng đến phần còn lại của chương trình.
    //Ngăn chặn lỗi: Tránh các thay đổi ngoài ý muốn hoặc dữ liệu không hợp lệ.
}
