package pl.devfoundry.equals_hashcode;

import pl.devfoundry.equals_hashcode.cat.Cat;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsContractExample {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Susie", "black", 3, true);
        Cat cat2 = new Cat("Susie", "black", 3, true);

        System.out.println(cat1.equals(cat2));

        Map<Cat, String> catStringMap = new HashMap<>();
        catStringMap.put(cat1, "value1");
        catStringMap.put(cat2, "value2");

        System.out.println(catStringMap.get(cat1));
        System.out.println(catStringMap.get(cat2));

    }

}
