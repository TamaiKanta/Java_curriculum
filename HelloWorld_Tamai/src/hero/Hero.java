package hero;

import java.util.Random;

import stats.Character;

public class Hero extends Character {

    public Hero(String name) {
        super(name);
    }

    protected void generateStats() {
        Random rand = new Random();
        this.hp = rand.nextInt(1000);
        this.mp = rand.nextInt(1000);
        this.attack = rand.nextInt(500);
        this.speed = rand.nextInt(1000);
        this.defense = rand.nextInt(100);
    }
}
