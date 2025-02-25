package chapter14;

/*

Create a Coin class which has the following:

A field called side
encapsulation
constant variables for heads and tails
a method called flip which randomly chooses heads or tails
and assigns the value to side

 */

public class CoinTossGame {
    public static void main(String[] args) {
        Coin newCoin = new Coin();

        System.out.println(newCoin.flip());
    }
}
