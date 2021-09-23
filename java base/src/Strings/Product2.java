package Strings;

import java.util.Scanner;

public class Product2 extends Product{

    String name="iphone 6";
    String[] sellers={"seller 4","seller 5","seller 6"};
    int[] price={70000,90000,100000};

    @Override
    void add(String sellerName, int price) {

    }

    @Override
    void get() {
        System.out.println("product:"+ name);
        int min=0;
        for (int i=0;i<price.length;i++)
        {
            if(price[i]<price[min])
            {
                min=i;
            }
        }
        System.out.println("Recommended seller: "+sellers[min]+" price:"+price[min]);
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you wish to see all the sellers instead? yes/no:");
        String choice= sc.nextLine();
        if(choice.equalsIgnoreCase("yes"))
        {
            sellers();
        }
        else
        {
            System.exit(0);
        }


    }

    @Override
    void sellers() {
        System.out.println("ALL THE SELLERS");

        for (int i=0;i<price.length;i++)
        {
            System.out.println(sellers[i]+"  "+price[i]);
        }
    }
}
