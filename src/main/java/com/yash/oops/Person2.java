package com.yash.oops;
public abstract class Person2 {
    protected double salary;
    public Person2(double salary) {
        this.salary = salary;
    }

    private double calculateSalary(double salary){
        return salary;
    };

    public static class Employee extends Person2 {
        private double taxPercentage;

        public Employee(double salary, double taxPercentage) {
            super(salary);
            //this.taxPercentage = taxPercecntage;
        }
        public double calculateSalary() {
            return salary - (salary * taxPercentage / 100);
        }
    }
    public static class UnEmployed extends Person2 {
        public UnEmployed(double allowance) {
            super(allowance);
        }
        public double calculateSalary() {
            return salary;
        }
    }

    public static class SelfEmployed extends Person2 {
        private double businessExpenses;

        public SelfEmployed(double salary, double businessExpenses) {
            super(salary);
            this.businessExpenses = businessExpenses;
        }

        public double calculateSalary() {
            return salary - businessExpenses;
        }
    }
    public static class CalculateSalary {
        public CalculateSalary(Employee emp) {
            System.out.println("Employee Salary: " + emp.calculateSalary());
        }

        public CalculateSalary(UnEmployed unEmp) {
            System.out.println("UnEmployed Allowance: " + unEmp.calculateSalary());
        }

        public CalculateSalary(SelfEmployed selfEmp) {
            System.out.println("SelfEmployed Salary: " + selfEmp.calculateSalary());
        }
    }

    public static void main(String[] args) {
        // Create objects of each type
        Employee employee = new Employee(50000, 20);
        UnEmployed unEmployed = new UnEmployed(10000);
        SelfEmployed selfEmployed = new SelfEmployed(75000, 15000);

        // Create CalculateSalary objects with each type
        CalculateSalary calculateEmployeeSalary = new CalculateSalary(employee);
        CalculateSalary calculateUnEmployedAllowance = new CalculateSalary(unEmployed);
        CalculateSalary calculateSelfEmployedSalary = new CalculateSalary(selfEmployed);
    }
}