package pl.sda.zadanie1;

import java.math.BigDecimal;

public class Employee extends Person {
    private String position;
    private BigDecimal salary;


    public Employee() {
        this.position = position;
        this.salary = salary;
    }


    public String getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
