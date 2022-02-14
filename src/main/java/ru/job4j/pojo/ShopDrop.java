package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
           products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 5);
        Product[] rsl = ShopDrop.delete(products, 1);
        System.out.println(rsl);
    }
}

