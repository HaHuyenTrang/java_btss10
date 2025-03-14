public class bai2 {
    //Kế thừa (Inheritance) là một cơ chế trong lập trình hướng đối tượng cho phép một lớp (class) có thể kế thừa các thuộc tính và phương thức từ một lớp khác.
    //
    //Cách hoạt động:
    //
    //Lớp cha (superclass) chứa các thuộc tính và phương thức chung.
    //Lớp con (subclass) kế thừa những gì có trong lớp cha và có thể mở rộng bằng cách thêm hoặc ghi đè phương thức.
    //Lợi ích của kế thừa:
    //Tái sử dụng mã: Giúp tránh việc viết lại mã giống nhau.
    //Dễ bảo trì: Thay đổi ở lớp cha sẽ tự động ảnh hưởng đến lớp con.
    //Mở rộng chức năng: Lớp con có thể thêm hoặc ghi đè phương thức của lớp cha.

    //2 so sánh
    //Kế thừa (Inheritance)
    //Cho phép lớp con kế thừa thuộc tính và phương thức từ lớp cha.
    //	Giúp tái sử dụng mã và mở rộng chức năng
    // Dùng từ khóa extends để tạo lớp con.
    //vd: Lớp Dog kế thừa từ lớp Animal.

    //Đóng gói (Encapsulation)
    //Giấu dữ liệu bằng cách sử dụng từ khóa private và cung cấp phương thức getter/setter.
    //Bảo vệ dữ liệu khỏi truy cập trực tiếp.
    //	Dùng từ khóa private, protected, public để kiểm soát truy cập.
    //Lớp Person có private age và sử dụng getAge() để truy cập.



    // Lợi ích của kế thừa
    // Tái sử dụng mã: Không cần viết lại code, tiết kiệm thời gian.
    // Tăng tính mở rộng: Dễ dàng mở rộng lớp con bằng cách thêm phương thức mới.
    // Dễ bảo trì: Nếu thay đổi ở lớp cha, lớp con sẽ tự động cập nhật.
    //
    // Hạn chế của kế thừa
    // Mối quan hệ chặt chẽ: Lớp con phụ thuộc vào lớp cha, làm giảm tính linh hoạt.
    // Dễ xảy ra lỗi khi thay đổi lớp cha: Nếu lớp cha thay đổi, tất cả lớp con bị ảnh hưởng.
    // Không thể kế thừa từ nhiều lớp: Java không hỗ trợ kế thừa đa cấp (multiple inheritance).

}
