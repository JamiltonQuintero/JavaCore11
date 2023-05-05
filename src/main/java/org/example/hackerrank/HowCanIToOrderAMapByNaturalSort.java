package org.example.hackerrank;

import java.lang.reflect.Array;
import java.util.*;

public class HowCanIToOrderAMapByNaturalSort {

    public static void main(String[] args) {

        /*Map<Integer, Persona> personas = new TreeMap<>();
        personas.put( 1, new Persona("Juan", 30));
        personas.put( 2, new Persona("Pedro", 25));
        personas.put( 3, new Persona("Maria", 40));

        for (Map.Entry<Integer, Persona> integerPersonaEntry : personas.entrySet()){
            System.out.println(integerPersonaEntry.getKey());
            System.out.println(integerPersonaEntry.getValue().getNombre());
        }*/


        Map<Persona, Integer> personas = new HashMap<>();

        personas.put(new Persona("Juan", 30), 1);
        personas.put(new Persona("Pedro", 25), 2);
        personas.put(new Persona("Maria", 40), 3);

        for (Map.Entry<Persona, Integer> integerPersonaEntry : personas.entrySet()){
            System.out.println(integerPersonaEntry.getKey().getNombre());
            System.out.println(integerPersonaEntry.getValue());
        }

    }

}


class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona o) {
        return nombre.compareTo(o.nombre);
    }
}

class Persona2 implements Comparable<Persona2>{
    private String nombre;
    private int edad;

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona2 o) {
        return nombre.compareTo(o.nombre);
    }
}

