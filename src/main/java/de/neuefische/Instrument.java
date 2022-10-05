package de.neuefische;

// Elternobjekt

// "Ich möchte ein Instrument kaufen"
// "Ja welches denn?!"
// -> Man kann kein "Instrument" im Laden kaufen
//    -> Man kann aber Gitarren, Pianos, etc kaufen!
public abstract class Instrument {

    private String type;

    public Instrument() { }

    public Instrument(String type) {
        this.type = type;
    }

    // Sagt WAS passieren soll
    // (aber nicht wie)
    public abstract String play();

    public abstract void clean();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "type='" + type + '\'' +
                '}';
    }
}
