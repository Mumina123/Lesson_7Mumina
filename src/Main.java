public class Main {
    public static void main(String[] args) {

        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();

        Hero[] heroes ={magic,medic,warrior};
        String[] strings ={"SuperAbility", "Superability", "SuperAbility"};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySyperAbility(strings[i]);

        }

    }
}