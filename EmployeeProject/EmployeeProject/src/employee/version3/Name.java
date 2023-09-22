/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Employee Project Version 3 - Name.java
 * Made by: Sophia Ann Cohon
 * Created on: September 19, 2023
 * Finished on: September 22, 2023
 * Program Description: Name class that holds attributes of a complete name
*/

package employee.version3;

/**
 *
 * @author User
 */
public class Name {
    String title;
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String title, String firstName, String middleName, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String title, String firstName, String middleName, String lastName, String suffix) {
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " " + middleName.charAt(0) + ". " + suffix;
    }

}
