package bai7;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        // Danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();

        // Thêm sinh viên thông thường
        students.add(new Student("HAAAAAA", "SV001", 3.5));
        students.add(new Student("HUyen", "SV002", 2.8));

        // Thêm sinh viên tốt nghiệp
        students.add(new GraduateStudent("TRangggggggg", "SV003", 3.9, "mèn mén", "HAAAAAAa"));

        // Hiển thị thông tin sinh viên
        for (Student student : students) {
            System.out.println(student.getDetails());
        }

        // Kiểm tra thay đổi dữ liệu hợp lệ
        System.out.println("\nCập nhật dữ liệu sinh viên..");
        students.get(0).setGpa(3.8);
        ((GraduateStudent) students.get(2)).setResearchTopic("học");

        // Hiển thị lại danh sách
        System.out.println("\nDanh sách sau khi cập nhật:");
        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}

