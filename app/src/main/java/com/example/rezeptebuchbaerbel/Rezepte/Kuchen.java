package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;
import java.util.ArrayList;

public class Kuchen {
    ArrayList<RoomRezepte> listRezepteKuchen = new ArrayList<RoomRezepte>();

    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Kuchen(){
        listRezepteZutaten = "300 ml Milch  \n 1 Päckchen Pudding Vanille Geschmack  \n 500 ml Sahneersatz z. Schlagen (z.B. Rama Cremefine)  \n 3 Päckchen Vanillezucker  \n 1 kg Erdbeeren  \n 1 Stck Wiener Tortenboden (28cm, 1x waagerecht halbiert)   \n 100 g Erdbeerkonfitüre  \n 3 EL 2-3 geh. Pistazien  \n";
        listRezepteAnweisungen = "1.) \n Milch sprudelnd aufkochen, den Topf von der Kochstelle nehmen, Puddingpulver unter ständigem Rühren  \n zufügen und 1 Minuten weiterführen. Pudding abdecken, damit sich keine Haut bildet. \n 2.) \n Sahneersatz mit Vanillezucker steifschlagen, kalt stellen. Erdbeeren putzen. 2/3 der Früchte  \n Vierteln bzw. achteln, die anderen in Scheiben schneiden. Die untere Hälfte des Tortenbodens mit der  \n Erdbeerkonfitüre bestreichen. \n 3.) \n Pudding löffelweise unter die Sahne ziehen. Erdbeerstücke unter 1/3 der Creme heben, auf dem  \n unteren Tortenboden auf der Konfitüre verteilen, und mit der oberen Tortenhälfte abdecken.  \n Mit der restlichen Creme die rundherum bestreichen. \n 4.) \n Tortenoberfläche mit Erdbeerscheiben fächerartig belegen, den Rand der Torte mit Pistazien  \n bestreuen. Die Torte bis zum servieren 2 - 3 Stunden kalt stellen. \n";
        listRezepteSonstiges = "";
        listRezepteKuchen.add(listRezepteKuchen.size(),new RoomRezepte("Vanille Erdbeer Torte",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteZutaten = "1 Päckchen Puddingpulver \"Schokogeschmack\" (für 500ml Milch;zum kochen;Dr. Oetker Gala)  \n 80 g Zucker  \n 0.5 L Milch  \n 250 g Butter  \n 1 Stck Fertiger Biskuitboden  \n 3 EL Aprikosen Konfitüre  \n 50 g Vollmilch-Schokolocken  \n 1 TL Kakaopulver  \n Frischhaltefolie  \n";
        listRezepteAnweisungen = "1.) \n Puddingpulver und 80g Zucker mischen. Mit 100ml Milch glatt rühren. 400ml Milch aufkochen,  \n vom Herd ziehen. Angerührtes Puddingpulver einrühren, unter Rühren 1 Minute köcheln. In eine  \n Schüssel füllen, mit Folie abdecken, bei Zimmertemperatur auskühlen lassen. Butter ebenfalls  \n bei Zimmertemperatur lagern. \n 2.) \n Biskuit zweimal waagerecht durchschneiden. Konfitüre auf dem unteren Boden verstreichen.  \n Weiche Butter 8-10 Minuten cremig-weiß aufschlagen. Pudding durchrühren, esslöffelweise unter  \n die Butter rühren. 1/4 der Buttercreme auf den Boden geben. Zweiten Boden darauflegen, leicht  \n andrücken. Etwas mehr als 1/4 der Creme darauf verstreichen. Dritten Boden darauflegen. Torte  \n mit einem Teil der restlichen Creme einstreichen. Torte mit Cremetuffs und Schokolocken verzieren.  \n";
        listRezepteSonstiges = "Ca. 2 Stunden kalt stellen. Vor dem servieren mit Kakao bestäuben. \n";
        listRezepteKuchen.add(listRezepteKuchen.size(),new RoomRezepte("Edle Buttercremetorte",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*

        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteKuchen.add(listRezepteKuchen.size(),new RoomRezepte("Name",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/
        return listRezepteKuchen;
    }
}
