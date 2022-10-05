package de.neuefische;

// Elternobjekt
public class Instrument {

    private String type;

    public Instrument() { }

    public Instrument(String type) {
        this.type = type;
        // Noch irgendeine besondere Logik..
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String play() {
        return "Lalalala";
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "type='" + type + '\'' +
                '}';
    }
}
