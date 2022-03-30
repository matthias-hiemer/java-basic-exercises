package exercises;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        Map<Integer, Student> actual = studentDB.getAllStudents();

        // then
        Assertions.assertEquals(students, actual);

        Assertions.assertEquals(1, actual.get(1).getId());
        Assertions.assertEquals("André Schreck", actual.get(1).getName());
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.getRandomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Thomas Kittlaus") ));
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals("StudentDB{students={1=Student{id=1, name='André Schreck', birthday=null}, 2=Student{id=2, name='Thomas Kittlaus', birthday=null}}}", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.add(new Student(2, "Thomas Kittlaus"));
        Map<Integer, Student> actual = studentDB.getAllStudents();

        // then
        Map<Integer, Student> expected = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Thomas Kittlaus")));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        Map<Integer, Student> actual = studentDB.getAllStudents();

        // then
        Map<Integer, Student> expected = new HashMap<>(Map.of(2, new Student(2, "Thomas Kittlaus")));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(2);
        Map<Integer, Student> actual = studentDB.getAllStudents();

        // then
        Map<Integer, Student> expected = new HashMap<>(Map.of(1, new Student(1, "André Schreck")));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Map<Integer, Student> students = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 2, new Student(2, "Max Mustermann"), 3, new Student(3, "Thomas Kittlaus")));
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(2);
        Map<Integer, Student> actual = studentDB.getAllStudents();

        // then
        Map<Integer, Student> expected = new HashMap<>(Map.of(1, new Student(1, "André Schreck"), 3, new Student(3, "Thomas Kittlaus")));
        Assertions.assertEquals(expected, actual);
    }
}
