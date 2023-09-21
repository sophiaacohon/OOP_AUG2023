/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 2 - Employee.java
 * Made by: Sophia Ann Cohon
 * Created on: September 15, 2023
 * Finished on: September 21, 2023
 * Program Description: Employee Class that has employee attributes that will be used in the other Employee classess
*/

package employee.version2;

/**
 *
 * @author User
 */
public class Employee {
    protected int empID;
    protected String empName;
    protected myDate empBirthDate;
    protected myDate empDateHired;
    
    public Employee(){
        
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public Employee(int empID, String empName, myDate empBirthDate, myDate empDateHired) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empDateHired = empDateHired;
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

    public myDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(myDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public myDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(myDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void displayInfo(){
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Birthdate: " + this.empBirthDate);
        System.out.println("Date Hired: " +  this.empDateHired);
    }

    @Override
    public String toString() {
        return "Employee " + "empID=" + empID + ", empName=" + empName + ", empBirthDate=" + empBirthDate + ", empDateHired=" + empDateHired;
    }
}
