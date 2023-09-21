/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 2 - Base Plus Commission Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 15, 2023
 * Finished on: September 21, 2023
 * Program Description: Computes the salary of Base Plus Commission Employee and displays their information
*/

package employee.version2;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    protected double baseSalary;

    public BasePlusCommissionEmployee(){

    }

    public BasePlusCommissionEmployee(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, myDate empBirthDate, myDate empDateHired,
            double totalSales, double baseSalary) {
        super(empID, empName, empBirthDate, empDateHired, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeBSalary(){
        double bpceSalary;
        bpceSalary = super.computeCSalary() + this.baseSalary;
        return bpceSalary;
    }

    public void displayInfo(){
        System.out.print("\nBase Plus ");
        super.displayInfo();
        System.out.println("Base Salary: PHP " + this.baseSalary);
        System.out.println("Total Salary from Commission Plus Base Salary: PHP " + this.computeBSalary());
    }

    @Override
    public String toString() {
        return "Base Plus " + super.toString() + " baseSalary=" + baseSalary;
    }

    
}
