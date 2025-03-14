package bai9;

public class Developer extends Employee{
    public String programmingLanguage;

//    public Developer() {};
    public Developer(int id, String name, int salary) {
        super(name, id, salary);
        this.programmingLanguage = "java";
    }



    @Override
    public  int getSalary(){
        return super.getSalary();
    }

    @Override
    public String toString() {
        super.toString();
        return "programming language: " + programmingLanguage;
    }



}
