package neueFische;

public class Piano extends Instrument{

    private int numberOfOctaves;

    public Piano(double price, String color, int numberOfOctaves) {
        // Kommt aus dem Konstruktor von Instrument
        super(price, color);
        this.numberOfOctaves = numberOfOctaves;
    }

    public int getNumberOfOctaves() {
        return numberOfOctaves;
    }

    public void setNumberOfOctaves(int numberOfOctaves) {
        this.numberOfOctaves = numberOfOctaves;
    }

    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("Leichte Piano Musik");
    }

    @Override
    public String toString() {
        return "Piano{" +
                "numberOfOctaves Wie viel Tasten: " + numberOfOctaves +
                "} " + super.toString();
    }
}