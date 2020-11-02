package sourcedemo._12_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Nam_1"));
        studentList.add(new Student(2,"Nam_2"));
        studentList.add(new Student(2,"Nam_3"));
        studentList.add(new Student(1,"Nam_4"));

//        for(int index = 0; index <studentList.size();index++){
//            System.out.println(studentList.get(index));
//        }
        for(Student student: studentList){
            System.out.println(student);
        }
        System.out.println("--------------------");

//        Collections.sort(studentList);
        SortStudentById sortStudentById = new SortStudentById();
        Collections.sort(studentList, sortStudentById);

        for(Student student: studentList){
            System.out.println(student);
        }
    }
}
