package bai8;

public class Test {
    public static void main(String[] args) {
        Animals [] dogCat = new Animals[2];

        dogCat[0] = new Dog("pp", 1, "blue");
        dogCat[1] = new Cat("ccc", 2, "red");

        for (Animals a : dogCat) {
            a.displayInfo();
            System.out.println("tiếng kêu: "+a.makeSound());
        }

    }
}
