package com.baris;

public class EnhancedPlayer {

    private String name;
    private int health =100; //ENCAPSULATION özelliği: health =100 değişti
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //ENCAPSULATION:
        if(health >0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health<=0) {
            System.out.println("game over");
            // reduce life
        }
    }

    public int getHealth() {
        return health;
    }
}
