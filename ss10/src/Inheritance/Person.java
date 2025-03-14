package Inheritance;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    private boolean gender;

    public Person() {
    }

    public Person(String name, int age, String address, boolean gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhập vào tên:");
        this.name = sc.nextLine();

        System.out.println("Nhập vào tuổi:");
        this.age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào địa chỉ:");
        this.address = sc.nextLine();

        System.out.println("Nhập vào giới tính:");
        this.gender = Boolean.parseBoolean(sc.nextLine());
    }

    public void display() {
        System.out.printf("Họ tên: %s - Tuoi: %d - Địa chỉ: %s - Giới tính: %b", this.name, this.age, this.address, this.gender);
    }
}
