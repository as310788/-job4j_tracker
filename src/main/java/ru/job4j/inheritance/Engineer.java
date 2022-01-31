package ru.job4j.inheritance;

 public class Engineer extends Profession {

    private String nationality;

    public Engineer(String name, String surname, String education, int birthday, String nationality) {
        super(name, surname, education, birthday);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }
}
