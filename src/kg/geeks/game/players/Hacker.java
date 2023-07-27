package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.HACK, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int hpReplace = 30;
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        for (int i = 0; i < heroes.length; i++) {
            if (i % 2 == 0){
                boss.setHealth(boss.getHealth() - hpReplace);
                heroes[randomIndex].setHealth(heroes[randomIndex].getHealth() + hpReplace);
                System.out.println("Hacker replace hp on " + heroes[randomIndex].getName());
                break;

            }

        }

    }
}
