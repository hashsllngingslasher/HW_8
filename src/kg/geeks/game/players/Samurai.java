package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Samurai extends Hero{
    public Samurai(int health, int damage, String name) {
        super(health, damage, SuperAbility.SHURIKENS, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int shuriken = 50;
        boolean virus = RPG_Game.random.nextBoolean();
        if (virus) {
            boss.setHealth(boss.getHealth() - shuriken);
            System.out.println("Samurai use virus");
        }else {
            boss.setHealth(boss.getHealth() + shuriken);
            System.out.println("Samurai use vaccine");
        }



    }
}
