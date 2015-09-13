/**
 * Basic class that represents a Bicycle
 * Created by Robert on 8/30/2014.
 */
public class Bicycle {
    private String color;
    private String type;
    private int milesRidden;

    /**
     * Constructs a Bicycle object
     * @param myColor
     * @param myType
     * @param myMilesRidden
     */
    public Bicycle(String myColor, String myType, int myMilesRidden) {
        color = myColor;
        type = myType;
        milesRidden = myMilesRidden;
    }

    /**
     * Get the color of the bike
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the type of the bike
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the total miles someone has ridden the bike
     * @return the miles
     */
    public int getMilesRidden() {
        return milesRidden;
    }

    /**
     * Add to the miles ridden
     * @param miles
     */
    public void addMiles(int miles) {
        milesRidden += miles;
    }
    
    public String toString() {
      return "["+color+", " + type + ", " + milesRidden +"]";
      
    }
    
    
    
    
    
    
    
}
