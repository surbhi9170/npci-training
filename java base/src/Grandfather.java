public class Grandfather extends Heirloom{

    Grandfather()
    {
        h=2;
        c=1;
    }
    void houses()
    {

        System.out.println("houses: "+h);
    }
    void cars()
    {

        System.out.println("cars : "+c);
    }
   void assets()
   {
       System.out.println("Assets of grandfather");

       houses();
       cars();
   }
}
