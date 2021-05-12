package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.RoomRezepte;

import java.util.ArrayList;

public class Brot {
    ArrayList<RoomRezepte> listRezepteBacken = new ArrayList<RoomRezepte>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;


    public ArrayList<RoomRezepte> Brot(){
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


/*
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

 */


        return listRezepteBacken;
    }
}
