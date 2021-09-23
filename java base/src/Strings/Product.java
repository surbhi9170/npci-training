package Strings;

public abstract class Product {
    int price;
    String name;
    public static String[] products={"samsung note 20+","iphone 6"};
    abstract void add(String sellerName,int price);
    abstract void get();
    abstract void sellers();
}
