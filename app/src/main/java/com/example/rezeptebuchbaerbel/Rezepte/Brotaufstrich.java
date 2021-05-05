package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.RoomRezepte;
import java.util.ArrayList;

public class Brotaufstrich {
    ArrayList<RoomRezepte> listRezepteBrotaufstrich = new ArrayList<RoomRezepte>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Brotaufstrich(){
        listRezepteName = "Brot mit Obazda, Radieschen und roten Zwiebeln";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "0,5 Stück Rote Zwiebeln \n 30 g Kirschtomaten \n 2 Stück Radieschen \n 6 Halme Schnittlauch \n Salz, Pfeffer \n 1 Prise Zucker \n 2 Scheiben Rustikales Brot \n 75 g Obadzda";
        listRezepteAnweisungen = "1.) \n Zwiebeln nochmals halbieren und in feine Streifen schneiden. Kirschtomaten halbieren. \n Radieschen in dünne Scheiben schneiden oder hobeln. Den Schnittlauch in schräge Röllchen \n schneiden. Kirschtomaten, Radieschen und Zwiebel in einer Schüssel mischen, mit Salz, \n Pfeffer und Zucker abschmecken. \n 2.) \n Jede Brotscheibe mit der Hälfte des Obazda bestreichen. Jeweils die Hälfte der \n Tomatenmischung auf den Brotscheiben verteilen. Mit Schnittlauchröllchen betreuen. \n Obazda selbst gemacht: \n 1 kleinen Camembert mit der Gabel zerdrücken. 1 Lauchzwiebel hacken. Beides mit 50g \n weicher Butter, Paprikapulver, Pfeffer, Salz und etwas Kümmel verrühren.";
        listRezepteSonstiges = "Zubereitungszeit ca. 10 Minuten.";
        listRezepteBrotaufstrich.add(listRezepteBrotaufstrich.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Toffitella";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 Packung Toffifee (125g) \n 40g Butter \n 40g flüssige Sahne \n ";
        listRezepteAnweisungen = "Toffifee in den Mixtopf geben und 10sec. / Stufe 10 \n zerkleinern. Butter und Sahne zugeben und 5min / 50°C / Stufe 2 \n verrühren. Im Kühlschrank wird der Auftrich etwas fester. \n ";
        listRezepteSonstiges = "Es können auch Bounty oder Snickers verwendet werden. \n ";
        listRezepteBrotaufstrich.add(listRezepteBrotaufstrich.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


/*
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteBrotaufstrich.add(listRezepteBrotaufstrich.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/
        return listRezepteBrotaufstrich;
    }
}
