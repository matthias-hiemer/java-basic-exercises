package exercises;

import model.Student;
import java.util.List;

public class StudentDB {

    private List<Student> students;

    public StudentDB(List<Student> insertedStudents) {
        this.students = insertedStudents;
    }

     public List<Student> getAllStudents() {
        return students;
    }

    public Student getRandomStudent() {

        double randomDouble = Math.random();
        return students.get((int) (randomDouble * students.size()));
    }

    public void add(Student newStudent) {
        students.add(newStudent);
    }

    public void remove(int id) {
        for (Student currentStudent : students) {
            if (currentStudent.getId() == id) {
                students.remove(currentStudent);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
