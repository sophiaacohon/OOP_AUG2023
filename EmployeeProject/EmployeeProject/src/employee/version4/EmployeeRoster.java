/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;
import java.util.Arrays;
/**
 *
 * @author Sophia
 */
public class EmployeeRoster {
    int count = 0;
    int max =25;
    Employee empList[] = new Employee[max];

    public EmployeeRoster(int count, int max, Employee[] empList) {
        this.count = count;
        this.max = max;
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public void displayAllEmployee(){
        
    }

    public int countHE(){
        int countHE = 0;
        return countHE;
    }

    public int countPWE(){

    }
    
    public int countBPCE(){

    }

    public int countCE(){

    }

    public void displayHE(){

    }

    public void displayPWE(){

    }

    public void displayBPCE(){

    }

    public void displayCE(){

    }

    public boolean addEmployee(/* adds an employee obj */){

    }

    public boolean removeEmployee(int id){
        //removes employee by id number
    }

    public EmployeeRoster getEmployee(String somethString){
        return EmployeeRoster;
    }

    public EmployeeRoster updateEmployee(int id){

    }
}
