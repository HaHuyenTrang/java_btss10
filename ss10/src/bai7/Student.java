package bai7;

// Lớp Student (Sinh viên thông thường)
public class Student {
    private String name;
    private String id;
    private double gpa;

    // Constructor đầy đủ tham số
    public Student(String name, String id, double gpa) {
        if (name == null || name.trim().isEmpty() || id == null || id.trim().isEmpty() || gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống!");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID không được để trống!");
        }
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA phải nằm trong khoảng 0.0 - 4.0!");
        }
        this.gpa = gpa;
    }

    // Phương thức hiển thị thông tin sinh viên
    public String getDetails() {
        return "Student: " + name + " | ID: " + id + " | GPA: " + gpa;
    }
}

