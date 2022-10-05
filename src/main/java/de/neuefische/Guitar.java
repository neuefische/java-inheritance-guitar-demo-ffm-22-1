package de.neuefische;

// Kindobjekt

// Gitarre IST ein Objekt Instrument
// Dies geschieht durch "extends"
public class Guitar extends Instrument {

    // int wird in das Objekt "Integer" verpackt
    private Integer numberOfStrings = 6;

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
