package neueFische;

import java.util.Objects;

//Elternklasse -> Superklasse genannt
public class Instrument {

    // Fest für alle Klassen!
    private static String material = "Wood";

    // Konstante für alle Klassen! Example: In Util Klassen wie PI oder die Math Klasse
    private static final String MATERIAL = "Wood";

    private double price;
    private String color;

    // Constructor
    public Instrument(double price, String color) {
        this.price = price;
        this.color = color;
    }

    // Method makeNoise
    public void makeNoise(){
        System.out.println("Instrument sounds");
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static String getMaterial() {
        return material;
    }


    public String changeMaterial(String material){
        return material;
    }

    // Immer neu generieren wenn neue Properties hinzu gekommen sind. Sonst erhält man falsche Werte!!!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }

    // Ohne diese Methode erhält man nur einen Hashcode. Daher immer toString() generieren
    @Override
    public String toString() {
        return "Instrument{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}