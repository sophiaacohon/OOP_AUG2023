/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 3 - Main
 * Made by: Sophia Ann Cohon
 * Created on: September 22, 2023
 * Finished on: September 22, 2023
 * Program Description: Main Program that runs the employee methods in other classes
*/

package employee.version3;

/**
 *
 * @author User
 */
public class TestMain {
    public static void main(String[] args) {
        //Hourly Employee
        Name he1Name = new Name("Mr.", "Andre", "Roberto", "Octavino", null);
        myDate he1BDate = new myDate(14, "Jul", 1985);
        myDate he1HDate = new myDate(1, "May", 2007);
        HourlyEmployee he1 = new HourlyEmployee(1, he1Name, he1BDate, he1HDate, 45, 450);
        Name he2Name = new Name("Mr.", "Romer", "Geronimo", "Fuente", "Jr.");
        myDate he2BDate = new myDate(27, "Aug", 1973);
        myDate he2HDate = new myDate(1, "Jun", 2023);
        HourlyEmployee he2 = new HourlyEmployee(2, he2Name, he2BDate, he2HDate, 40, 450);
        he1.displayInfo();
        System.out.println(he1);
        he2.displayInfo();
        System.out.println(he2);

        //Piece Worker Employee
        Name pwe1Name = new Name("Mr.", "Mark", "Ferguson", "Grant");
        myDate pwe1BDate = new myDate(13, "Oct", 1999);
        myDate pwe1HDate = new myDate(1, "Jul", 2023);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(3, pwe1Name, pwe1BDate, pwe1HDate, 65, 10);
        Name pwe2Name = new Name("Ms.", "Sally", "Uy", "Cohon", null);
        myDate pwe2BDate = new myDate(21, "Dec", 1966);
        myDate pwe2HDate =  new myDate(1, "Jul", 2023);
        PieceWorkerEmployee pwe2 = new PieceWorkerEmployee(4, pwe2Name, pwe2BDate, pwe2HDate, 350, 10);
        pwe1.displayInfo();
        System.out.println(pwe1);
        pwe2.displayInfo();
        System.out.println(pwe2);

        //Commission Employee
        Name ce1Name = new Name("Ms.", "Margaret", "Smith", "Hamilton", null);
        myDate ce1BDate = new myDate(1, "May", 1997);
        myDate ce1HDate = new myDate(1, "Jun", 2022);
        CommissionEmployee ce1 = new CommissionEmployee(5, ce1Name, ce1BDate, ce1HDate, 25000);
        Name ce2Name = new Name("Mr.", "Anthony", "James", "Quackerson", "III");
        myDate ce2BDate = new myDate(22, "Sep", 1994);
        myDate ce2HDate = new myDate(15, "Nov", 2019);
        CommissionEmployee ce2 = new CommissionEmployee(6, ce2Name, ce2BDate, ce2HDate, 60000);
        Name ce3Name = new Name("Ms.", "Esmeralda", "A", "Zamora", null);
        myDate ce3BDate = new myDate(29, "May", 1998);
        myDate ce3HDate = new myDate(16, "Mar", 2018);
        CommissionEmployee ce3 = new CommissionEmployee(7, ce3Name, ce3BDate, ce3HDate, 300000);
        Name ce4Name = new Name("Mr.", "Alexander", "Tan", "Cohon", null);
        myDate ce4BDate = new myDate(16, "Jan", 1957);
        myDate ce4HDate = new myDate(1, "Feb", 1980);
        CommissionEmployee ce4 = new CommissionEmployee(8, ce4Name, ce4BDate, ce4HDate, 700000);
        System.out.println("\n");
        ce1.displayInfo();
        System.out.println(ce1 + "\n");
        ce2.displayInfo();
        System.out.println(ce2 + "\n");
        ce3.displayInfo();
        System.out.println(ce3 + "\n");
        ce4.displayInfo();
        System.out.println(ce4 + "\n");

        //Base Plus Commission Employee
        Name bpce1Name = new Name("Ms.", "Nina", "Susan", "Benitez", null);
        myDate bpce1BDate = new myDate(17, "May", 1996);
        myDate bpce1HDate = new myDate(16, "Mar", 2018);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(9, bpce1Name, bpce1BDate, bpce1HDate, 45000, 30000);
        Name bpce2Name = new Name("Ms.", "Julie", "Agrea", "Gardner", null);
        myDate bpce2BDate = new myDate(14, "Aug", 1995);
        myDate bpce2HDate = new myDate(30, "Oct", 2016);
        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee(10, bpce2Name, bpce2BDate, bpce2HDate, 75000, 30000);
        Name bpce3Name = new Name(null, "Edit", "Janko", "Reagan", null);
        myDate bpce3BDate = new myDate(24, "Jun", 1981);
        myDate bpce3HDate = new myDate(27, "Sep", 2013);
        BasePlusCommissionEmployee bpce3 = new BasePlusCommissionEmployee(11, bpce3Name, bpce3BDate, bpce3HDate, 350000, 30000);
        Name bpce4Name = new Name("Ms.", "Ava", "Max", "Koci", null);
        myDate bpce4BDate = new myDate(15, "Dec", 1985);
        myDate bpce4HDate = new myDate(26, "Nov", 2021);
        BasePlusCommissionEmployee bpce4 = new BasePlusCommissionEmployee(12, bpce4Name, bpce4BDate, bpce4HDate, 600000, 30000);
        bpce1.displayInfo();
        System.out.println(bpce1);
        bpce2.displayInfo();
        System.out.println(bpce2);
        bpce3.displayInfo();
        System.out.println(bpce3);
        bpce4.displayInfo();
        System.out.println(bpce4);
    } 
}
