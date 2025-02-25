package chapter14;

/*

Create a Coin class which has the following:

A field called side
encapsulation
constant variables for heads and tails
a method called flip which randomly chooses heads or tails
and assigns the value to side

 */

import java.util.Random;

public class Coin {

    private String side;
    private String heads = "heads";
    private String tails = "tails";


    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public Coin() {
        side = randomSide();
    }

    public String flip() {
        side = randomSide();
        return side;
    }

    public String randomSide() {
        Random sideFlip = new Random();
        if (sideFlip.nextBoolean()) {
            return heads;
        } else return tails;
    }
}
