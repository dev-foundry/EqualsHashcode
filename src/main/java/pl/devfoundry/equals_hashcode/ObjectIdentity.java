package pl.devfoundry.equals_hashcode;

import pl.devfoundry.equals_hashcode.cat.Cat;

public class ObjectIdentity {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Susie", "black", 3, true);
        Cat cat2 = cat1;

        System.out.println(cat1 == cat2);

    }

}
