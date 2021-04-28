package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.RoomRezepte;
import java.util.ArrayList;

public class Salate {

    ArrayList<RoomRezepte> listRezepteSalate = new ArrayList<RoomRezepte>();

    String listRezepteName;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;

    public ArrayList<RoomRezepte> Salate(){
        listRezepteName = "Frühlingssalat mit Ei";
        listRezepteZutaten = "1 Ei \n 10 Radieschen \n 100g Möhren \n 100g Kohlrabi \n 2 Frühlingszwiebeln \n 1 Romanasalatherz \n 50g gekochten Schinken \n 100g griechischer Joghurt (0,2%) \n 1 Spritzer Zitronensaft \n 1TL Senf \n 2EL gehackte Petersilie \n Salz, Pfeffer \n ";
        listRezepteAnweisungen = "1.) \n 1 Ei (M) hart kochen. 10 Radieschen und 100g Möhre in Scheibchen, \n 100g Kohlrabi in schmale Stifte und 2 Frühlingszwiebeln in Ringe schneiden. \n 1 Romanasalatherz in mundgerechte Stücke zupfen. Alle Zutaten mit \n 50g gekochtem Schinken in Streifen mischen. Ei achteln und darauf \n anrichten. 100g griechischen Joghurt mit 1 Spritzer Zitronensaft, 1TL Senf, \n 2EL gehackter Petersilie, etwas Salz und Pfeffer verrühren und über \n den Salat träufeln. \n ";
        listRezepteSonstiges = "Dazu 1 Scheibe Roggenknäcke knabbern. \n ";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Mailänder Salat";
        listRezepteZutaten = "500 g Nudeln   \n 2 dicke Scheiben Gekochter Schinken  \n 1 Stück Pikantje van Gouda  \n 1 Glas Klein Cornichons   \n 3 Stück Fleischtomaten  \n 2 Stück Rote Zwiebeln   \n 1 Bund Petersilie   \n 1 Glas Miracel Wip groß   \n 6 EL Olivenöl   \n 6 EL Weinessig   \n Salz, Pfeffer   \n 1 Prise Cayennepfeffer   \n";
        listRezepteAnweisungen = "Die Nudeln in reichlich Salzwasser in 6-8 Minuten knackig gar kochen, so das  \n sie noch Biß haben. Kalt abschrecken. Mit dem Öl zurück in den Topf geben und durchschwenken.  \n Schinken und Pikantje in Würfel schneiden. Die Cornichons in feine Scheiben schneiden.  \n Die Fleischtomaten mit kochendem Wasser überbrühen. Kalt abschrecken und die Haut abziehen.  \n Tomaten halbieren und die Kerne entfernen. Das Fruchtfleisch in Streifen schneiden.  \n Die Zwiebel schälen und in feine Ringe schneiden. Die Petersilie fein hacken.  \n Sahnejoghurt, Öl und Essig verrühren und mit Salz und Pfeffer abschmecken.  \n Die Salatzutaten darin wenden. In einer Schüssel anrichten und sofort servieren.  \n";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Fruchtiger Nudelsalat";
        listRezepteZutaten = "250 g Nudeln  \n Salz  \n 1 Dose Ananasscheiben  \n 1 Dose Mandarinen   \n 1 Apfel  \n 1 Bund Frühlingszwiebel  \n 250 ml Leichte Saltcreme  \n 1 TL Chiliflocken  \n";
        listRezepteAnweisungen = "1. ) \n Nudeln nach Packungsanweisung in kochendem Salzwasser fest garen.  \n Abgießen, abschrecken und gut abtropfen lassen. \n 2.) \n Ananas und Mandarinen abtropfen lassen. Die Ananasscheiben in Stücke schneiden.  \n Den Apfel waschen, Vierteln, entkernen und in Stücke schneiden. Frühlingszwiebel  \n putzen, waschen, abtropfen lassen und schräg in Ringe schneiden. \n 3.) \n Nudeln mit Ananas, Äpfeln, Frühlingszwiebeln, Mandarinen und der Salatcreme mischen.  \n Mit Chiliflocken abschmecken und anrichten. \n";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Nudelsalat";
        listRezepteZutaten = "250 g Nudeln Spirelli  \n 2 Stck Kleine Zucchini in Streifen  \n 250 g Cocktail Tomaten  \n 1 Stck Rote Zwiebel Scheiben  \n 1 Stck Knoblauchzehe  \n 125 ml Miracel Wip  \n";
        listRezepteAnweisungen = "1. \n Nudeln kochen. Zucchini, Tomaten, Zwiebeln und Knoblauchzehe vermengen.2 \n Nudeln und Miracel Wip unterheben. \n";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Tortellinisalat komplett";
        listRezepteZutaten = "500 g Tortellini  \n 2 Stck Zucchini (300g)  \n 300 g Gekochte Schinken  \n 300 g Tomaten  \n 2 Bund Lauchzwiebeln  \n 1 Glas Miracel Wipp  \n 1 Becher Saure Sahne  \n 1 L Milch  \n Basilikum (getrocknet)  \n 1 Stck Knoblauchzehen  \n";
        listRezepteAnweisungen = "1.) \n 500g Tortellini nach Angaben kochen ( und gut abkühlen lassen ) 300g Zucchini, 300g Tomaten,  \n 2 Bund Lauchzwiebeln in Streifen bzw, Stücke schneiden. \n 2.) \n Für die Soße \n Ca. 1/2 - 3/4 Glas Miracel Wipp \n 1 Becher saure Sahne, 3EL Milch, 1-2 EL Essig, Pfeffer, 1-2 TL Basilikum,  \n 1 zerkleinerte Knoblauchzehe zufügen. \n 3.) \n Rühren, fertig. \n";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte( listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Eier Chamgignon Salat";
        listRezepteZutaten = "6 Stck Eier  \n 100 g Frische Champignons  \n 100 g Zuckerschoten  \n 100 g Tiefgefrorene Erbsen  \n 1 Becher KNORRIGE Salatkrönung Joghurt-Dressing \"Würzige Gartenkräuter\"  \n 1 Kästchen Kresse  \n";
        listRezepteAnweisungen = "1.) \n Eier hart kochen, abkühlen lassen, pellen und vierteln. Champignons putzen, halbieren und in  \n dünne Scheiben schneiden. \n 2.) \n Zuckerschoten und Erbsen in einem Topf in ca. 1/4L Wasser 3 Minuten kochen. Gemüse in einem  \n Sieb abtropfen lassen und kalt abspülen. \n 3.) \n Becherinhalt Salatkrönung Joghuirt-Dressing mit der Hälfte der Eier, Champignons, Zuckerschoten  \n und Erbsen mischen. \n 4.) \n Kresse waschen, abtropfen lassen und über den Salat streuen. Salat mit den restlichen Eiern garnieren. \n";
        listRezepteSonstiges = "Zubereitungszeit ca. 20 Minuten \n";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Paprika Reis Salat mit Kräuterdressing";
        listRezepteZutaten = "250 g Langkorn-Reis  \n 0.5 Stück Grüne Paprikaschote  \n 0.5 Stück Gelbe Paprikaschote  \n 2 Stück Tomaten  \n 200 g Gekochter Schinken am Stück  \n 0.5 Bund Petersilie  \n 0.5 Stück Rote Chilischote  \n Salz, weißer Pfeffer  \n Zucker  \n 3 EL Weinessig  \n 6 EL Sonnenblumenöl  \n";
        listRezepteAnweisungen = "1.) \n Reis nach Packungsanweisung kochen,abschrecken, abtropfen und abkühlen lassen. \n 2.) \n Das Gemüse waschen. Die Paprikaschoten putzen und halbieren, das Kerngehäuse entfernen und die  \n Paprika würfeln. Die Tomaten achteln. Den Schinken in Würfel schneiden. Alles in einer  \n Schüssel mischen. Petersilie kalt abbrausen, abtropfen lassen und ganz fein hacken. Die Chilischote  \n entkernen und ganz fein schneiden. \n 3.) \n Salz, Pfeffer, Zucker, Petersilie und Chili mit Weinessig mischen, das Sonnenblumenöl zugeben,  \n gut verrühren, das Dressing unter den Salat ziehen und diesen in Salatschüssel servieren.  \n";
        listRezepteSonstiges = "Dazu schmeckt knuspriges Baguette.  \n Zubereitungszeit: 40 Minuten \n";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Spargel Nudelsalat mit Käse";
        listRezepteZutaten = "200 g Nudeln  \n 600 g Spargel  \n 1 Bund Lauchzwiebel  \n 250 ml Salatmayonaise  \n 100 g Käse  \n Salz  \n Zucker  \n";
        listRezepteAnweisungen = "Nudeln nach Packungsanweisung garen . Spargel in mundgerechte Stücke schneiden und kochen.  \n Salatmayonaise mit den Nudeln vermengen. Lauchzwiebel, Käsestreifen und Spargelstücke unterheben. \n";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Nachosalat";
        listRezepteZutaten = "500 g Hackfleisch  \n 200 g Nachos   \n 2 Dosen Kidneybohnen  \n 1 Becher Creme fraiche  \n 1 Eisbergsalat  \n 1 Flasche Salsasauce  \n 2 Ziebeln   \n 200 g Gauda  \n 1 Dose Mais   \n";
        listRezepteAnweisungen = "Die Zwiebeln schälen, klein schneiden und mit dem Hackfleisch zusammen anbraten.  \n Abkühlen lassen und in eine große Schüssel füllen.  \n 1 Dose Mais und 1 Dose Kidneybohnen in die Schüssel geben. Die Hälfte der Salsasauce über  \n die Masse geben. Dann noch einmal jeweils 1 Dose Mais, 1 Dose Kidneybohnen und den Rest der  \n Sauce in die Schüssel schichten. Den Eisbergsalat putzen, klein schneiden und auf den Salat geben.  \n Dann Crème fraîche auf den Eisbergsalat geben. Darauf dann den Käse verteilen. Nun 3/4 der Nachos  \n zerbröseln und auf dem Käse verteilen.  \n Mit den restlichen Nachos kann der Salat direkt vor dem Verzehr noch verziert werden.  \n";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));


/*
        listRezepteName = "";
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteSalate.add(listRezepteSalate.size(),new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/

        return listRezepteSalate;
    }
}
