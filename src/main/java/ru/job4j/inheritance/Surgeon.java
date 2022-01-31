package ru.job4j.inheritance;

 public class Surgeon extends Doctor {

    private boolean health;

    public Surgeon(String name, String surname, String education, int birthday, String patient, boolean health) {
        super(name, surname, education, birthday, patient);
        this.health = health;
    }

    public boolean getHealth() {
        return health;
    }
}