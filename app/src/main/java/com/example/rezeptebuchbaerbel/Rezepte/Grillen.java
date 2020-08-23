package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;
import java.util.ArrayList;

public class Grillen {
    ArrayList<RoomRezepte> listRezepteGrillen = new ArrayList<RoomRezepte>();

    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Grillen(){
        listRezepteZutaten = "500 g Champions, frische \n 100 ml Olivenöl \n 3 EL Sojasauce (Ketjap Manis) \n 3 EL Sojasauce (Ketjap Asin) \n 1 TL Thymian \n 1 TL Oregano \n 2 Zehen Knoblauch \n";
        listRezepteAnweisungen = "Die Champions säubern. Den Knoblauch pressen und mit allen Zutaten gut verrühren. Die Marinade \n in eine Frischhaltedose mit Deckel geben. Champions dazu und verschließen. Die Dose mehrmals \n wenden, so dass die Marinade überall an die Champions kommt. Über Nacht ziehen lassen. \n Dann die Champions abgießen und auf Spieße stecken. Dann ca. 10 Minuten Grillen. \n Passt eigentlich zu allem vom Grill als Beilage. \n";
        listRezepteSonstiges = "";
        listRezepteGrillen.add(listRezepteGrillen.size(),new RoomRezepte("Champignonspieße vom Grill",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*

        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteGrillen.add(listRezepteGrillen.size(),new RoomRezepte("Name",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/
        return listRezepteGrillen;
    }
}
