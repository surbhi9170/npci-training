public class father extends Grandfather{
    int b;
    father()
    {
        super();
        h=h+1;
        c=c+1;
        b=1;
    }

    void bikes()
    {

        System.out.println("bikes : "+b);
    }
    void assets()
    {
        System.out.println("Assets of father");
        houses();
        cars();
        bikes();
    }
}
