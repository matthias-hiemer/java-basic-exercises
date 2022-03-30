package exercises;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "André Schreck"));
        students.add(new Student(2, "Thomas Kittlaus"));
        StudentDB studentDB = new StudentDB(students);

        // when
        List<Student> actual = studentDB.getAllStudents();

        // then
        Assertions.assertEquals(students, actual);

        Assertions.assertEquals(1, actual.get(0).getId());
        Assertions.assertEquals("André Schreck", actual.get(0).getName());
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        List<Student> students = new ArrayList<>(List.of(new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.getRandomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        List<Student> students = new ArrayList<>(List.of(new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals("StudentDB{students=[Student{id=1, name='André Schreck', birthday=null}, Student{id=2, name='Thomas Kittlaus', birthday=null}]}", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        List<Student> students = new ArrayList<>(List.of(new Student(1, "André Schreck")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.add(new Student(2, "Thomas Kittlaus"));
        List<Student> actual = studentDB.getAllStudents();

        // then
        List<Student> expected = List.of(new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus"));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        List<Student> students = new ArrayList<>(List.of(new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        List<Student> actual = studentDB.getAllStudents();

        // then
        List<Student> expected = List.of(new Student(2, "Thomas Kittlaus"));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        List<Student> students = new ArrayList<>(List.of(new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(2);
        List<Student> actual = studentDB.getAllStudents();

        // then
        List<Student> expected = List.of(new Student(1, "André Schreck"));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        List<Student> students = new ArrayList<>(List.of(new Student(1, "André Schreck"), new Student(2, "Max Mustermann"), new Student(3, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(2);
        List<Student> actual = studentDB.getAllStudents();

        // then
        List<Student> expected = List.of(new Student(1, "André Schreck"), new Student(3, "Thomas Kittlaus"));
        Assertions.assertEquals(expected, actual);
    }
}
