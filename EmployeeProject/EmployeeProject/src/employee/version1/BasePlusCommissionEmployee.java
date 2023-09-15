/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 1 - Base Plus Commission Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 9, 2023
 * Finished on: 
 * Program Description: Computes the salary of Base Plus Commission Employee and display their information
*/

package employee.version1;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private myDate empBirthDate;
    private myDate empDateHired;
    public double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee(){

    } 

    public BasePlusCommissionEmployee(int empID, String empName, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, myDate empBirthDate, myDate empDateHired,
            double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empDateHired = empDateHired;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public myDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(myDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public myDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(myDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    public void setTotalSales(double totalSales){
        this.totalSales=totalSales;
    }


    public double computeSalary(){
        double totalBPCSalary = 0;
        if(this.totalSales < 50000){
            System.out.println("Commission Rate: 5%");
            totalBPCSalary = (this.totalSales * 0.05) + this.baseSalary;
        }
        else if((this.totalSales >= 50000) && (this.totalSales < 100000)){
            System.out.println("Commission Rate: 20%");
            totalBPCSalary = (this.totalSales * 0.2) + this.baseSalary;
        }
        else if((this.totalSales >= 100000) && (this.totalSales < 500000)){
            System.out.println("Commission Rate: 30%");
            totalBPCSalary = (this.totalSales * 0.3) + this.baseSalary;
        }
        else if(this.totalSales >= 500000){
            System.out.println("Commission Rate: 50%");
            totalBPCSalary = (this.totalSales * 0.5) + this.baseSalary;
        }
        return totalBPCSalary;
    }

    public void displayInfo(){
        System.out.println("\nBase Plus Commission Employee Information: ");
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Birthdate: " + this.empBirthDate);
        System.out.println("Date Hired: " + this.empDateHired);
        System.out.println("Total Sales: " + this.totalSales);
        System.out.println("Base Salary : " + this.baseSalary);
        System.out.println("Total Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee [empID=" + empID + ", empName=" + empName + ", empBirthDate=" + empBirthDate
                + ", empDateHired=" + empDateHired + ", totalSales=" + totalSales + ", baseSalary=" + baseSalary + "]";
    }

    
}
