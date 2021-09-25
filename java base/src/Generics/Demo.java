package Generics;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Demo<E> {
    E element;
    String encoded;
    void add(E element)
    {
        this.element=element;
    }
    void get()
    {
        System.out.println(element.getClass());
        System.out.println(element);

    }
    void encode()
    {
        Encoder encoder= Base64.getEncoder();
        encoded = encoder.encodeToString(element.toString().getBytes());
        System.out.println(encoded);
    }
    void decode()
    {
        Base64.Decoder decoder=Base64.getDecoder();
        String decoded = new String(decoder.decode(encoded));
        System.out.println(decoded);

    }
    public static void main(String[] args)
    {
        Demo<String> d1=new Demo<>();
        d1.add("surbhi");
        d1.get();
        d1.encode();
        d1.decode();
        Demo<Integer> d2=new Demo<>();
        d2.add(1200);
        d2.get();
        d2.encode();
        d2.decode();
    }
}

