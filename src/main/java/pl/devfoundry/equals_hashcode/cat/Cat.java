package pl.devfoundry.equals_hashcode.cat;

public class Cat {

    private String name;
    private String color;
    private int age;
    private boolean hasTail;

    public Cat(String name, String color, int age, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (hasTail != cat.hasTail) return false;
        if (!name.equals(cat.name)) return false;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + age;
        result = 31 * result + (hasTail ? 1 : 0);
        return result;
    }

}
