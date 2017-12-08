package com.baris;

public class Main {

    public static void main(String[] args) {
//        Player player1 = new Player();
//
//        player1.name = "Baris";
        //      player1.health = 20;
//        player1.weapon = "sword";
//
        //      int damage = 10;
//        player1.loseHealth(damage);
//        System.out.println("Remaining Health = "
        //      + player1.remainingHealth());
//
        //      damage = 11;
        //player1.health = 200; // sonradan ekledik
        //player1.loseHealth(damage);
        // System.out.println("2.Remaining Health = "
//                + player1.remainingHealth());

        EnhancedPlayer playera =
                new EnhancedPlayer("tim",200,"sword");
        System.out.println("initial health is " +
         playera.getHealth());


    }
}
