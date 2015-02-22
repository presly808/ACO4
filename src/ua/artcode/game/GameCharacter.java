package ua.artcode.game;

/**
 * Created by serhii on 22.02.15.
 */
public class GameCharacter {

    private String name;
    private int strength;
    private int health;
    private Weapon weapon;

    public GameCharacter() {
    }

    public GameCharacter(String name, int strength,
                         int health, Weapon weapon) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean receiveDamage(int damage){
        return (this.health = this.health - damage) <= 0;
    }

    public boolean fight(GameCharacter another) {
        int damage = weapon.hit();
        return another.receiveDamage(damage);
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
