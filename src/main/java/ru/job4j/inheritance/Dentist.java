package ru.job4j.inheritance;

public class Dentist extends Doctor{

    private int experience;

    public Dentist(String name, String surname, String education, int birthday, String patient, int experience) {
        super(name, surname, education, birthday, patient);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
