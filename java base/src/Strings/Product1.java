package Strings;

public class Product1 extends Product{

    String name="Samsung s20 note+";
    String[] sellers={"seller 1","seller 2","seller 3"};
    int[] price={50000,70000,40000};

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
        System.out.println("ALL THE SELLERS");
        sellers();

    }

    @Override
    void sellers() {
        for (int i=0;i<price.length;i++)
        {
           System.out.println(sellers[i]+"  "+price[i]);
        }
    }
}
