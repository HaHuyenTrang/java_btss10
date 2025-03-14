package bai9;

public class Manager extends Employee{
    private int bonus;


    public Manager(int id, String name, int salary, int bonus) {
        super(name,id,salary);
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        super.toString();
        return("bonus: " + bonus);
    }
}
