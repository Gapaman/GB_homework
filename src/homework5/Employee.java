package homework5;

public class Employee {
    protected String name;
    protected String position;
    protected String email;
    protected String phone_number;
    protected int salary;
    protected int age;


    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }
    public void printEmployee(){
        System.out.println(this);
    };

    @Override
    public String toString() {
        return "Работник: " +
                  name  +
                ", Должность: " + position  +
                ", email: " + email +
                ", Телефон: " + phone_number +
                ", Зарплата: " + salary +
                ", Возраст: " + age;
    }
}
