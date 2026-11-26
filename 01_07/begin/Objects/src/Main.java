public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ben Zaion", 25, 20000, "Nowhere");

        employee.raiseSalary();

        System.out.println(employee.getSalary());
    }
}