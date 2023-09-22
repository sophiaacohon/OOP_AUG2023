/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 3 - Employee.java
 * Made by: Sophia Ann Cohon
 * Created on: September 15, 2023
 * Finished on: September 22, 2023
 * Program Description: Employee Class that has employee attributes
*/
 
package employee.version3;

/**
 *
 * @author User
 */
public class Employee {
    protected int empID;
    protected Name empName;
    protected myDate empBirthdate;
    protected myDate empDateHired;

    public Employee(){

    }

    public Employee(int empID, Name empName, myDate empDateHired) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
    }

    public Employee(int empID, Name empName, myDate empBirthdate, myDate empDateHired) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthdate = empBirthdate;
        this.empDateHired = empDateHired;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public myDate getEmpBirthdate() {
        return empBirthdate;
    }

    public void setEmpBirthdate(myDate empBirthdate) {
        this.empBirthdate = empBirthdate;
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
        System.out.println("Birthdate: " + this.empBirthdate);
        System.out.println("Date Hired: " + this.empDateHired);
    }

    @Override
    public String toString() {
        return "Employee: empID= " + empID + ", empName= " + empName + ", empBirthdate= " + empBirthdate
                + ", empDateHired= " + empDateHired;
    }
}
