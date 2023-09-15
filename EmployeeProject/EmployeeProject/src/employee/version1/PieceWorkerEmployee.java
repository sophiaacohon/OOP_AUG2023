/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 1 - Piece Worker Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 9, 2023
 * Finished on: September 15, 2023
 * Program Description: Computes the salary of Piece Worker Employee and display their information
*/

package employee.version1;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private myDate empBirthDate;
    private myDate empDateHired;
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(){

    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, myDate empBirthDate, myDate empDateHired, 
            int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empDateHired = empDateHired;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    
    public double computeSalary(){
        double totalPWSalary = 0;
        int mods;
        if(this.totalPiecesFinished < 100){
            totalPWSalary = (this.totalPiecesFinished * this.ratePerPiece);
        }

        else if(this.totalPiecesFinished>=100){
            mods = this.totalPiecesFinished / 100;
            totalPWSalary = (this.totalPiecesFinished * this.ratePerPiece) + (mods * (this.ratePerPiece*10));
        }
        
        return totalPWSalary;
    }

    public void displayInfo(){
        System.out.println("\nPiece Worker Employee Information: ");
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Name: " + this.empName);
        System.out.println("Birthdate: " + this.empBirthDate);
        System.out.println("Date Hired: " + this.empDateHired);
        System.out.println("Total Pieces Finished: " + this.totalPiecesFinished);
        System.out.println("Rate per Pece: " + this.ratePerPiece);
        System.out.println("Total Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee [empID=" + empID + ", empName=" + empName + ", empBirthDate=" + empBirthDate
                + ", empDateHired=" + empDateHired + ", totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece="
                + ratePerPiece + "]";
    }

    
    
    
}
