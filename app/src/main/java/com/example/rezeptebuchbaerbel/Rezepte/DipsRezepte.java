package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.entity.RezepteArray;
import java.util.ArrayList;

public class DipsRezepte {
    ArrayList<RezepteArray> listRezepteDips = new ArrayList<RezepteArray>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RezepteArray> Dips(){
        listRezepteName = "Whiskybutter";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "250 g Butter \n 1 Stck Zwiebel rot \n 1 Stck Knoblauchzehe \n 1 EL Honig \n 2 EL Whisky \n Pfeffer \n Meersalz \n";
        listRezepteAnweisungen = "Die handwarme Butter in eine Schüssel geben. Honig und Whisky zu der Butter geben.  \n Zwiebeln und Knoblauch ganz fein hacken und ebenfalls hinzugeben.  \n Alles gründlich mit einer Gabel durchmischen. Nach Geschmack mit Pfeffer und  \n Meersalz abschmecken. In einer kleinen Dose im Kühlschrank kaltstellen.  \n";
        listRezepteSonstiges = "";
        listRezepteDips.add(listRezepteDips.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Cashewkerne Dip";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 halbe Rote Paprika\n1 Dose Cashew-Kerne\n300gr. Frischkäse";
        listRezepteAnweisungen = "Die Cashew-Kerne und die Paprika zerkleinern (nacheinander im TurboChef), alle Zutaten zusammen vermengen.";
        listRezepteSonstiges = "";
        listRezepteDips.add(listRezepteDips.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Thunfisch Dip";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 lila Zwiebel\n1 Dose Thunfisch\n300gr. Frischkäse\nPfeffer und Salz";
        listRezepteAnweisungen = "Die Zwiebel zerkleinern (im TurboChef), alle Zutaten zusammen vermengen und je nach Geschmack mit Salz und Pfeffer etwas würzen.";
        listRezepteSonstiges = "";
        listRezepteDips.add(listRezepteDips.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteDips.add(listRezepteDips.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/

        return listRezepteDips;
    }
}
