package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;

import java.util.ArrayList;

public class Smoothie {
    ArrayList<RoomRezepte> listRezepteSmoothie =new ArrayList<RoomRezepte>();
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;


    public ArrayList<RoomRezepte> Smoothie(){

        listRezepteZutaten = "50 g gefrorene Erdbeeren \n 100 g gefrorene Himbeeren \n 5 EL Joghurt (3,5 % Fett) \n 50 ml gekühlte Milch (3,5 % Fett) \n 50 ml Zitronensaft \n  gem. Zimt \n ";
        listRezepteAnweisungen = "1.) \n Gefrorene Erdbeeren antauen lassen und in Stücke schneiden. \n Himbeeren ebenfalls aus dem Gefrierfach holen und etwas antauen lassen. \n 2.) \n Erdbeerstücke und Himbeeren mit Joghurt, Milch und Zitronensaft \n in einen hohen Rührbecher geben und mit einem Pürierstab pürieren. \n Den Smoothie nach Belieben eine Zeit lang in den Kühlschrank stellen, falls er zu warm wurde. \n 3.) \n Den Smoothie in ein Glas füllen.  \n Nach Belieben mit einigen gefrorenen Himbeeren \n garnieren und mit 1 Prise Zimt bestäuben. \n";
        listRezepteSonstiges = "";
        listRezepteSmoothie.add(listRezepteSmoothie.size(),new RoomRezepte("Erdbeer Himbeer Smoothie",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteZutaten = "4 EL feine Haferflocken \n 2 EL geschrotete Leinsamen \n 2 EL Mandeln \n 200 ml Wasser \n 250 g Erdbeeren \n 100 g Himbeeren \n 2 reife Bananen \n 1 Zitrone \n ";
        listRezepteAnweisungen = "Haferflocken, Leinsamen und Mandeln mit warmem Wasser begießen und 5 Minuten einweichen lassen. \n Erdbeeren und Himbeeren waschen und putzen. Die Bananen schälen und in grobe Stücke schneiden. \n Alles mit 2 EL Zitronensaft in einen hohen Rührbecher geben und mit dem Pürierstab pürieren.  \n Eventuell noch etwas kaltes Wasser dazugießen, bis der Smoothie schön sämig ist. \n In zwei Flaschen füllen zur Verwendung kühl stellen. \n";
        listRezepteSonstiges = "";
        listRezepteSmoothie.add(listRezepteSmoothie.size(),new RoomRezepte("Erdbeer Smoothie",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteZutaten = "200 g Erdbeeren \n 150 g Himbeeren \n 100 g Heidelbeeren \n 1 Banane \n ";
        listRezepteAnweisungen = "Beeren waschen und abtropfen lassen. \n Banane schälen und grob würfeln. \n Alle Zutaten im Mixer oder mit einem Pürierstab fein pürieren. \n ";
        listRezepteSonstiges = "";
        listRezepteSmoothie.add(listRezepteSmoothie.size(),new RoomRezepte("Roter Smoothie",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteZutaten = "1 Mango \n 1 Banane \n 1 Orange \n 1 Stück Ingwer (1 cm) \n 100 ml Wasser \n ";
        listRezepteAnweisungen = "Das Fruchtfleisch der geschälten Mango rund um den \n großen mandel förmigen Kern abschneiden. Alle Früchte schälen und grob würfeln. \n Ingwer nach dem Schälen in Scheiben schneiden. \n Alle Zutaten mit 100 ml Wasser im Mixer oder mit einem Pürierstab fein pürieren. \n";
        listRezepteSonstiges = "";
        listRezepteSmoothie.add(listRezepteSmoothie.size(),new RoomRezepte("Gelber Smoothie",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteZutaten = "2 Bananen \n 600ml Milch \n 1 Päckchen Vanillezucker \n Bourbon-Vanille \n Vanilleeis \n ";
        listRezepteAnweisungen = "Alles zusammen geben und mixen. \n ";
        listRezepteSonstiges = "";
        listRezepteSmoothie.add(listRezepteSmoothie.size(),new RoomRezepte("Bananen Milchshake",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*

        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteSmoothie.add(listRezepteSmoothie.size(),new RoomRezepte("Leer",listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/
        return  listRezepteSmoothie;
    }
}
