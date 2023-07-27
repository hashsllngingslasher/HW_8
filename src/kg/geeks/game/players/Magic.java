package kg.geeks.game.players;

public class Magic extends Hero {
    private int boostPower;

    public Magic(int health, int damage, int boostPower, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.boostPower = boostPower;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && this != hero) {
                hero.setDamage(hero.getDamage() + boostPower);
            }
        }
    }
}
