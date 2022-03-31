package exercises.pizza;

public class SuperOfen2000 {

    boolean isWorking;

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public String backe(String pizza) {

        if (isWorking) {
            return "gebackene " + pizza;
        }
        else {
            throw new OfenKaputtException("Feuer, Rauch und Funken!");
        }
    }
}
