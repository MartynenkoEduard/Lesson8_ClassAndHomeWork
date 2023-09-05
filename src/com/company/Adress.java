package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Calendar;

/**
 * 1. Создать класс с именем Address. В теле класса требуется создать поля:
 * index, country, city, street, house, apartment. Для каждого поля,
 * создать свойство с двумя методами доступа(set и get). Создать экземпляр
 * класса Address. В поля экземпляра записать информацию о почтовом
 * адресе. Выведите на экран значения полей, описывающих адрес.
 */
public class Adress {

    String index;
    String country;
    String city;
    String street;
    String building;
    String appartment;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        int number = Integer.parseInt(index);
        if (number > 9999 && number < 1000000) {
            this.index = index;
        } else {
            System.out.println("Incorrect index number");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() > 0) {
            country = capitalize(country);
            this.country = country;
        } else {
            System.out.println("Incorrect input of country name");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city.length() > 0) {
            city = capitalize(city);
            this.city = city;
        }
        else {
            System.out.println("Incorrect input of city name");
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.length() > 0) {
            street = capitalize(street);
            this.street = street;
        }
        else {
            System.out.println(" Incorrect street name");
        }
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    private String capitalize(String text) {
        text = text.strip();
        String result = "";
        result += Character.toUpperCase(text.charAt(0));
        for (int i = 1; i < text.length(); i++) {
            result += Character.toLowerCase(text.charAt(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return "index :" + index +
                ", country: " + country +
                ", city: " + city +
                ", street: " + street +
                ", building: " + building +
                ", appartment: " + appartment ;
    }
}

