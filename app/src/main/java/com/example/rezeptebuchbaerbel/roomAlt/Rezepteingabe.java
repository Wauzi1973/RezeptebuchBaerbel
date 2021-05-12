package com.example.rezeptebuchbaerbel.roomAlt;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.Rezepte.Backen;
import com.example.rezeptebuchbaerbel.Rezepte.Brot;
import com.example.rezeptebuchbaerbel.Rezepte.Brotaufstrich;
import com.example.rezeptebuchbaerbel.Rezepte.Cocktail;
import com.example.rezeptebuchbaerbel.Rezepte.CocktailRezepte;
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

    ArrayList<RoomUebersicht> listUebersicht = new ArrayList<>();

    ArrayList<RoomRezepte> listRezepteHauptgerichte = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteSalate = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteSuppen = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteBacken = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteKuchen = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteDips = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteGrillen = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteNachtisch = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteBrotaufstrich = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteVorspeise = new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteSmoothie =new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteCocktail =new ArrayList<>();
    ArrayList<RoomRezepte> listRezepteBrot =new ArrayList<>();


    public ArrayList<RoomUebersicht> RezepteingabevonHand(){

        listUebersicht.clear();

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
        listRezepteCocktail = new Cocktail().Cocktail();
        listRezepteBrot = new Brot().Brot();

        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_hauptgerichte,"Hauptgerichte",listRezepteHauptgerichte));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_salate,"Salate",listRezepteSalate));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_suppe,"Suppen",listRezepteSuppen));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_backen,"Backen",listRezepteBacken));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_kuchen,"Kuchen",listRezepteKuchen));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_dips,"Dips",listRezepteDips));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_grillen,"Grillen",listRezepteGrillen));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_nachtisch,"Nachtisch",listRezepteNachtisch));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_brotaufstrich,"Brotaufstrich",listRezepteBrotaufstrich));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_vorspeise,"Vorspeise",listRezepteVorspeise));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_smoothies,"Smoothie´s",listRezepteSmoothie));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_cocktails,"Cocktail´s",listRezepteCocktail));
        listUebersicht.add(listUebersicht.size(),new RoomUebersicht(R.drawable.icon_backen,"Brot",listRezepteBrot));

return  listUebersicht;
    }
}
