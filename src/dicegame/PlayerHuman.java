package dicegame;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Janusz on 18.10.2016.
 */
public class PlayerHuman extends Player {
    private final Scanner in = new Scanner(System.in);

    public PlayerHuman(String name) {
        super(name);
    }

    @Override
    public void guess() {
            System.out.println("Podaj liczbe od 1 do 6 ");
            try {
                int number = in.nextInt();
                setNumber(number);
            } catch (InputMismatchException me) {
                System.out.println("Błąd-Podaj liczbe od 1 do 6");
            }
    }

}
