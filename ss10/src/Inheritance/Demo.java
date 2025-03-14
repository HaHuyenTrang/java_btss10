//package Inheritance;
//
//public class Demo {
//    public static void main(String[] args) {
//        // Khởi tạo đối tượng Dog
//        // Declared type: Animal dog - Kiểu dữ liệu khai báo là Animal
//        // new Dog() -> Actual type - Kiểu dữ liệu thưc tế tham chiếu tới Dog
//
//        Animal dog = new Dog(); // Upcasting - Implicit
//        dog.eat();
//
//        // Khởi tạo đối tượng Mèo
//        Cat cat = new Cat();
//        if(cat instanceof Animal){
//            Animal animal = (Animal) cat; // Downcasting - Explicit
//        }
//        cat.eat();
//        cat.bark();
//
//        System.out.println(dog instanceof Cat);
//    }
//}
