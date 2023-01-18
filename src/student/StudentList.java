 
package student;


public class StudentList {
    public static void main(String[] args){
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1","Jeffrey");
        studentList[1] = new Student("s2","Bill");
        studentList[2] = new Student("s3","Alex");
        
        for (int i =0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
    }//end of main
    
}//end of class
