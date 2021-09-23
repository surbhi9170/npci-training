package Strings;

public abstract class Product {
    int price;
    String name;
    abstract void add(String sellerName,int price);
    abstract void get();
    abstract void sellers();
}
