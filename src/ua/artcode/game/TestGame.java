package ua.artcode.game;

/**
 * Created by serhii on 22.02.15.
 */
public class TestGame {

    public static void main(String[] args) {
        Sword sword = new Sword();
        Knife knife = new Knife();
        Druchok druchok = new Druchok();

        GameCharacter troll = new GameCharacter("Vasia", 90, 400, knife);
        GameCharacter human = new GameCharacter("Oleg", 70, 100, sword);


        for (;;) {

            System.out.printf("Before human attack %s\n %s\n", human, troll);
            if(human.fight(troll)){
                break;
            }
            human.setWeapon(druchok);

            System.out.printf("Before troll attack %s\n %s\n", human, troll);
            if(troll.fight(human)){
                break;
            }

            System.out.printf("after step attack %s\n %s\n", human, troll);
        }

        System.out.printf("after fight %s\n %s\n", human, troll);




    }

}
