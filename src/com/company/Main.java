package com.company;

public class Main {

    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setIndex("65104");
        adress.setCountry("UkrAine");
        adress.setCity("odesa");
        adress.setStreet("glushko");
        adress.setBuilding("11/2");
        adress.setAppartment("55");

        System.out.println(adress);

    }
}
