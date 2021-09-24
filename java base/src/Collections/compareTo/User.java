package Collections.compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    int id;
    String name;
    List<User> list;
    User()
    {
        this.id=0;
        this.name=" ";
    }
    User(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void createList()
    {
        list=new ArrayList<>();

    }
    void addUser(int id1,String name1)
    {
        list.add(new User(id1,name1));
    }
    void sort()
    {
        Collections.sort(list,new SortById());
    }
    void display()
    {
        for (User u: list)
        {
            System.out.println(u.id+" "+u.name);
        }
    }
}
