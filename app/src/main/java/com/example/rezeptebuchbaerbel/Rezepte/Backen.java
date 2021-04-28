package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;
import java.util.ArrayList;

public class Backen {
    ArrayList<RoomRezepte> listRezepteBacken = new ArrayList<RoomRezepte>();

    String listRezepteName;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;


    public ArrayList<RoomRezepte> Backen(){
        listRezepteName = "Orangenplätzchen";
        listRezepteZutaten = "250 g Mehl  \n 100 g Zucker  \n 180 g Butter  \n 100 g Marzipanrohmasse  \n 150 g Puderzucker  \n 2 Pck. geriebene Orangenschale  \n 1 prise Salz  \n 2 Pck. Orangenzucker  \n 1 Ei  \n";
        listRezepteAnweisungen = "Aus Mehl, Butter, Zucker, Ei, Orangenschale und Marzipanrohmasse einen Mürbeteig herstellen. \n Den Teig auf etwas Mehl ausrollen und gewünschte Formen ausstechen.  \n Bei 170° - 10Min auf Backpapier backen.  \n Die abgekühlten Plätzchen mit Zucker/Orangenguss bestreichen. \n";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Waffeln";
        listRezepteZutaten = "375 g Mehl  \n 125 g Zucker  \n 125 g Butter   \n 0.25 Päckchen Backpulver   \n 1.5 Päckchen Vanillezucker  \n 0.25 L Milch   \n 3 Stück Eier  \n";
        listRezepteAnweisungen = "Alles vermanschen. \n Backen. \n Und futtern.  \n";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Pfannkuchen";
        listRezepteZutaten = "225 g Mehl  \n 1 Päckchen Vanille Soßenpulver  \n 2 TL Backpulver   \n 2 Stück 2-3 Eigelb  \n Etwas Salz und Zucker  \n 0.5 L Milch  \n";
        listRezepteAnweisungen = "Eiweiß steif schlagen und unterheben. \n";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*
        listRezepteName = "";
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

 */


        return listRezepteBacken;
    }
}
