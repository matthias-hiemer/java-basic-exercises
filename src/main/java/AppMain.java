import model.Student;

public class AppMain {

    public static void main(String[] args) {

        StudentDB studentDB = new StudentDB(new Student[]{
                new Student(1, "Anton"),
                new Student(2, "Berta"),
                new Student(2, "Caesar"),
        });

        System.out.println(studentDB.toString());

        System.out.println("First Student: " + studentDB.getAllStudents()[0]);

        System.out.println("Random Student: " +studentDB.getRandomStudent());

        Student student1 = new Student(1, "Anton");
        System.out.println(student1);

    }
}
