public class Car extends Vehicles {
    String regno;
    String model;
    String gear;
    String[] color={"RED","blue","white"};
    Car(String model)
    {
        wheels=4;
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
        System.out.println("Features for "+model);
        displayWheels();
        displayGears();
        displayColor();
    }
}
