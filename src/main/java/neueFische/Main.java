package neueFische;


public class Main {

    public static void main(String[] args) {

        Piano piano = new Piano(
                3000.00, "Black", 12
        );

        Violin violin = new Violin(
                200.00, "Red", 4
        );

        violin.makeNoise();
        piano.makeNoise();

        printInstrument(piano);
        printInstrument(violin);

        System.out.println("\n##################");
        violin.changeMaterial("Metal");
        System.out.println("Static ist in der Klasse: Intrument gesetzt: " + piano.getMaterial());
        System.out.println("Static ist in der Klasse: Intrument gesetzt: " + violin.getMaterial());
        System.out.println("##################\n");

        Instrument[] myInstruments = {piano, violin};

    }

    // Polymorphism
    public static void printInstrument(Instrument instrument){
        System.out.println("Hier: " + instrument);

    }
}
