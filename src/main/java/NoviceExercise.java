public class NoviceExercise {

    public static void main(String[] args) {
        printName();

    }

    public static String getName(){
        return "Max Power";
    }

    public static void printName(){
        System.out.println(getName());
    }

    public static void printNameLoop(){
        for (int i = 0; i < 5; i++) {
            printName();
        }

    }

}
