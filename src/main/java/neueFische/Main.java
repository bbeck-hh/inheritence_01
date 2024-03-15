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

        Instrument[] myInstruments = {piano, violin};

    }

    // Polymorphism
    public static void printInstrument(Instrument instrument){
        System.out.println(instrument);

    }
}
