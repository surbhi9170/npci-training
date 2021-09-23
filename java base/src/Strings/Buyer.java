package Strings;
import java.util.*;
public class Buyer {
    String prodName;
    Product product;
    void getPriceDetails()
    {
        int i=1;
        for (String product : Product.products) {
            System.out.println(i+". "+ product);
            i++;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice :");
        int choice=sc.nextInt();
        if(choice==1)
        {
            product=new Product1();
            product.get();
        }
        else if(choice==2)
        {
            product=new Product2();
            product.get();

        }

    }

}
