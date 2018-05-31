package pl.devfoundry.equals_hashcode;

public class StringPool {

    public static void main(String[] args) {

        String name1 = "Charlie";
        String name2 = new String("Charlie");

        System.out.println(name1.equals(name2));

    }

}
