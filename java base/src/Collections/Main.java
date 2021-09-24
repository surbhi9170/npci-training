package Collections;

public class Main {
    public static void main(String[] args) {
        Cart inventory=new Cart();
        inventory.add("apples",10);
        inventory.add("banana",10);
        inventory.add("oranges",10);
        inventory.add("kiwi",10);
        inventory.add("strawberry",10);
        System.out.println("Items available: ");
        inventory.get();
        inventory.add2Cart("apples",4);
        inventory.add2Cart("oranges",4);
        inventory.add2Cart("banana",4);
        inventory.add2Cart("grapes",4);
        inventory.displayCart();

    }
}
