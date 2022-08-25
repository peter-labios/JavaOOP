import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student steve = new Student("Steve Fox", 21, "Male", 2014280006);
        Student armorKing = new Student("Armor King", 40, "Male", 2013103221);
        Student bryan = new Student("Bryan Fury", 37, "Male", 2019348251);
        List<Student> students = new ArrayList<>();
        students.add(steve);
        students.add(armorKing);
        students.add(bryan);
        for(Student person : students){
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Gender: " + person.getGender());
            System.out.println("ID: " + person.getId() + "\n");
        }
    }
}