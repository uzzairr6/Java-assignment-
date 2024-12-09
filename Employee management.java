package Salary;

class Employee{
 private String name;
 private int id;
 private double basicSalary;
 private double hra; // house rent allowance
 private double allowances;
 private double grossSalary;

 public Employee(String name, int id, double basicSalary, double hra, double allowances) {
     this.name = name;
     this.id = id;
     this.basicSalary = basicSalary;
     this.hra = hra;
     this.allowances = allowances;
 }

 public void calculateGrossSalary() {
     this.grossSalary = basicSalary + hra + allowances;
 }

 public void applyBonus(double bonus) {
     this.grossSalary += bonus;
 }

 public void printSalaryDetails() {
     System.out.println("Employee ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Basic Salary: " + basicSalary);
     System.out.println("HRA: " + hra);
     System.out.println("Allowances: " + allowances);
     System.out.println("Gross Salary (after bonus, if any): " + grossSalary);
     System.out.println("---------------------------------");
 }
}
public class Salary {
 public static void main(String[] args) {
     
     Employee emp1 = new Employee("Anaan", 101, 30000, 5000, 2000);
     Employee emp2 = new Employee("Burhaan", 102, 40000, 6000, 3000);

     
     emp1.calculateGrossSalary();
     emp1.printSalaryDetails();
     
     emp2.calculateGrossSalary();
     emp2.applyBonus(5000);
     emp2.printSalaryDetails();
 }
}
