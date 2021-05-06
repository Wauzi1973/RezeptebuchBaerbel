package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.RoomRezepte;

import java.util.ArrayList;

public class Cocktail {
    ArrayList<RoomRezepte> listRezepteCocktail = new ArrayList<RoomRezepte>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Cocktail(){
        listRezepteName = "Sex On The Beach";
        listBild = R.drawable.icon_cocktails;
        listRezepteZutaten = "!!! Eis !!!\n2cl Grenadine Sirup\n2cl Zitronensaft\n4cl Craneberrysaft\n10cl Ananassaft\n2cl Pfirsichlikör\n4cl Wodka";
        listRezepteAnweisungen = "Als erstes füllt man etwas Eis in den Shaker.\nDanach werden alle Zutaten   > außer der Grenadine-Sirup <   in den Shaker gegeben und kräftig geshaket.\nDer gesamte Inhalt aus dem Shaker wird in ein Cocktailglas gegeben und mit Eis aufgefüllt.\n" +
                "Um einen schönen Farbverlauf zu erhalten wird jetzt der 'geschungene Rührlöffel' ins Glas gesteckt und die angegebene Menge an Grenadine-Sirup langsam am Löffelstil herab ins Glas laufen gelassen.\nZum Schluss kann man zum servieren noch eine Scheibe Wassermelone an den Rand vom Cocktailglas stecken.";
        listRezepteSonstiges = "";
        listRezepteCocktail.add(listRezepteCocktail.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Solero";
        listBild = R.drawable.icon_cocktails;
        listRezepteZutaten = "!!! Eis !!!\n1cl Zitronensaft\n2cl Vanille-Sirup\n4cl Maracuja-Saft\n4cl Orangen-Saft\n4cl Wodka";
        listRezepteAnweisungen = "Als erstes füllt man etwas Eis in den Shaker.\nDanach werden alle Zutaten in den Shaker gegeben und kräftig geshaket.\nDer gesamte Inhalt aus dem Shaker wird in ein Cocktailglas gegeben und mit Eis aufgefüllt.\n" +
                "\nZum Schluss kann man zum servieren noch eine Scheibe Wassermelone oder Orange an den Rand vom Cocktailglas stecken.";
        listRezepteSonstiges = "";
        listRezepteCocktail.add(listRezepteCocktail.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Swimming Pool";
        listBild = R.drawable.icon_cocktails;
        listRezepteZutaten = "!!! Eis !!!\n10cl Ananassaft\n6cl Sahne\n2cl Kokosnusscreme\n5cl Curacao Blue\n2cl Wodka\n2cl Weißer Rum";
        listRezepteAnweisungen = "Als erstes füllt man etwas Eis in den Shaker.\nDanach werden alle Zutaten   >> außer der Curacao Blue <<   in den Shaker gegeben und kräftig geshaket.\nDer gesamte Inhalt aus dem Shaker wird in ein Cocktailglas gegeben und mit Eis aufgefüllt.\n" +
                "Um einen schönen Farbverlauf zu erhalten wird jetzt der 'geschungene Rührlöffel' ins Glas gesteckt und die angegebene Menge an Curacao Blue langsam am Löffelstil herab ins Glas laufen gelassen.\nZum Schluss kann man zum servieren noch eine Scheibe Wassermelone an den Rand vom Cocktailglas stecken.";
        listRezepteSonstiges = "";
        listRezepteCocktail.add(listRezepteCocktail.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Solero Alkoholfrei";
        listBild = R.drawable.icon_cocktails;
        listRezepteZutaten = "!!! Eis !!!\n1cl Zitronensaft\n2cl Vanille-Sirup\n4cl Maracuja-Saft\n4cl Orangen-Saft";
        listRezepteAnweisungen = "Als erstes füllt man etwas Eis in den Shaker.\nDanach werden alle Zutaten in den Shaker gegeben und kräftig geshaket.\nDer gesamte Inhalt aus dem Shaker wird in ein Cocktailglas gegeben und mit Eis aufgefüllt.\n" +
                "\nZum Schluss kann man zum servieren noch eine Scheibe Wassermelone oder Orange an den Rand vom Cocktailglas stecken.";
        listRezepteSonstiges = "";
        listRezepteCocktail.add(listRezepteCocktail.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*
        listRezepteName = "";
        listBild = R.drawable.icon_cocktails;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteCocktail.add(listRezepteCocktail.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


*/
        return listRezepteCocktail;
    }
}
