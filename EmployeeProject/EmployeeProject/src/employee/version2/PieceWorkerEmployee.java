/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 2 - Piece Worker Employee
 * Made by: Sophia Ann Cohon
 * Created on: September 15, 2023
 * Finished on: September 21, 2023
 * Program Description: Computes the salary of Piece Worker Employee and displays their information
*/

package employee.version2;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee{
    protected int totalPiecesFinished;
    protected float ratePerPiece;

    public PieceWorkerEmployee(){

    }

    public PieceWorkerEmployee(int totalPiecesFinished, float ratePerPiece){
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, myDate empBirthDate, myDate empDateHired,
            int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
        super.displayInfo();
        System.out.println("Total Pieces Finished: " + this.totalPiecesFinished);
        System.out.println("Rate per Piece: " + this.ratePerPiece);
        System.out.println("Total Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Piece Worker " + super.toString() + ", totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece=" + ratePerPiece;
    }
}
