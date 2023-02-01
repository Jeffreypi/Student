/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author jeffreypincombe
 */
public class partTimeStudent extends Student{
    
    private int noOfCourses;

    public partTimeStudent(int noOfCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.noOfCourses = noOfCourses;
    }

    public int getNoOfCourses() {
        return noOfCourses;
    }

    public void setNoOfCourses(int noOfCourses) {
        this.noOfCourses = noOfCourses;
    }
    
}
