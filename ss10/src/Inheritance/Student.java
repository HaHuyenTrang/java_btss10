package Inheritance;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private float average;

    public Student() {
    }

    public Student(String name, int age, String address, boolean gender, String studentId, float average) {
        super(name, age, address, gender);
        this.studentId = studentId;
        this.average = average;
    }

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    // Cho phép nhập thong tin của student
    public void inputStudentInfo(Scanner sc){
        super.inputData(sc);
        System.out.println("Nhập mã sinh viên:");
        this.studentId = sc.nextLine();

        System.out.println("Nhập vào điểm trung bình");
        this.average = Float.parseFloat(sc.nextLine());
    }

    public void displayStudentInfo(){
        super.display();
        System.out.printf("Mã sinh viên: %s\n", this.studentId);
        System.out.printf("Điểm trung bình: %f\n", this.average);
    }

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }
}
