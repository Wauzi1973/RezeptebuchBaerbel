package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;
import java.util.ArrayList;

public class Brotaufstrich {
    ArrayList<RoomRezepte> listRezepteBrotaufstrich = new ArrayList<RoomRezepte>();

    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Brotaufstrich(){
        listRezepteZutaten = "0,5 Stück Rote Zwiebeln \n 30 g Kirschtomaten \n 2 Stück Radieschen \n 6 Halme Schnittlauch \n Salz, Pfeffer \n 1 Prise Zucker \n 2 Scheiben Rustikales Brot \n 75 g Obadzda";
        listRezepteAnweisungen = "1.) \n Zwiebeln nochmals halbieren und in feine Streifen schneiden. Kirschtomaten halbieren. \n Radieschen in dünne Scheiben schneiden oder hobeln. Den Schnittlauch in schräge Röllchen \n schneiden. Kirschtomaten, Radieschen und Zwiebel in einer Schüssel mischen, mit Salz, \n Pfeffer und Zucker abschmecken. \n 2.) \n Jede Brotscheibe mit der Hälfte des Obazda bestreichen. Jeweils die Hälfte der \n Tomatenmischung auf den Brotscheiben verteilen. Mit Schnittlauchröllchen betreuen. \n Obazda selbst gemacht: \n 1 kleinen Camembert mit der Gabel zerdrücken. 1 Lauchzwiebel hacken. Beides mit 50g \n weicher Butter, Paprikapulver, Pfeffer, Salz und etwas Kümmel verrühren.";
        listRezepteSonstiges = "Zubereitungszeit ca. 10 Minuten.";
        listRezepteBrotaufstrich.add(listRezepteBrotaufstrich.size(),new RoomRezepte("Brot mit Obazda, Radieschen und roten Zwiebeln",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


/*

        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteBrotaufstrich.add(listRezepteBrotaufstrich.size(),new RoomRezepte("Name",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/
        return listRezepteBrotaufstrich;
    }
}
