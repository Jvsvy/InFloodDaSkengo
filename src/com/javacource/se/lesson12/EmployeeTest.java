package com.javacource.se.lesson12;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Ivan", 100.56);
        System.out.println(emp.uvelichitel(emp.salary));
    }
}
