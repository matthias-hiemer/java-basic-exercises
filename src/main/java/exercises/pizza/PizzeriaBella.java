package exercises.pizza;

public class PizzeriaBella {

    public String machePizza() {
        SuperOfen2000 ofen = new SuperOfen2000();
        ofen.setWorking(false);
        SuperOfen2000 ofen2 = new SuperOfen2000();
        ofen2.setWorking(true);


        System.out.println("PB: Ich belege die Pizza...");
        String pizza = "Boden, Tomentsoße, Käse";
        String fertigePizza;

        try {
            fertigePizza = ofen.backe(pizza);
        } catch (OfenKaputtException e) {
            throw new RuntimeException("Unser Ofen ist kaputt!", e);
        }

        fertigePizza = fertigePizza + " im karton";
        return fertigePizza;
    }
}
