package org.example.hackerrank.natural;

public class Animal2 implements Comparable<Animal2> {

    private int id;
    private String name;
    private Byte age;

    public Animal2(int id, String name, Byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Animal2 o) {
        return age.compareTo(o.age);
    }
}
