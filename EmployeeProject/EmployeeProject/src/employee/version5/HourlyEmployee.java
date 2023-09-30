/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

/**
 *
 * @author Sophia
 */
public class HourlyEmployee extends Employee{
    protected float totalHoursWorked;
    protected float ratePerHour;

    public HourlyEmployee(){

    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, Name empName, myDate empBirthdate, myDate empDateHired, float totalHoursWorked,
            float ratePerHour) {
        super(empID, empName, empBirthdate, empDateHired);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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
        System.out.println("\nHourly Employee information");
        super.displayInfo();
        System.out.println("Total Hours Worked: " + this.totalHoursWorked);
        System.out.println("Rate per Hour: " + this.ratePerHour);
        System.out.println("Total Salary: PHP " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Hourly " + super.toString() + ", totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour;
    }
}
