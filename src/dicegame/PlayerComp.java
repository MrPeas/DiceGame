package dicegame;

import java.util.Random;

/**
 * Created by Janusz on 18.10.2016.
 */
public class PlayerComp extends Player {
    private Random rand=new Random();

    PlayerComp (String name){
        super(name);
    }
    @Override
    void guess() {
    setNumber(rand.nextInt(6)+1);
    }
}
