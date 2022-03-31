package exercises.pizza;

public class Florian {

    public static void main(String[] args) {
        LieferService lieferService = new LieferService();
        System.out.println("Florian: Ich will eine Pizza!");
        String pizza = lieferService.lieferPizza();
        System.out.println("Florian: Ich esse " + pizza);
    }
}
