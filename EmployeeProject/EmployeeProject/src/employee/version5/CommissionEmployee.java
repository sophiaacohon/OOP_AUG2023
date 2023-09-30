/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

/**
 *
 * @author Sophia
 */
public class CommissionEmployee extends Employee{
    protected double totalSales;

    public CommissionEmployee(){

    }

    public CommissionEmployee(int empID, Name empName, myDate empDateHired, double totalSales) {
        super(empID, empName, empDateHired);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, Name empName, myDate empBirthdate, myDate empDateHired, double totalSales) {
        super(empID, empName, empBirthdate, empDateHired);
        this.totalSales = totalSales;
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
        System.out.println("Commission Employee Information: ");
        super.displayInfo();
        System.out.println("Total Sales: PHP " + this.totalSales);
        System.out.println("Total Salary from Commission: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Commission " + super.toString() + ", totalSales=" + totalSales;
    }
}
