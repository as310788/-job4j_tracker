package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book one = new Book("Story", 150);
        Book two = new Book("FaryTale", 256);
        Book three = new Book("Auto", 111);
        Book four = new Book("Clean code", 258);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;
        for (int index = 0; index < books.length; index++) {
        Book pg = books[index];
        System.out.println(pg.getName() + " - " + pg.getPages());
        }

        System.out.println("Переставьте местами книги с индексом 0 и 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
        Book pg = books[index];
        System.out.println(pg.getName() + " - " + pg.getPages());
        }

        System.out.println("цикл с выводом книг с именем \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
        Book pg = books[index];
        if ("Clean code".equals(pg.getName())) {
        System.out.println(pg.getName() + " - " + pg.getPages());
        }
    }
}
}
