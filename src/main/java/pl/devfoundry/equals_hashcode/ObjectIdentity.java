package pl.devfoundry.equals_hashcode;

import pl.devfoundry.equals_hashcode.cat.Cat;

public class ObjectIdentity {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Susie", 3);
        Cat cat2 = new Cat("Lester", 5);

        System.out.println(cat1 == cat2);

    }

}
