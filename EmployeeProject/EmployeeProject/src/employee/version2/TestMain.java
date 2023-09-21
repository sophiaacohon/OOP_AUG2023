/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 2 - Main
 * Made by: Sophia Ann Cohon
 * Created on: September 16, 2023
 * Finished on: September 21, 2023
 * Program Description: Main Program that runs the employee methods in other classes
*/

package employee.version2;

/**
 *
 * @author User
 */
public class TestMain {
    public static void main(String[] args) {
        //Hourly Employee
        myDate he1BDate = new myDate(14, "Jul", 1985);
        myDate he1HDate = new myDate(1, "May", 2007);
        HourlyEmployee he1 = new HourlyEmployee(45, 450, 1, "Andre O.", he1BDate, he1HDate);
        myDate he2BDate = new myDate(27, "Aug", 1973);
        myDate he2HDate = new myDate(1, "Jun", 2023);
        HourlyEmployee he2 = new HourlyEmployee(40,450, 2, "Romer F.", he2BDate, he2HDate);
        he1.displayInfo();
        System.out.println(he1);
        he2.displayInfo();
        System.out.println(he2);

        //Piece Worker Employee
        myDate pwe1BDate = new myDate(13, "Oct", 1999);
        myDate pwe1HDate = new myDate(1, "Jul", 2023);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(3, "Mark G.", pwe1BDate, pwe1HDate, 65, 10);
        myDate pwe2BDate = new myDate(21, "Dec", 1966);
        myDate pwe2HDate = new myDate(1, "Jul", 2023);
        PieceWorkerEmployee pwe2 = new PieceWorkerEmployee(4, "Sally C.", pwe2BDate, pwe2HDate, 350, 10);
        pwe1.displayInfo();
        System.out.println(pwe1);
        pwe2.displayInfo();
        System.out.println(pwe2);

        //Commission Employee
        myDate ce1BDate = new myDate(1, "May", 1997);
        myDate ce1HDate = new myDate(1, "Jun", 2022);
        CommissionEmployee ce1 = new CommissionEmployee(5, "Margaret H.", ce1BDate, ce1HDate, 25000);
        myDate ce2BDate = new myDate(22, "Sep", 1994);
        myDate ce2HDate = new myDate(15, "Nov", 2012);
        CommissionEmployee ce2 = new CommissionEmployee(6, "Anthony Q.", ce2BDate, ce2HDate, 60000);
        myDate ce3BDate = new myDate(29, "May", 1998);
        myDate ce3HDate = new myDate(16, "Mar", 2018);
        CommissionEmployee ce3 = new CommissionEmployee(7, "Esmeralda S.", ce3BDate, ce3HDate, 300000);
        myDate ce4BDate = new myDate(16, "Jan",1957);
        myDate ce4HDate = new myDate(1, "Feb", 1990);
        CommissionEmployee ce4 = new CommissionEmployee(8, "Alexander C.", ce4BDate, ce4HDate, 700000);
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
        myDate bpce1BDate = new myDate(17, "May", 1996);
        myDate bpce1HDate = new myDate(16, "Mar", 2018);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(9, "Nina B.", bpce1BDate, bpce1HDate, 45000, 30000);
        myDate bpce2BDate = new myDate(14, "Aug", 1995);
        myDate bpce2HDate = new myDate(30, "Oct", 2016);
        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee(10, "Julie G.", bpce2BDate, bpce2HDate, 75000, 30000);
        myDate bpce3BDate = new myDate(24, "Jun", 1981);
        myDate bpce3HDate = new myDate(27, "Sep", 2013);
        BasePlusCommissionEmployee bpce3 = new BasePlusCommissionEmployee(11, "Edit J.", bpce3BDate, bpce3HDate, 350000, 30000);
        myDate bpce4BDate = new myDate(15, "Dec", 1985);
        myDate bpce4HDate = new myDate(26, "Nov", 2021);
        BasePlusCommissionEmployee bpce4 = new BasePlusCommissionEmployee(12, "Ava R.", bpce4BDate, bpce4HDate, 600000, 30000);
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
