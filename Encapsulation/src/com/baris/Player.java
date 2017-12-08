package com.baris;

public class Player {

    public String name; // dont do public use encapsulation
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health<=0) {
            System.out.println("game over");
            // reduce life
        }
    }
    public int remainingHealth() {
        return this.health;
    }

}
