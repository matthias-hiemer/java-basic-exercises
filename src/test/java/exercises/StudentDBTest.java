package exercises;

import exercises.StudentDB;
import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student[] actual = studentDB.getAllStudents();

        // then
        Assertions.assertArrayEquals(students, actual);

        Assertions.assertEquals(1, actual[0].getId());
        Assertions.assertEquals("André Schreck", actual[0].getName());
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.getRandomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals("exercises.StudentDB{students=[Student{id=1, name='André Schreck', birthday=null}, Student{id=2, name='Thomas Kittlaus', birthday=null}]}", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.add(new Student(2, "Thomas Kittlaus"));
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = { new Student(2, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(2);
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = { new Student(1, "André Schreck") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Max Mustermann"), new Student(3, "Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(2);
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = { new Student(1, "André Schreck"), new Student(3, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }
}
