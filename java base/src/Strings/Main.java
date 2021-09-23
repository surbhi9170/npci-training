package Strings;

public class Main {
    public static void main(String[] args) {

        //Strings
        String s1="hello";
        String s2="hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s2="surbhi";
        System.out.println(s2.hashCode());

        System.out.println(s2.concat(" jain").hashCode()+" "+s2.hashCode());

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.append("surbhi ").append("jain").toString().hashCode());

        //Seller

        Product phone=new Product1();
        phone.get();

    }
}

