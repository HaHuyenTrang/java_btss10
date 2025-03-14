package bai8;

public class Cat extends Animals{
    private String furColor ;

    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public String makeSound() {
        return "meo meo";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("furColor: "+furColor);
    }
}
