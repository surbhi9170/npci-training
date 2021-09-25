package Collections.compareTo;

public class Main {
    public static void main(String[] args) {
        User u=new User();
        u.createList();
        u.addUser(1,"surbhi");
        u.addUser(21,"qwhrjej");
        u.addUser(14,"efds");
        u.addUser(23,"afwsf");
        u.addUser(1,"ewr");
        u.addUser(6,"me");
        u.display();
        u.sort();
        System.out.println("sorted by id -------------------------------------------");
        u.display();
    }
}
