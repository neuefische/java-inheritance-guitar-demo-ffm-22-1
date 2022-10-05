package de.neuefische;

public class Piano extends Instrument {

    public Piano(String type) {
        super(type);
    }


    // WIE soll es passieren?
    // So!
    @Override
    public String play() {
        return "Hallelujah";
    }

    @Override
    public void clean() {
        System.out.println("Staubwischen");
    }


}
