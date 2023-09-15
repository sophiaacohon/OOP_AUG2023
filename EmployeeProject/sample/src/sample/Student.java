/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Student {
    private int studId;
    private String studName;
    private String department;
    private ArrayList<String> courseList = new ArrayList<>();
    
    public void setStudId(int studId){
        this.studId = studId < 10000? studId : 9999;
    }
    
    public int getStudId(){
        return studId;
    }
    /*
    public void addCourse(String course){
        courseList.add(course);
    }
    */
    
}
