package Collections;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Inventory {
    List<String> cartproduct;
    List<Integer> cartqty;
    Cart()
    {
        cartproduct=new ArrayList<>();
        cartqty=new ArrayList<>();
    }
    void add2Cart(String prod,int q)
    {

        int c=0;
        for(int i=0 ;i<product.size();i++)
        {
            if(prod.equalsIgnoreCase(product.get(i)) && (qty.get(i))>=q) {
               cartproduct.add(prod);
               cartqty.add(q);
               c++;
            }

        }
        if (c==0)
        {
            System.out.println(prod+" : product not available");
        }
    }
    void displayCart()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Items in your cart: ");
        for(int i=0 ;i<cartproduct.size();i++)
        {
            System.out.println(cartproduct.get(i)+" : "+cartqty.get(i));
        }
        System.out.println("-------------------------------------------------------------");

    }

}
