package exercises.pizza;

public class LieferService {

    public String lieferPizza() {
        PizzeriaBella pizzeriaBella = new PizzeriaBella();
        System.out.println("LS: Ich fahre jetzt zu Pizzeria.");
        String pizza = "";
        try {
            pizza = pizzeriaBella.machePizza();
        }
        catch (OfenKaputtException ex) {
            System.out.println("LS: Fahre zur anderen Pizzeria.");
            pizza = "Mageritha";
        }

        System.out.println("LS: Bringe Pizza zum Kunden.");
        return pizza;
    }
}
