package bai9;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("B23DTCN228",45, 450000);
        Manager manager = new Manager(90, "Trang", 230000, 450000);
        Developer developer = new Developer(90,"Cheng", 890000);

        System.out.println(employee);
        System.out.println(manager);
        System.out.println(developer);

        employee.increaseSalary(1000);
        System.out.println("After increase salary"+employee);

    }
}
