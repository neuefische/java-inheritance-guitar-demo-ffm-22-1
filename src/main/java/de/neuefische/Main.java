package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Guitar myRealGuitar = new Guitar("Gitarre");
        Piano piano = new Piano("Klavier");

        piano.play();

        System.out.println(
                myRealGuitar.play()
        );
        System.out.println(
                piano.play()
        );

        myRealGuitar.clean();
        piano.clean();
    }
}