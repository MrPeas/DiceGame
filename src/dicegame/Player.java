package dicegame;

/**
 * Created by Janusz on 18.10.2016.
 */
abstract public class Player {
    private int number;
    private String name;

    Player(String name) {
        if (name != null && name.matches("^[a-z,0-9,A-Z, ]{3,}$")) {
            this.name = name;
        } else {
            System.out.print("błąd podaj poprawne imię: ");
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    abstract void guess();
}
