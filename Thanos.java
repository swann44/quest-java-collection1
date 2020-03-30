import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        //ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        Hero black_widow = new Hero("Black Widow", 34);
        Hero captain_america = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron_man = new Hero("Iron Man", 48);
        Hero scarlet_witch = new Hero("Scartlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctor_strange = new Hero("Doctor Strange", 42);

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(black_widow);
        heroes.add(captain_america);
        heroes.add(vision);
        heroes.add(iron_man);
        heroes.add(scarlet_witch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctor_strange);
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        //Hero stuff = heroes.get(5);
        //System.out.println(stuff.getName() + stuff.getAge());
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        
        // TODO 5 : Keep only the half of the list
        List<Hero> heroes2 = heroes.subList(0, 4);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i =0; i< heroes2.size(); i++) {
            Hero stuff = heroes2.get(i);
            System.out.println(stuff.getName());
        }
    }
}
