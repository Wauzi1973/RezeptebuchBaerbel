package com.example.rezeptebuchbaerbel;

import com.example.rezeptebuchbaerbel.Rezepte.Backen;
import com.example.rezeptebuchbaerbel.Rezepte.Brotaufstrich;
import com.example.rezeptebuchbaerbel.Rezepte.Dips;
import com.example.rezeptebuchbaerbel.Rezepte.Grillen;
import com.example.rezeptebuchbaerbel.Rezepte.Hauptgerichte;
import com.example.rezeptebuchbaerbel.Rezepte.Kuchen;
import com.example.rezeptebuchbaerbel.Rezepte.Nachtisch;
import com.example.rezeptebuchbaerbel.Rezepte.Salate;
import com.example.rezeptebuchbaerbel.Rezepte.Smoothie;
import com.example.rezeptebuchbaerbel.Rezepte.Suppen;
import com.example.rezeptebuchbaerbel.Rezepte.Vorspeise;
import java.util.ArrayList;

public class Rezepteingabe {

    ArrayList<RoomÜbersicht> listÜbersicht = new ArrayList<RoomÜbersicht>();

    ArrayList<RoomRezepte> listRezepteHauptgerichte = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteSalate = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteSuppen = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteBacken = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteKuchen = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteDips = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteGrillen = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteNachtisch = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteBrotaufstrich = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteVorspeise = new ArrayList<RoomRezepte>();
    ArrayList<RoomRezepte> listRezepteSmoothie =new ArrayList<RoomRezepte>();


    public ArrayList<RoomÜbersicht> RezepteingabevonHand(){

        listÜbersicht.clear();

        listRezepteHauptgerichte = new Hauptgerichte().Hauptgerichte();
        listRezepteSalate = new Salate().Salate();
        listRezepteSuppen = new Suppen().Suppen();
        listRezepteBacken = new Backen().Backen();
        listRezepteKuchen = new Kuchen().Kuchen();
        listRezepteDips = new Dips().Dips();
        listRezepteGrillen = new Grillen().Grillen();
        listRezepteNachtisch = new Nachtisch().Nachtisch();
        listRezepteBrotaufstrich = new Brotaufstrich().Brotaufstrich();
        listRezepteVorspeise = new Vorspeise().Vorspeise();
        listRezepteSmoothie = new Smoothie().Smoothie();

            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_hauptgerichte,"Hauptgerichte",listRezepteHauptgerichte));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_salate,"Salate",listRezepteSalate));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_suppe,"Suppen",listRezepteSuppen));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_backen,"Backen",listRezepteBacken));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_kuchen,"Kuchen",listRezepteKuchen));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_dips,"Dips",listRezepteDips));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_grillen,"Grillen",listRezepteGrillen));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_nachtisch,"Nachtisch",listRezepteNachtisch));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_brotaufstrich,"Brotaufstrich",listRezepteBrotaufstrich));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_vorspeise,"Vorspeise",listRezepteVorspeise));
            listÜbersicht.add(listÜbersicht.size(),new RoomÜbersicht(R.drawable.icon_smoothies,"Smoothie´s",listRezepteSmoothie));
return  listÜbersicht;
    }
}
