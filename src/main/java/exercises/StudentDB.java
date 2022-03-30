package exercises;

import model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StudentDB {

    private Map<Integer, Student> students;

    public StudentDB(Map<Integer, Student> insertedStudents) {
        this.students = insertedStudents;
    }

     public Map<Integer, Student> getAllStudents() {
        return students;
    }

    public Student getRandomStudent() {

        double randomDouble = Math.random();
        return new ArrayList<>(students.values()).get((int) (randomDouble * students.size()));
    }

    public void add(Student newStudent) {
        students.put(newStudent.getId(), newStudent);
    }

    public void remove(int id) {
        students.remove(id);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
