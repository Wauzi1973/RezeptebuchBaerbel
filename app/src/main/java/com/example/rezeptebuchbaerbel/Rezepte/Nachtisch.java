package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;
import java.util.ArrayList;

public class Nachtisch {
    ArrayList<RoomRezepte> listRezepteNachtisch = new ArrayList<RoomRezepte>();

    String listRezepteName;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Nachtisch(){
        listRezepteName = "Mascarpone Himbeerquark";
        listRezepteZutaten = "1 Becher Schlagsahne, 200g, geschlagen \n 2 Becher Naturjoghurt, à 150g \n 250g Mascarpone \n 500g Magerquark \n 500g Himbeeren, TK, nicht aufgetaut \n 200g Zucker \n Schokolade, weiße, geraspelt \n ";
        listRezepteAnweisungen = "Quark, Joghurt und Mascarpone gut mit dem Zucker verrühren, am besten \n das Handrührgerät benutzen, damit sich der Zucker gut löst. \n Dann die steif geschlagene Sahne unterheben. \n Nun die gefrorenen Himbeeren und die Quarkmasse abwechselnd schichten \n (sieht in einer Glasschüssel am nettesten aus). \n Mit der geraspelten Schokolade bestreuen. \n Muss mindestens 3 Stunden durchziehen (wegen der Himbeeren); kann \n man gut am Abend vorher zubereiten und dann im Kühlschrank aufbewahren. \n ";
        listRezepteSonstiges = "Arbeitszeit: ca. 10 Min. Ruhezeit: ca. 3 Std. \n Tipp: \n Verwendet man frische Früchte, verringert sich die Zuckermenge! \n ";
        listRezepteNachtisch.add(listRezepteNachtisch.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Spekulatius Creme";
        listRezepteZutaten = "250 g Mascarpone \n 250 g Quark 40% \n 200 ml Sahne \n 4 El Amaretto \n 1 Blatt  Gelatine \n 1 Pck. Gewürz Spekulatius \n 0.5 Pck. Tiefkühlobst (z.B. Waldbeeren) \n 6 El Zucker \n";
        listRezepteAnweisungen = "Tiefkühlobst auftauen, erhitzen und mit dem restlichen Zucker und Gelatine aufkochen. \n Danach die Masse mindestens eine Stunde kalt stellen. Mascarpone, Quark, Amaretto und \n die Hälfte des Zuckers zu einer glatten Masse verrühren. Die Hälfte des Gewürtzspekulatius \n grob zerbröseln, anschließend Mascarponemasse, Spekulatius und Fruchtmasse abwechselnd \n in einem Dessertglas schichten. Die Sahne aufschlagen und sehr feine Spekulatuiskrümel \n daruntermischen und als letztes in das Dessertglas geben. \n Am besten den Spekulatius, zum unter die Sahne heben, fein mörsern. \n";
        listRezepteSonstiges = "";
        listRezepteNachtisch.add(listRezepteNachtisch.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*
        listRezepteName = "";
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteNachtisch.add(listRezepteNachtisch.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/


        return listRezepteNachtisch;
    }
}
