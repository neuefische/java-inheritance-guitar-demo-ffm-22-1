package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Instrument guitarInstrument = new Instrument();

        Guitar myRealGuitar = new Guitar();

        System.out.println(
                guitarInstrument.play()
        );

        System.out.println(
                myRealGuitar.play()
        );

        guitarInstrument.getType();
        myRealGuitar.getType();

        myRealGuitar.getNumberOfStrings();
//        Funktioniert nicht
//        guitarInstrument.getNumberOfStrings();
    }
}