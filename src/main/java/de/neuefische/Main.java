package de.neuefische;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Piano piano = new Piano("Klavier");
        Guitar eGuitar = new EGuitar();
        Drill drill = new Drill();

        Instrument asd = new Guitar();

        List<Audible> instrumentenkiste = new ArrayList<>();


        instrumentenkiste.add(piano);
        instrumentenkiste.add(eGuitar);


        RecordStudio recordStudio = new RecordStudio();
        recordStudio.record(piano);
        recordStudio.record(eGuitar);
        recordStudio.record(drill);
    }
}