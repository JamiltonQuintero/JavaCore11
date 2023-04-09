package org.example.scope;

public class TestPerson {
    public static void main(String[] args) {

        // First we'll create a person, JOE using 2 args constructor.
        Person joe = new Person("JOE", "55");

        // Next we'll create a person, using 1 arguments
        Person deb = new Person("DEB", "85");

        // And now the noargs constructor, and using setters


        System.out.println(joe);
        System.out.println(deb);

        Person ann = new Person();

        System.out.println(ann);

        ann.setAge("21");
        ann.setInstanceName("ANN");

        System.out.println(ann);
    }
}