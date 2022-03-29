package exercises;

import model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] insertedStudents) {
        this.students = insertedStudents;
    }

     public Student[] getAllStudents() {
        return students;
    }

    @Override
    public String toString() {

        return "exercises.StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }


















    public Student getRandomStudent() {

        double randomDouble = Math.random();
        return students[(int) (randomDouble * students.length)];
    }

    public void add(Student newStudent) {
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = newStudent;
        this.students = newStudents;
    }

    public void remove(int id) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                // Remove and create new array
                Student[] newStudents = Arrays.copyOf(students, students.length - 1);
                System.arraycopy(students, 0, newStudents, 0, i);
                System.arraycopy(students, i + 1, newStudents, i, students.length - (i + 1));
                this.students = newStudents;
            }
        }
    }

}