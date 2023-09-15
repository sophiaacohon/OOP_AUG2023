/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 1 - myDate
 * Made by: Sophia Ann Cohon
 * Created on: September 9, 2023
 * Finished on: September 15, 2023
 * Program Description: made my own data type "myDate" for birthdate and dateHired for all classes
*/

package employee.version1;

/**
 *
 * @author User
 */
public class myDate {
    int date;
    String month;
    int year;

    public myDate(int date, String month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" + date + " " + month + " " + year + "]";
    }   
    
}
