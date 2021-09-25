package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrac {
    public static void main(String[] args) {
        HashMap<String,Long> phonebook=new HashMap();
        phonebook.put("surbhi", 132243L);
        phonebook.put("gaurav", 232444L);
        phonebook.put("sarika", 213431L);
        phonebook.put("sanjay", 442121L);

        Set<String> keys=phonebook.keySet();
        for(String i:keys)
        {
            System.out.println(i+" : "+phonebook.get(i));
        }

        //2nd way to print
        Set<Map.Entry<String,Long>> values=phonebook.entrySet();
        for(Map.Entry<String,Long> entry: values)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
