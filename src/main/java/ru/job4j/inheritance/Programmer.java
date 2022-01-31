package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private char gender;

    public Programmer(String name, String surname, String education, int birthday, String nationality, char gender) {
        super(name, surname, education, birthday, nationality);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }
}