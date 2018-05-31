package pl.devfoundry.equals_hashcode;

import pl.devfoundry.equals_hashcode.cat.Cat;

import java.util.HashMap;
import java.util.Map;


public class HashCodeExample {

    public static void main(String[] args) {

        Cat susie = new Cat("Susie", "black", 3, true);
        Cat lester = new Cat("Lester", "white", 5, true);
        Cat tom = new Cat("Tom", "grey", 2, true);
        Cat lili = new Cat("Lili", "mixed", 1, false);

        Map<Cat, String> catOwners = new HashMap<>();
        catOwners.put(susie, "Marek");
        catOwners.put(lester, "Ania");
        catOwners.put(tom, "Krzysiek");
        catOwners.put(lili, "Magda");

        System.out.println(susie.hashCode());
        System.out.println(lester.hashCode());
        System.out.println(tom.hashCode());
        System.out.println(lili.hashCode());

        String catOwner = catOwners.get(lester);
        System.out.println(catOwner);

    }

}
