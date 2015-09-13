/**
 * Demonstrating constructors, methods, state
 * Created by Robert on 8/30/2014.
 */
public class BicycleTester {
    public static void main(String[] args) {
        Bicycle theOzBike = new Bicycle("Green", "Road", 45000);
        System.out.println("The bike color is " + theOzBike.getColor());
        System.out.println("The bike type is " + theOzBike.getType());
        System.out.println("I have ridden the bike " + theOzBike.getMilesRidden());
        //theOzBike.addMiles(100);
        //System.out.println("Now, I have ridden the bike " + theOzBike.getMilesRidden());
    }
}
