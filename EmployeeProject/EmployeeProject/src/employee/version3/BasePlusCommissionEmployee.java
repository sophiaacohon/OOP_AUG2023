/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 3 - Base Plus Commission Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 15, 2023
 * Finished on: September 22, 2023
 * Program Description: Computes the salary of Base Plus Commission Employee and display their information
*/

package employee.version3;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    protected double baseSalary;

    public BasePlusCommissionEmployee(){

    }

    public BasePlusCommissionEmployee(int empID, Name empName, myDate empDateHired, double totalSales,
            double baseSalary) {
        super(empID, empName, empDateHired, totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, myDate empBirthdate, myDate empDateHired,
            double totalSales, double baseSalary) {
        super(empID, empName, empBirthdate, empDateHired, totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(double baseSalary){
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary(){
        double bpceSalary;
        bpceSalary = super.computeSalary() + this.baseSalary;
        return bpceSalary;
    }

    public void displayInfo(){
        System.out.println("\nBase Plus Commission Employee Information: ");
        super.displayInfo();
        System.out.println("Base Salary: PHP " + this.baseSalary);
        System.out.println("Total Salary from Commission Plus Base Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Base Plus " + super.toString() + ", baseSalary=" + baseSalary;
    }
}
