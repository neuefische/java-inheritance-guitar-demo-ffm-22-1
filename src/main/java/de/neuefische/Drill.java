package de.neuefische;

// Akkuschrauber = DAS musikalische, HÖRBARE Werkzeug 2024
// Wir nutzen das Interface, weil ein Akkuschrauber KEIN Instrument ist LOL
public class Drill implements Audible {
    @Override
    public String play() {
        return "Driiiillllllllllllllllllll";
    }
}
