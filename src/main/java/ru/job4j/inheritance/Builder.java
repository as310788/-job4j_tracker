package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String specialization;

    public Builder(String name, String surname, String education, int birthday, String nationality, String specialization) {
        super(name, surname, education, birthday, nationality);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}