/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 1 - Commission Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 9, 2023
 * Finished on: 
 * Program Description: Computes the salary of Commission Employee and display their information
*/

package employee.version1;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private int empID;
    private String empName;
    private myDate empBirthDate;
    private myDate empDateHired;
    private double totalSales;

    public CommissionEmployee(){

    }

    public CommissionEmployee(int empID, String empName, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, myDate empBirthDate, myDate empDateHired, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empDateHired = empDateHired;
        this.totalSales = totalSales;
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double totalCSalary = 0;
        if(this.totalSales < 50000){
            System.out.println("Commission Rate: 5%");
            totalCSalary = this.totalSales * 0.05;
        }
        else if((this.totalSales >= 50000) && (this.totalSales < 100000)){
            System.out.println("Commission Rate: 20%");
            totalCSalary = this.totalSales * 0.2;
        }
        else if((this.totalSales >= 100000) && (this.totalSales < 500000)){
            System.out.println("Commission Rate: 30%");
            totalCSalary = this.totalSales * 0.3;
        }
        else if(this.totalSales >= 500000){
            System.out.println("Commission Rate: 50%");
            totalCSalary = this.totalSales * 0.5;
        }
        
        return totalCSalary;
    }

    public void displayInfo(){
        System.out.println("\nCommission Employee Information: ");
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Name: " + this.empName);
        System.out.println("Birthdate: " + this.empBirthDate);
        System.out.println("Date Hired: " + this.empDateHired);
        System.out.println("Total Sales: PHP " + this.totalSales);
        System.out.println("Total Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "CommissionEmployee [empID=" + empID + ", empName=" + empName + ", empBirthDate=" + empBirthDate
                + ", empDateHired=" + empDateHired + ", totalSales=" + totalSales + "]";
    }

    
}