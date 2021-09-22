public class Main {
    public static void main(String[] args) {

        Heirloom grandfather = new Grandfather();
        Heirloom father = new father();
        grandfather.assets();
        father.assets();

        //CAR and bike multiple inheritance
        Vehicles car=new Car("Maruti");
        car.display();
        System.out.println("");
        Vehicles bike=new Bike("Bentley");
        bike.display();
    }
}
