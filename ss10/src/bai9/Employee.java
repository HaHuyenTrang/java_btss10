package bai9;

public class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //contructor
    public Employee(String id, String name, int salary) {};
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    public String toString() {
        return ("id: "+id+"name: "+name+" salary: "+salary);

    }
}
