package pl.sda.zadanie1;

import java.math.BigDecimal;

public class Manager extends Person {
    private String section;
    private BigDecimal salary;

    public Manager() {
        this.section = section;
        this.salary = salary;
    }

    public String getSection() {
        return section;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "section='" + section + '\'' +
                ", salary=" + salary +
                '}';
    }
}
