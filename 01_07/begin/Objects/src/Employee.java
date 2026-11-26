public class Employee {
    private String name;
    private int age;
    private double salary;
    private String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void detLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
}