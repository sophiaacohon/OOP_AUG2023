/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 1 - Hourly Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 9, 2023
 * Finished on: September 15, 2023
 * Program Description: Computes the salary of Hourly Employee and display their information
*/

package employee.version1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private myDate empDateHired;
    private myDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee(){
        
    }

    public HourlyEmployee(int empID, String empName, myDate empBirthDate,  myDate empDateHired, float totalHoursWorked,
            float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empDateHired = empDateHired;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
        double totalHSalary = 0;
        if(this.totalHoursWorked <= 40){
            totalHSalary = this.totalHoursWorked * this.ratePerHour; 
        }
        else if(this.totalHoursWorked > 40){
            totalHSalary = (((this.totalHoursWorked - 40)*this.ratePerHour) * 1.5) + (this.ratePerHour* 40);
        }
        return totalHSalary;
    }
    
    public void displayInfo(){
        System.out.println("\nHourly Employee Information: ");
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Name: " + this.empName);
        System.out.println("Birthdate: " + this.empBirthDate);
        System.out.println("Date Hired: " + this.empDateHired);
        System.out.println("Total Hours Worked: " + this.totalHoursWorked);
        System.out.println("Rate Per Hour: " + this.ratePerHour);
        System.out.println("Total Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + '}';
    }
    
    
}
