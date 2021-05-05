package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.RoomRezepte;
import java.util.ArrayList;

public class Suppen {
    ArrayList<RoomRezepte> listRezepteSuppen = new ArrayList<RoomRezepte>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;


    public ArrayList<RoomRezepte> Suppen(){
        listRezepteName = "Bohnensuppe mit Mettwurst";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "4 Mettwürste  \n 1 Dose Weiße Bohnen   \n 1 Dose Kidney Bohnen  \n Tomatenmark  \n Klare Brühe  \n Cayennepfeffer  \n Majoran, Paprika  \n Salz, Pfeffer  \n Maggi  \n";
        listRezepteAnweisungen = "Mettwürste klein schneiden und in etwas Fett anbraten.  \n Nach dem Anbraten etwas Majoran dazugeben und mit anbraten, dann mit etwas Brühe ablöschen.  \n Bohnen dazugeben. Mit Majoran, Cheyennepfeffer und  Paprika würzen.  \n Tomatenmark und Maggie dazugeben.  \n Etwa 15 Minuten köcheln lassen.  \n";
        listRezepteSonstiges = "";
        listRezepteSuppen.add(listRezepteSuppen.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));



/*
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteSuppen.add(listRezepteSuppen.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/

return listRezepteSuppen;
    }
}
