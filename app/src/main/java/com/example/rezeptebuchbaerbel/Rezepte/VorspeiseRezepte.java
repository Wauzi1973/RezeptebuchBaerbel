package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.entity.RezepteArray;
import java.util.ArrayList;

public class VorspeiseRezepte {
    ArrayList<RezepteArray> listRezepteVorspeise = new ArrayList<RezepteArray>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RezepteArray> Vorspeise(){
        listRezepteName = "Aioli";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500.0 ml \n 300 ml Rapsöl   \n 100 ml Vollmilch  \n 100 ml Mayonaise  \n 1 El Zucker  \n 7 Knoblauchzehen  \n Pfeffer und Salz  \n Paprikapulver, edelsüß  \n";
        listRezepteAnweisungen = "Öl, Knoblauch und Gewürze pürieren, Milch zugeben und zu einer steifen Masse schlagen. \n Vorsichtig Mayonnaise unterheben und kalt stellen.  \n";
        listRezepteSonstiges = "";
        listRezepteVorspeise.add(listRezepteVorspeise.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


/*
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteVorspeise.add(listRezepteVorspeise.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


*/
        return listRezepteVorspeise;
    }
}
