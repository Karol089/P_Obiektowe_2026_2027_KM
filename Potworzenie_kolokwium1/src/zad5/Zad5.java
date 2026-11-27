package zad5;

public class Zad5 {
    public static void main(String[] args){
        Employee[] employees = {
                new Developer(),
                new Manager()
        };

        for(Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }

        System.out.println(Employee.calculate(new Developer()));
        System.out.println(Employee.calculate(new Manager()));

        // Employee powinno być klasą abstrakcyjną, ponieważ
        // nie ma potrzebny tworzenia pracownika bez pełnionej funkcji
    }
}
