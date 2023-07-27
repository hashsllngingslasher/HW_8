package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Druid extends Hero {
    public Druid(int health, int damage, String name) {
        super(health, damage, SuperAbility.SUMMON, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean summon = RPG_Game.random.nextBoolean();
        boolean random = RPG_Game.random.nextBoolean();
        if (random) {
            for (Hero hero : heroes) {
                if (summon) {
                    hero.setHealth(hero.getHealth() + 5);
                    System.out.println("The Angel was summoned");
                } else if (!summon && boss.getHealth() < boss.getDamage() / 2) {
                    boss.setDamage((int) (boss.getDamage() * 1.5));
                    System.out.println("The Crow was summoned");
                }
                break;
            }
        }
    }
}
