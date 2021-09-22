public class Bike extends Vehicles{
    String regno;
    String model;
    String gear;
    String[] color={"red","white"};
    Bike(String model)
    {
        wheels=2;
        gear="Manual";
        this.model=model;
    }
    void displayWheels()
    {
        System.out.println("no of wheels: "+wheels);

    }
    void displayGears()
    {
        System.out.println("gear type: "+ gear);
    }
    void displayColor()
    {
        System.out.println("Colors available");
        for (String c: color)
        {
            System.out.print(c+",");
        }
    }

    @Override
    void display() {
        System.out.println("Features for "+model+" Bike :");
        displayWheels();
        displayGears();
        displayColor();
    }
}
