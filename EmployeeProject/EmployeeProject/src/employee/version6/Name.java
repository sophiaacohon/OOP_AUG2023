/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

/**
 *
 * @author Sophia
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
