package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Instrument guitarInstrument = new Instrument("Gitarre");
        Guitar myRealGuitar = new Guitar("Gitarre");

        System.out.println(
                guitarInstrument.play()
        );

        System.out.println(
                myRealGuitar.play()
        );

        guitarInstrument.getType();
        myRealGuitar.getType();

        myRealGuitar.getNumberOfStrings();
        // guitarInstrument.getNumberOfStrings(); <- Funktioniert nicht

        System.out.println(guitarInstrument.toString());
        System.out.println(myRealGuitar.toString());


    }
}