package de.neuefische;

public class Instrument {

    String type;

    public Instrument() { }

    public Instrument(String type) {
        this.type = type;
    }

    public String play() {
        return "Lalalala";
    }
}
