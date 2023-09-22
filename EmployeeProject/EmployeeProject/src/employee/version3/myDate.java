/* Employee Project Version 3 - myDate
 * Made by: Sophia Ann Cohon
 * Created on: September 15, 2023
 * Finished on: September 22, 2023
 * Program Description: made my own data type "myDate" for birthdate and dateHired for all classes
*/

package employee.version3;

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
