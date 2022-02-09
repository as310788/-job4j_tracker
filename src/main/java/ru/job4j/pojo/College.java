package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иванов Иван Иваныч");
        student.setGroup("1 МЕДИЦИНСКИЙ");
        student.setData("01.01.2000");
        System.out.println(student.getName() + " номер группы - " + student.getGroup() + " : дата поступления " + student.getData());
    }
}
