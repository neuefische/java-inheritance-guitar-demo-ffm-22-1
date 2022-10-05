package de.neuefische;

// Jede "Gitarre" IST ein Typ der Klasse "Instrument" -> Dies geschieht durch "extends"
// Kindobjekt
public class Guitar extends Instrument {

    // int wird in das Objekt "Integer" verpackt
    private Integer numberOfStrings = 6;
    private String type;

    public Guitar(String type) {
        // super() = Konstruktor der Elternklasse
        // Gitarre ist ein Instrument, deshalb müssen wir "erstmal" das Instrument bauen
        super(type);

    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    // super = Elternklasse
    // @Override = Überschreibe die Methode der Elternklasse
    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                "} " + super.toString();
    }
}
