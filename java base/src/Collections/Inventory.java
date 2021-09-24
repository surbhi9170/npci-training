package Collections;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
     List<String> product;
     List<Integer> qty;
    Inventory()
    {
        product=new ArrayList<>();
        qty=new ArrayList<>();
    }
    void add(String product1,int qty1)
    {
        product.add(product1);
        qty.add(qty1);

    }
    void get()
    {
        for(int i=0 ;i<product.size();i++)
        {
            System.out.println(product.get(i)+" : "+qty.get(i));
        }
    }

}
