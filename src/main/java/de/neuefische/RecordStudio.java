package de.neuefische;

public class RecordStudio {

    // Wir übergeben einen komplexen Datentyp als Parameter
    // Typ = Audible (groß geschrieben)
    // "Variable" = audibleObject (wie nennen wir den Parameter)
    public void record(Audible audibleObject) {
        System.out.println("Whadup! Wir nehmen Musik auf.");
        System.out.println("Aufnahme von: " + audibleObject.play() + "\n");
    }
}
