package com.example.rezeptebuchbaerbel.Rezepte;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.entity.RezepteArray;
import java.util.ArrayList;

public class HauptgerichteRezepte {
    ArrayList<RezepteArray> listRezepteHauptgerichte = new ArrayList<RezepteArray>();

    String listRezepteName;
    int listBild;
    String listRezepteZutaten;
    String listRezepteAnweisungen;
    String listRezepteSonstiges;


    public ArrayList<RezepteArray> Hauptgerichte(){

        listRezepteHauptgerichte.clear();

        listRezepteName = "Saftiger Schweinefilet-Kartoffel-Auflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "800g Kartoffeln \n 3 Zwiebeln \n 60g Butter \n 3 EL Mehl \n 1 L Gemüsebrühe \n 250g MILRAM frische Schlagsahne \n 200g MILRAM Frühlingsquark 7-Kräuter \n Salz, Pfeffer \n 800g Schweinefilet \n 2 EL Öl \n 300g Kischtomaten \n 150g geriebenen Käse \n 1 Bund Schnittlauch \n ";
        listRezepteAnweisungen = "1.) \n Kartoffeln waschen und in Wasser ca. 20 Minuten kochen.  \n Inzwischen Zwiebeln schälen und würfeln. \n Butter in einem Topf erhitzen.  \n Zwiebeln darin andünsten. \n 2.) \n Mehl zufühen und anschwitzen. Mit Brühe und Sahne ablöschen,  \n unter Rühren aufkochen und ca. 3 Minuten köcheln lassen. \n MILRAM Frühlingquark einrühren. \n Soße mit Salz und Pfeffer würzen. \n 3.) \n Kartoffeln abgießen, abschrecken, abkühlen lassen, pellen und in \n Scheiben schneiden. Fleisch trocken tupfen und in 8 Medaillons \n schneiden. Öl in einer Pfanne erhitzen. Medaillons darin unter Wenden \n ca. 5 Minuten anbraten. \n Mit Salz und Pfeffer würzen. \n 4.) \n Tomaten waschen und halbieren. Eine Auflaufform (ca. 20x30cm) fetten. \n Kartoffeln und Tomaten in die Form geben. Medaillons in die Mitte \n setzen. Soße darüber verteilen. \n Käse drüber streuen. \n 5.) \n Im vorgeheizten Backofen (E-Herd: 200°C / Umluft: 175°C) ca. 15 Minuten \n backen. Dann im heißen Ofen auf Grillstufe 3 ca. 5 Minuten überbacken. \n 6.) \n Schnittlauch waschen, trocken schütteln und in Röllchen schneiden. \n Schweinefilet-Kartoffel-Auflauf aus dem Ofen nehmen, \n mit Schnittlauchröllchen bestreuen und anrichten. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Bechamel Kartoffeln";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 kg Festkochende Kartoffeln \n Salz \n 2 Stück Zwiebeln \n 80 g Schinkenspeck gewürfelt \n 1 EL Keimöl \n 600 ml Kaltes Wasser \n 1 Beutel Fix für Hackfleisch Käse-Suppe mit Lauch \n 200 g Sahne Schmelzkäse \n Frisch gemahlener weißer Pfeffer \n 2 EL Schnittlauchröllchen";
        listRezepteAnweisungen = "1.) \n Kartoffeln mit Schale in Salzwasser etwa 20 Minuten garen, kalt abspülen, \n pellen und in Scheiben schneiden. \n 2.) \n Zwiebeln abziehen, würfeln und mit gewürfelten Schinkenspeck im heißen Keimöl dünsten. \n Kaltes Wasser zugießen, Beutelinhalt Fix für Hackfleisch Käse Suppe einrühren, \n unter Rühren aufkochen, Sahne Schmelzkäse zugeben und darin schmelzen lassen. \n 3.) \n Kartoffelscheiben in die Sauce geben, darin heiß werden lassen, \n mit Pfeffer abschmecken und mit Schnittlauchröllchen unterrühren.";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kasseler-Käsekartoffeln";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "800g kleine Kartoffeln \n 20g Butter oder Margarine \n 20g Mehl \n 0,5L fettarme Milch \n 1TL Gemüsebrühe (instant) \n Salz \n Pfeffer \n 400g ausgelöstes Kasseler Kotelett \n 1TL Öl \n 75g geriebener fettarmer Käse \n Schnittlauch zum Garnieren \n Fett für die Form \n ";
        listRezepteAnweisungen = "1.) \n Kartoffeln waschen und in kochendem Wasser ca. 20min garen. \n Fett in einem Topf schmelzen. Mehl darin anschwitzen. Milch unter \n Rühren zugießen. Brühe einrühren, aufkochen, bei mittlerer Hitze \n ca. 5min köcheln lassen. Mit Salz und Pfeffer abschmecken. \n 2.) \n Kasseler waschen, trocken tupfen und in Würfel schneiden. Öl in einer \n erhitzen. Kasseler kurz anbraten. Kartoffeln abgießen, abschrecken \n und pellen. \n 3.) \n Kartoffeln, Kasseler und Soße in eine gefettete, ofenfeste Form füllen. \n Käse darüberstreuen ind im vorgeheitzen Backofen (E-Herd:200°C / \n Umluft: 175°C ) ca. 10min überbacken. Herausnehmen, \n mit Schnittlauch garnieren und servieren. \n ";
        listRezepteSonstiges = "Zutaten für 4 Personen \n Zubereitungszeit: ca. 40min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Sonntagspfanne \"Jäger Art\"";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "600 g Kartoffeln  \n 200 g Kleine Champignons  \n 2 Stck Lauchzwiebeln  \n 3 Stck Schweinenackensteaks (à ca. 200g)  \n 2 EL Öl  \n Salz, schwarzer Pfeffer  \n Edelsüß-Paprika";
        listRezepteAnweisungen = "1 Tüte Zwiebelsuppe \"Feinschmecker Art\" (zum Kochen; für 3/4 Flüssigkeit;3Portionen))  \n 200 g Schlagsahne  \n Evtl. Grober Pfeffer zum Bestreuen  \n 1. \n Kartoffeln waschen, evtl. Schälen und in dicke Scheiben schneiden. Champignons putzen und  \n evtl. Waschen. Lauchzwiebeln putzen, waschen, schräg in Scheiben schneiden. Fleisch waschen,  \n trocken tupfen und in große Stücke schneiden. \n 2. \n 2EL Öl in einer großen Pfanne erhitzen. Fleisch darin von beiden Seiten anbraten. Mit Salz,  \n Pfeffer und Paprika würzen und herausnehmen. 2EL Öl im heißen Bratfett erhitzen. Kartoffeln  \n darin ca. 10 Minuten braten. Pilze und Lauchzwiebeln, bis auf etwas zum Garnieren, nach der  \n Hälfte der Bratzeit zugeben. \n 3. \n Suppenpulver darüberstreuen. Mit Sahne und 1/4L (250ml) ablöschen und aufkochen lassen. Fleisch  \n zugeben und bei schwacher Hitze ca. 10 Minuten zugedeckt garen. Rest Lauchzwiebeln darüber  \n verteilen. Mit grobem Pfeffer bestreuen.";
        listRezepteSonstiges = "Zubereitungszeit ca. 45 Minuten";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Feine Kartoffelsuppe";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "600 g Kartoffeln  \n 1 L Klare Brühe  \n 2 Stck Möhren  \n 1 Stange Lauch  \n 1 Bund Thymian  \n 200 g Altländer Mettwurst im Naturdarm (Cervelatwurst)  \n 1 EL Butter  \n 200 g Schlagsahne  \n Salz, frisch gemahlenen Pfeffer  \n Gemahlene Muskatnuss  \n";
        listRezepteAnweisungen = "1.) \n Die Kartoffeln schälen, waschen und in der kochenden Brühe je nach Größe in ca. 20-25 Minuten  \n weich kochen. \n 2.) \n Die Möhren schrappen, in Streifen zerteilen. Den Lauch von welkem Grün und vom Wurzelansatz  \n befreien, waschen und in Ringe oder feine Streifen schneiden. \n 3.) \n Den Thymian unter fließenden kalten Wasser abbrausen, trocken schwenken, die Blättchen abzupfen.  \n Die Wurst enthäuten, erst in Scheiben, dann in Rauten schneiden. \n 4.) \n Die Butter erhitzen, das vorbereitete Gemüse darin andünsten. \n 5.) \n Die gegarten Kartoffeln in der Küchenmaschine oder mit dem Handmixstab mit der Brühe pürieren,  \n dann die Sahne unterrühren. Mit Salz, Pfeffer und Muskatnuss würzen. \n 6.) \n Die Kartoffelsuppe mit dem gedünsteten Gemüse verrühren, in tiefen Tellern anrichten. Mit den  \n Wurstrauten bestreut servieren. \n";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kartoffelpüree Hack Auflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "750 g Mehlig kochende Kartoffeln  \n Salz  \n 1 Stck Zwiebel  \n 2 Stck Knoblauchzehen  \n 0.5 Stck Je rote, gelbe, grüne Paprika  \n 3 EL Olivenöl  \n 500 g  Gemischtes Hack  \n 2 TL Tomatenmark  \n 100 ml Gemüsebrühe  \n Pfeffer  \n 200 ml Milch  \n 20 g Butter  \n geriebene Muskatnuss  \n 50 g Oliven ohne Kern  \n 1 Kugel (125g) Mozzarella  \n 3 Zweige Oregano  \n Fett für die Form  \n";
        listRezepteAnweisungen = "1.) \n Kartoffeln kochen. Zwiebel, Knoblauch und Paprika schneiden. 2 EL Öl erhitzen.  \n Zwiebeln und Knoblauch darin andünsten. Hack und Paprika zufügen und unter Wenden braten.  \n Tomatenmark unterrühren, andünsten und Brühe angießen. Alles 5 Minuten einkochen lassen.  \n Mit Salz und Pfeffer würzen. \n 2.) \n Milch und Butter etwas erwärmen. Kräftig mit Salz, Pfeffer und Muskat würzen.  \n Kartoffeln dazu und stampfen. Oliven klein schneiden und unterrühren. Auflaufform fetten.  \n Hälfte des Kartoffelpürees einschichten. Hackmischung darauf verteilen, restliches  \n Kartoffelpüree daraufgehen und glatt streichen. \n 3.) \n Mozzarella in Scheiben schneiden. Auflauf damit belegen. Oreganoblättchen grob hacken und  \n mit 1 EL Öl verrühren. Mozzarella damit bestreichen. Im Backofen ca. 20 Minuten backen.";
        listRezepteSonstiges = "E-Herd: 200°C ; \n Umluft: 175°C \n Zubereitungszeit ca. 1 Stunde";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Gratinierte Käsekartoffeln mit Kasseler";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "750 g  Kleine neue Kartoffeln  \n 2 EL Butter / Margarine  \n 2 EL Mehl  \n 0.5 L Milch  \n 1 TL Gemüsebrühe  \n Salz, weißer Pfeffer  \n 250 g Ausgelöstes Kasseler  \n 1 TL Öl  \n 75 g Gouda (Stück)  \n Evtl. Schnittlauch zum Garnieren  \n Fett für die Form  \n";
        listRezepteAnweisungen = "1.) \n Kartoffeln waschen, in kochendem Wasser ca. 20 Minuten garen. Fett in einem Topf erhitzen.  \n Mehl darin anschwitzen. Milch unter Rühren zugießen, aufkochen lassen. Brühe einrühren und  \n ca. 5 Minuten köcheln lassen. Mit Salz und Pfeffer würzen. \n 2.) \n Kasseler waschen, trocken tupfen und in Würfel schneiden. Öl in einer Pfanne erhitzen.  \n Kasseler darin anbraten. Kartoffeln abgießen, abschrecken und evtl. Pellen. Kartoffeln, Kasseler  \n und Soße in eine gefettete Auflaufform füllen. Käse reiben und darüberstiegen. Im heißen  \n Backofen ca. 10 Minuten überbacken. Mit Schnittlauch garnieren. \n";
        listRezepteSonstiges = "Umluft: 175°C \n Zubereitungszeit ca. 40 Minuten \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Bratkartoffel Auflauf mit Kasseler";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 kg Festkochende Kartoffeln  \n 3 Stck Zwiebeln  \n 40 g Butterschmalz  \n Salz, Pfeffer  \n 500 g Ausgelöstes Kasselerkotlett  \n EL 2-3 EL Öl  \n 250 g Crème fraîche  \n 1 TL Getrockneter Majoran  \n 80 g Geriebener Gouda-Käse  \n 2 EL Schnittlauchröllchen zum Bestreuen  \n";
        listRezepteAnweisungen = "1.) \n Kartoffeln waschen und zugedeckt in reichlich kochendem Wasser 20 bis 25 Minuten garen.  \n Kartoffeln abgießen, kalt abschrecken, pellen und auskühlen lassen. Zwiebeln schölen und würfeln.  \n Kartoffeln in Scheiben schneiden. Butterschmalz in einer großen Pfanne erhitzen, die Kartoffeln  \n darin portionsweise unter Wenden goldbraun braten. Zum Schluss 2/3 der Zwiebeln mitbraten.  \n Bratkartoffeln mit Salz und Pfeffer würzen, herausnehmen. \n 2.) \n Kasseler in Würfel schneiden. Öl in einer Pfanne erhitzen, Kasseler darin anbraten. Zum Schluss  \n die restliche Zwiebeln mitbraten. 150ml Wasser und Crème fraîche unterrühren und mit Pfeffer und  \n getrocknetem Majoran würzen und aufkochen. 50g Käse unterrühren. \n 3.) \n Die Hälfte der Kartoffeln in eine Auflaufform geben und die Hälfte der Kasselersoße darauf verteilen.  \n Restliche Kartoffeln und Kasselersoße daraufschichten und mit 30g Käse bestreuen. Im vorgeheizten  \n Backofen ca. 25 Minuten backen. Mit Schnittlauch bestreut servieren.";
        listRezepteSonstiges = "E-Herd: 200°C ; \n Umluft: 175°C \n Zubereitungszeit ca. 1 3/4 Stunden.";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Filet Töpfchen";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Stck Rote Zwiebeln  \n 400 g Schweinefilet  \n 200 g TK Mischpilze  \n 250 ml Wasser  \n 100 ml Süße Sahne  \n 1 EL Senf  \n 0.5 Bund Schnittlauch  \n 1 Pck. Maggi Putentopf mit Frischkäse  \n";
        listRezepteAnweisungen = "1.) \n 2 rote Zwiebeln schälen, halbieren, in Scheiben schneiden und in heißem Öl andünsten. \n 2.) \n 400g Schweinefilet in Streifen schneiden und in heißem Öl anbraten. Herausnehmen und warm stellen. \n 3.) \n Zwiebeln in heißem Öl andünsten, 200 TK Mischpilze zugeben und mitbraten. 250ml Wasser  \n zugießen, Beutelinhalt einrühren und zum Kochen bringen. 100ml Sahne und 1EL Senf einrühren. \n 4.) \n Schweinefilet zugeben und darin heiß werden lassen. 1/2 Bund Schnittlauch waschen, klein  \n schneiden und damit bestreut servieren. Servieren sie dazu Bandnudeln. \n";
        listRezepteSonstiges = "Tipp: 50ml Wasser können durch Weißwein ersetzt werden.";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schweinesteak auf Toast";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "400 g Schweinefleisch  \n 100 g Champignons  \n 2 Stck Frühlingszwiebeln  \n 2 EL Butterschmalz  \n Salz, Pfeffer  \n 3 Zweige Petersilie  \n 1 Zehe Knoblauch  \n 125 g Mozzarella  \n 4 Scheiben Toastbrot  \n Schnittlauchröllchen  \n";
        listRezepteAnweisungen = "1.) \n Fleisch waschen, trocken tupfen, in 2cm breite Scheiben schneiden. Champignons putzen, in Scheiben  \n schneiden. Frühlingszwiebeln putzen, in Ringe schneiden. \n 2.) \n Butterschmalz erhitzen. Fleisch mit Salz und Pfeffer würzen, im Butterschmalz ca. 4 Minuten  \n goldbraun braten und herausnehmen. Champignons und Frühlingszwiebeln im Bratfett ca. 4 Minuten andünsten.  \n Mit Salz und Pfeffer würzen. Petersilie waschen, trocken schütteln und hacken. Knoblauch abziehen und  \n ebenfalls hacken. Beides mit in die Pfanne geben und kurz mitbraten. \n 3.) \n Mozzarella in Scheiben schneiden. Das Toastbrot rösten. Pilze und Fleisch darauf anrichten.  \n Mit Käse belegen. Im heißen Backofen unter dem vorgeheizten Grill ca. 2 Minuten überbacken,  \n bis der Käse zerlaufen ist. Nach Wunsch mit Schnittlauchröllchen bestreuen und sofort servieren. \n";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schweinemedaillions in Frischkäse Rahm";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "3 Stck Frühlingszwiebeln  \n 200 g Karotten  \n 400 g Schweinefilet  \n 500 ml Wasser  \n 2 Beutel Maggi Geschnetzeltes \"Züricher Art\"  \n 75 g Kräuter Frischkäse  \n 2 EL Gerösteten Sonnenblumenkernen  \n";
        listRezepteAnweisungen = "1.) \n 3 Frühlingszwiebeln putzen, waschen und in Ringe schneiden. 200g Karotten putzen und raspeln. \n 2.) \n 400g Schweinefilet ca. 2cm dicke Scheiben schneiden und in heißem Öl anbraten und herausnehmen.  \n Frühlingszwiebel und Karotten in dem Bratfett anbraten. \n 3.) \n 500ml Wasser zugießen. Inhalt von 2 Beuteln einrühren, zum Kochen bringen, Fleisch wieder zugeben  \n und bei geringer Wärmezufuhr ca. 5 Minuten zugedeckt ziehen lassen. \n 75g Kräuter Frischkäse einrühren. Mit 2EL gerösteten Sonmnenblumenkernen bestreut servieren. \n";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Minutensteak auf Bauernbrot mit Spiegelei";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Stck Mittelgroße Tomaten  \n 3 EL Butter  \n 4 Scheiben Krustenbrot  \n 6 TL Mittelscharfer Senf  \n 8 Stck Minutensteaks vom Schwein (à ca. 75g)  \n 3 EL Öl  \n Salz, weißer Pfeffer  \n 4 Stck Eier  \n Etwas Schnittlauch  \n 200 g Kräuterquark  \n Evtl. Grober Pfeffer zum Bestreuen  \n";
        listRezepteAnweisungen = "1.) \n Die Tomaten waschen und in Scheiben schneiden. Butter in einer großen Pfanne erhitzen.  \n Brot darin unter Wenden braten, herausnehmen. Je mit 1-2 TL Senf bestreichen. Mit Tomaten belegen.  \n Steaks waschen und trocken tupfen. \n 2.) \n 2EL Öl portionsweise in einer großen beschichteten Pfanne erhitzen. Steaks darin pro  \n Seite 1-2 Minuten braten. Mit Salz und Pfeffer würzen. 1EL Öl in einer großen beschichteten  \n Pfanne erhitzen. 4 Eier darin zu Spiegeleier braten. \n 3.) \n Je 2 Steaks und 1 Spiegelei auf die Brotscheibe legen. Eier mit Salz und grobem Pfeffer würzen.  \n Schnittlauch waschen und in Röllchen schneiden. Mit Kräuterquark mischen, dazureichen. \n";
        listRezepteSonstiges = "Tipp: Statt mit Senf können Sie die Brote auch mit scharfem Meerrettich bestreichen.  \n Zubereitungszeit ca. 25 Minuten  \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kartoffel Jägerpfanne";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "300 g Schweineschnitzel  \n 2 EL Öl  \n 200 g Kartoffeln  \n 100 g Lauch (Porree)  \n 150 g Champignons  \n 1 kleine Rote Paprikaschote  \n 300 ml Kaltes Wasser  \n 1 Pck Knorrige Jäger Schnitzel  \n";
        listRezepteAnweisungen = "1.) \n 300g Schweineschnitzel in Streifen schneiden, in 2EL heißem Öl bei starker Hitze braten,  \n aus der Pfanne nehmen und warm stellen. \n 2.) \n 200g Kartoffeln schälen und würfeln. 100g Lauch putzen, waschen und in Ringe schneiden.  \n 150g Champignons putzen und in Scheiben schneiden. 1 kleine rote Paprikaschote entkernen,  \n waschen und würfeln. \n 3.) \n Gemüse in die Pfanne geben, 300ml kaltes Wasser zugießen. Beutelinhalt einrühren, unter Rühren  \n aufkochen und zugedeckt bei schwacher Hitze ca. 10 Minuten kochen. Das Fleisch zugeben und in  \n der Sauce heiß werden lassen. \n";
        listRezepteSonstiges = "Tipp: \n Wer Knoblauch liebt, brät 2-3 fein gehackte Knoblauchzehen mit an. \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kartoffel Auflauf mit Lauch und Salami";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "250 g Lauch  \n 1 EL Kräuterbutter  \n Salz, Pfeffer, Paprikapulver  \n 800 g Pellkartoffeln  \n 150 g Getrocknete Tomaten in Öl  \n 150 g Französische Salami  \n 1 Bund Petersilie  \n 0.5 Bund Basilikum  \n 80 g Emmentaler  \n 80 g Bergkäse  \n 2 Stck Eier  \n 2 EL Crème fraîche  \n Fett für die Form  \n";
        listRezepteAnweisungen = "1.) \n Lauch putzen, waschen und in Ringe schneiden. In der heißen Kräuterbutter andünsten.  \n Dann mit Salz, Pfeffer und Paprikapulver würzen. \n 2.) \n Kartoffeln pellen und achteln. Tomaten in Streifen und Salami in Scheiben schneiden.  \n Alles mit dem Lauch in eine gefettete Auflaufform schichten. \n 3.) \n Kräuter abbrausen, trockenschütteln, fein hacken, darüber verteilen. Beide Käsesorten reiben,  \n mit Eiern, Crème fraîche, Salz, Pfeffer und Paprikapulver würzen. Masse über den Auflauf geben,  \n im vorgeheizten Ofen ca. 20 Minuten garen.  \n";
        listRezepteSonstiges = "Umluft: 180°C \n Zubereitungszeit ca. 20 Minuten \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Spargel Gratin";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 Pck Schinken Streifen (200g)  \n 500 g Grüner Spargel  \n 500 g Weißer Spargel  \n 600 g Neue Kartoffeln  \n Salz  \n Fett für die Form  \n Für die Sahne Ei Mischung  \n 200 ml Sahne  \n 4 Stck Eier  \n Salz, frisch gemahlener Pfeffer  \n Muskat, gemahlen  \n 120 g Geriebener \"Löchlekäs\" (würziger Käse)  \n";
        listRezepteAnweisungen = "1.) \n Backofen vorheizen. Spargel waschen, weißen Spargel ganz, bei dem grünen Spargel nur das  \n untere Drittel schälen. Spargel in Stücke schneiden und in Salzwasser kurz blanchieren. \n 2.) \n Kartoffeln schälen, waschen und in Scheiben schneiden. Kartoffeln, Spargel und Schinken in  \n eine gefettete Gratinform schichten. \n 3.) \n Zutaten für den Guss verquirlen, über den Gratin gießen, mit Käse bestreuen und ca. 40-50 Minuten  \n goldbraun backen. \n";
        listRezepteSonstiges = "Umluft: 160°C \n Zubereitungszeit ca. 75 Minuten  \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Blechkartoffeln mit zweierlei Soße";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 kg Kleine neue Kartoffeln  \n Etwas Petersilie  \n 2 EL Öl  \n 1 TL Edelsüß-Paprika  \n Salz, weißer Pfeffer  \n 1 Stck Ei  \n 2 Stck Lauchzwiebeln  \n 100 g Salatcreme  \n 300 g Joghurt  \n 1 TL Currypulver  \n 2 Stck Matjesfilets (ca. 150g)  \n 1 EL  Zitronensaft  \n 1 Prise Zucker  \n 0.5 Stck Kleine Salatgurke  \n 1 Bund Radieschen  \n 0.5 Beet Kresse  \n";
        listRezepteAnweisungen = "1.) \n Kartoffeln waschen und abtropfen lassen. Petersilie waschen, abzupfen, bis auf etwas hacken. \n Mit Öl, Edelsüß-Paprika, Salz und Pfeffer verrühren. Mit Kartoffeln mischen. Auf ein Backblech geben.  \n Im heißen Ofen 40-45 Minuten backen. Zwischendurch wenden. \n 2.) \n Ei ca. 10 Minuten hart kochen. Abschrecken und auskühlen lassen. Lauchzwiebeln putzen, waschen,  \n in Ringe schneiden. Salatcreme und Joghurt mit Salz, Pfeffer und Lauchwiebel, bis auf etwas,  \n verrühren. Creme teilen. Unter 1 Hälfte Curry rühren. Matjes waschen, trocken tupfen, würfeln.  \n In die Currycreme rühren. Mit Zitronensaft und Zucker abschmecken. Kalt stellen. \n 3.) \n Gurke waschen, würfeln. Radieschen putzen, waschen, fein würfeln. Ei pellen, hacken. Mit Radieschen  \n und Gurke in die übrige Creme rühren. Kresse vom Beet schneiden und, bis auf etwas, unter die  \n Eiercreme rühren, abschmecken. Matjessoße mit übrigen Lauchwiebeln, Eiersoße mit Rest Kresse  \n bestreuen. Soßen mit Kartoffeln anrichten. \n";
        listRezepteSonstiges = "Umluft: 175°C \n Zubereitungszeit ca. 60 Minuten \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Gemüse Fleischwurst Auflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500 g Mehlig kochende Kartoffeln  \n 3 Stck Zwiebeln  \n 150 g Champignons  \n 400 g Fleischwurst  \n 2 Bund Schnittlauch  \n 1 EL Butterschmalz  \n 1 Päckchen Tomatensoße (für 250ml Soße)  \n 1 EL Gin  \n 4 EL Schlagsahne  \n 1 Prise Zucker, Salz  \n 200 g Tomaten  \n 150 g TK-Erbsen  \n";
        listRezepteAnweisungen = "1.) \n Die ungeschälten Kartoffeln ca. 15 Minuten kochen, abgießen, kalt abschrecken. Schale abziehen. \n 2.) \n Zwiebeln schälen und würfeln. Pilze putzen und in Blättchen schneiden. Die Wurst in Scheiben schneiden.  \n Schnittlauch waschen, trockenschütteln und in feine Röllchen schneiden. \n 3.) \n Zwiebeln in Butterschmalz dünsten, Wurstscheiben zufügen und kurz anbraten. Die Hälfte des \n Schnittlauchs dazugeben. \n 4.) \n Tomatensoße mit 250ml Wasser zubereiten, mit Gin, Sahne und Zucker verfeinern. Kartoffeln  \n und Tomaten in Scheiben schneiden. \n 5.) \n Boden einer gefetteten Auflaufform mit Kartoffelscheiben belegen. Wurst-Zwiebel-Mischung,  \n Pilze und Erbsen darauf verteilen. Tomatensoße darübergießen. Mit Tomaten und restlichen  \n Kartoffeln abdecken und nochmals salzen. \n";
        listRezepteSonstiges = "Im vorgeheizten Ofen ca. 45 Minuten backen. Mit restlichem Schnittlauch bestreuen. \n Umluft: 150°C \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kasseler Kartoffelpüree Gratin";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Stck Lauchzwiebeln  \n 200 g Champignons  \n 200 g Kirschtomaten  \n 1 mittelgroße Zwiebel  \n 600 g Ausgelöstes Kasselerkotlett (Stück)  \n 2 EL Öl  \n 2 EL Tomatenmark  \n 500 g Passierte Tomaten  \n Etwas Oregano  \n Salz, weißer Pfeffer  \n 1 Prise Zucker  \n 2 Beutel Kartoffelpüree \"das Komplette\" (für je 1/2L Wasser;à 3 Portionen)  \n 2 EL Butter / Margarnine  \n 2 EL Crème fraîche / Schmand  \n Geriebene Muskatnuss  \n 1 Stck Eigelb  \n";
        listRezepteAnweisungen = "1.) \n Lauchzwiebeln putzen, waschen und in Ringe schneiden. Pilze putzen, evtl. Waschen und halbieren.  \n Zwiebel schälen und in Spalten schneiden. Fleisch waschen, trocken tupfen, in Würfel schneiden. \n 2.) \n Öl in einer Pfanne erhitzen. Fleisch darin anbraten. Vorbereitetes Gemüse zugeben und 2-3 Minuten  \n mitbraten. Tomatenmark zugeben und anschwitzen. Mit passierten Tomaten und 100ml Wasser ablöschen.  \n Oregano waschen und, bis auf etwas zum Garnieren, zugeben. Kasselerragout 2-3 Minuten köcheln lassen.  \n Mit Salz, Pfeffer und Zucker würzen. Oregano herausnehmen. \n 3.) \n 1L Salzwasser aufkochen lassen. Vom Herd ziehen und Püreeflocken einrühren. Fett und Crème fraîche  \n unterrühren. Mit Salz und Muskat abschmecken. Zwei kleine oder eine große Auflaufform fetten.  \n Püree ringförmig darin verteilen. Kasselerragout in die Mitte geben. Eigelb verquirlen.  \n Püree damit bestreichen. Unter dem heißen Backofengrill kurz gratinieren. \n Herausnehmen und mit Rest Oregano garnieren. \n";
        listRezepteSonstiges = "Zubereitungszeit ca. 30 Minuten \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kartoffel Zwiebel Gratin";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500 g Kartoffeln  \n 300 ml Kaltes Wasser  \n 50 ml Schlagsahne  \n 50 g Geriebenem Käse  \n 1 Packung Knorr Zwiebel-Rahm-Schnitzel  \n";
        listRezepteAnweisungen = "1.) \n 500g Kartoffeln schälen und in feine Scheiben schneiden. \n 2.) \n 300ml kaltes Wasser in einem Topf geben. Beutelinhalt einrühren und unter Rühren aufkochen.  \n Kartoffelscheiben zugeben und aufkochen. 50ml Schlagsahne unterrühren. Alles in eine flache  \n Auflaufform geben und mit 50g geriebenem Käse bestreuen. \n 3.) \n Im vorgeheizten Backofen bei 200°C ca. 30 Minuten backen. \n";
        listRezepteSonstiges = "Umluft: 175°C \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Bayerischer Krustenbraten";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Stück Zwiebeln  \n 3 Stück Möhren  \n 1.5 kg Schweinekrustenbraten  \n Salz,Pfeffer  \n 1 Flasche Dunkles Bier (330ml)  \n 2 Packungen Semmelknödel  \n 1 Dose Weinsauerkraut (850ml)  \n 1 EL Öl  \n 1 EL Speisestärke  \n";
        listRezepteAnweisungen = "1.) \n Je 1 Zwiebel und Möhre schälen und grob würfeln. Fleisch waschen und trocken tupfen.  \n Schwarte rautenförmig einschneiden. Braten kräftig mit Salz und Pfeffer würzen. Auf die geölte  \n Fettpfanne des Backofens setzen. Gemüsewürfel um das Fleisch verteilen. Im vorgeheizten  \n Backofen ( E-Herd:180°C, Umluft: 160°C, Gas: Stufe 2) ca. 1,5 Stunden garen. Nach der Hälfte  \n der Garzeit mit Bier und ca. 100ml Wasser ablöschen. Ofentemperatur erhöhen  \n( E-Herd:220°C, Umluft: 200°C, Gas: Stufe 4 ) und Fleisch weitere ca. 20 Minuten garen. \n 2.) \n Knödel nach Packungsanweisung zubereiten. 2 Möhren und 1 Zwiebel schälen, würfeln.  \n Sauerkraut abtropfen. Öl erhitzen. Möhren und Zwiebel darin anbraten. Sauerkraut  \n zugeben, ca. 15 Minuten schmoren. \n 3.) \n Braten warm stellen. Bratensatz sieben, mit Wasser auf 300ml Flüssigkeit auffüllen.  \n Speisestärke und 4EL Wasser glatt rühren. Fond damit binden, abschmecken. Alles anrichten. \n";
        listRezepteSonstiges = "Zubereitung: ca. 2 1/4 Stunden \n Pro Portion: ca. 660 kcal \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Eier im Hackteig";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "10 Stück Eier  \n 5 g Schweinemett   \n Paniermehl  \n 2 EL Gehackte Petersilie  \n Salz, Pfeffer  \n Öl zum frittieren   \n";
        listRezepteAnweisungen = "1.) \n Von den Eiern 8 Stück im kochendem Wasser ca. 8 Minuten garen. Herausnehmend,  \n kalt abschrecken und pellen. \n 2.) \n Mett mit 1 Ei, 2 EL Semmelbrösel und Petersilie mischen. Mit Salz und Pfeffer würzen.  \n Die gekochten Eier mit der Mettmasse umhüllen und Bällchen formen. \n 3.) \n Übriges Ei verquirlen. Hack-Eier zuerst darin, danach in den Semmelbrösel wenden.  \n Frittierfett erhitzen ca. 170°C. Hackeier darin 2-4 Minuten goldbraun frittieren.  \n Herausnehmen und auf Küchenpapier abtropfen lassen.  \n";
        listRezepteSonstiges = "Mit Ketchup servieren. \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schupfnudel Putenpfanne";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "600 g Putenbrust  \n 1 Stück Rote Zwiebel  \n 100 g Geräucherter durchwachsenen Speck  \n 400 g Schupfnudeln  \n 1 EL Öl  \n 1 Dose Sauerkraut 425ml  \n Salz, Pfeffer  \n 1 Prise Zucker  \n 1 Bund Schnittlauch  \n";
        listRezepteAnweisungen = "1.) \n Putenbrust in feine Streifen schneiden. Zwiebel schälen und fein würfeln. Speck ebenfalls in  \n feine Würfeln schneiden und in einer großen Pfanne ohne Fett knusprig braten. Speckwürfel aus  \n der Pfanne nehmen und beiseite stellen. Schupfnudeln im Bratfett und gelegentlichem rühren  \n goldbraun anbraten, herausnehmen und beiseite stellen. \n 2.) \n Öl in der Pfanne erhitzen, Fleisch darin goldbraun anbraten. Zwiebel zufügen und kurz mitbraten.  \n Sauerkraut mit Flüssigkeit zugeben und alles offen bei mittlerer Hitze unter gelegentlichem  \n rühren ca. 3 Minuten schmoren. Mit Salz, Pfeffer und Zucker würzen. Schupfnudeln und Speck  \n unterrühren und darin erhitzen.  \n";
        listRezepteSonstiges = "Mit Schnittlauch servieren. \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schupfnudel Auflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "300 g Porree (Lauch)  \n 0.5 Topf Majoran  \n 2 EL Öl  \n 2 Packungen (a' 500g) frische Schupfnudeln (Kühlregal)  \n 400 g Gemischtes Hackfleisch  \n Salz  \n Cayennepfeffer  \n 400 ml Gemüsebrühe (Instant)  \n 150 g Schmelzkäse  \n 30 g Mittelalter Gouda-Käse  \n Majoran zum Garnieren  \n";
        listRezepteAnweisungen = "1.) \n Porree putzen, waschen, und in Ringe schneiden. Majoran waschen, trockentupfen, die Blättchen  \n von den Stielen zupfen und grob hacken. Öl in einer Pfanne erhitzen. Die Schupfnudeln darin  \n portionsweise ca. 5 Minuten unter Wenden anbraten, herausnehmen und beiseite stellen. \n 2.) \n Hack und Porree im Bratfett ca. 5 Minuten unter Wenden anbraten. Mit Salz und Cayennepfeffer würzen.  \n Mit der Brühe ablöschen, aufkochen und ca. 5 Minuten bei starker Hitze einkochen lassen.  \n Schmelzkäse zufügen und darin schmelzen lassen. \n 3.) \n Schupfnudeln und Majoran unter die Hackmischung heben und nochmals abschmecken.  \n Alles in eine Auflaufform füllen. Gouda-Käse darüberbreitend. Im vorgeheizten Backofen  \n ca. 20 Minuten überbacken. Mit frischem Majoran bestreut servieren. \n";
        listRezepteSonstiges = "( E-Herd: 200°C ;  \n Umluft: 175°C )  \n Zubereitungszeit ca. 1 Stunde \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Spagetti Carbonara";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500 g Spagetti   \n 1 Stück Schalotte   \n 1 EL Margarine   \n 300 ml Milch  \n 0.5 TL Gemüsebrühe  \n 50 g Geriebener Parmesan   \n 5 EL heller Soßenbinder  \n Salz,Pfeffer  \n Muskatnuss  \n 100 g Gekochter Schinken  \n";
        listRezepteAnweisungen = "1.) \n Schalotte fein würfeln, in der Margarine glasig dünsten. Milch und 200ml Wasser zugießen.  \n Gemüsebrühe und Parmesan zufügen, unter Rühren aufkochen. Soßenbinder einrühren. Mit Salz,  \n Pfeffer und etwas Muskat abschmecken. \n 2.) \n Schinken in würfeln schneiden. Und unter die Soße mischen. Mit Spagetti servieren. \n";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kartoffel Champignons Gratin mit Frikadellen";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "800 g Kartoffeln   \n 400 g Champignons   \n 150 g Kirschtomaten   \n 2 Stück Knoblauchzehen  \n 1 Stück Große Zwiebel  \n 250 g Hackfleisch  \n 1 Stück Ei  \n Salz,Pfeffer  \n 500 ml Kochcreme   \n 2 Stück Eigelb  \n 150 g Geriebener Käse   \n";
        listRezepteAnweisungen = "1.) \n Kartoffeln schälen und in dünne Scheiben schneiden. Pilze putzen und in Scheiben schneiden.  \n Tomaten waschen und halbieren. Knoblauch und Zwiebel schälen und sehr fein würfeln. Hackfleisch,  \n Ei und Knoblauchwürfel mischen, mit Salz und Pfeffer würzen und zu kleinen Bällchen formen. \n 2.) \n Hackbällchen von allen Seiten anbraten. Pilze und Zwiebeln zufügen, kurz andünsten, Tomaten  \n dazugeben und unterrühren. \n 3.) \n Kartoffelscheiben in eine gefettete Auflaufform schichten, Hackbällchen und Pilz-Zwiebelmischung  \n darüber verteilen. Kochcreme, Eigelb und 50g Gouda verrühren, mit Salz und Pfeffer würzen und  \n darüber verteilen. Mit dem restlichen Gouda bestreuen. Im vorgeheizten Backofen bei 200°C  \n";
        listRezepteSonstiges = "ca. 50 Minuten backen. \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Hühnerpfanne mit Reis";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 Stück Suppenhuhn   \n 1 Bund Suppengemüse  \n 250 g Reis  \n Salz, Pfeffer  \n 1 Stück Zwiebel  \n 1 Stück Je 1 rote, grüne und gelbe Paprikaschote   \n 1 Stück Fleischtomate 200g  \n 1 Stück Knoblauchzehe   \n 2 EL Öl  \n 1 TL Rosenpaprikapulver  \n 100 ml Hühnerbrühe  \n";
        listRezepteAnweisungen = "1.) \n Den Reis in kochendem Salzwasser garen. Die Zwiebeln fein hacken, die Paprika in würfeln schneiden.  \n Die Tomate heiß überbrühen, Haut und Kerne entfernen und würfeln. Die Zwiebel in heißem Öl glasig , \n schmoren, den Knoblauch dazu pressen. Die Paprikawürfel dazugeben und 5 Minuten schmoren.  \n Das Hühnerfleisch dazugeben und weitere 2 Minuten schmoren. Zum schluß die Tomatenwürfel hinzufügen  \n und den Reis unterheben. Die Reispfanne mit den Gewürzen abschmecken, die Brühe angießen und  \n bei geschlossenem Deckel etwa 7 Minuten leise köcheln lassen. \n";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Fischstäbchen Kartoffel Omlett";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "200 g Kleine Kartoffel  \n 1 Stück Rote und Gelbe Paprika  \n 1 Stück Zwiebel  \n 1 Stück Knoblauchzehe  \n 8 Stück TK-Fischstäbchen  \n 6 Stück Eier  \n 200 g Sahne  \n Salz, Pfeffer  \n 2 EL Öl  \n";
        listRezepteAnweisungen = "1.) \n Kartoffel kochen. Paprika in Streifen schneiden. Zwiebel und Knoblauch schälen, beides fein würfeln. \n 2.) \n Fischstäbchen im vorgeheizten Backofen ( E-Herd:220°C) ca. 15 Minuten backen. \n 3.) \n Kartoffeln abgießen und pellen und in Scheiben schneiden. \n 4.) \n Eier und Sahne verquirlen. Mit Salz und Pfeffer würzen. Öl in einer Ofenfesten Pfanne erhitzen.  \n Kartoffeln unter wenden darin 3 Minuten braten. Paprika, Zwiebel und Knoblauch zugeben und andünsten.  \n Fischstäbchen aus dem Ofen nehmen, halbieren und in der Pfanne verteilen. Eiersahne darüber gießen.  \n";
        listRezepteSonstiges = "Im vorgeheizten Backofen ( E-Herd: 200°C) ca. 20 Minuten garen. \n";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Haschee";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500 ml Brühe  \n 500 g Hackfleisch  \n 0.5 El Senf  \n 2 El Braune Soße  \n 2 El Mehl  \n 2 Zwiebeln  \n Knoblauch  \n Tomatenmark  \n Salz, Pfeffer, Curry  \n";
        listRezepteAnweisungen = "Zwiebeln würfeln und gut anbraten. Zur Seite stellen. \n Hackfleisch anbraten und dabei Gewürze und Senf dazugeben. \n Tomatenmark als letztes dazugeben und kurz mit anbraten.  \n Zwiebeln dazugeben und umrühren. \n Mit Mehl bestreuen und langsam die Flüssigkeit dazu geben.  \n Anschließend mit brauner Soße abbinden.  \n Mit 500g Nudeln ausreichen für 3 gute Portionen. \n";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Ofenreisfleisch";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 rote, gelbe und grüne Paprikaschote \n 1 Gemüsezwiebel \n 700g Schweinenackensteak \n Salz, Pfeffer, Rosenpaprika \n 3EL Olivenöl \n 1EL flüssiger Honig \n 2EL Ajvar (pikante Paprikazubereitung; Glas) \n 1EL Gemüsebrühe Instant \n 200g Reis \n 1 Knoblauchzehe \n 200g grieschicher Sahnejoghurt \n 5Stiele Petersilie \n ";
        listRezepteAnweisungen = "1.) \n Ofen vorheizen (E-Herd: 230 °C/Umluft: 210 °C/Gas: s. Hersteller). \n Paprika putzen, waschen, in Streifen schneiden. Zwiebel schälen, in Streifen \n schneiden. Fleisch trocken tupfen, in Streifen schneiden. \n Alles mit je 1 TL Salz, Pfeffer und Paprikapulver, 2 EL 01 und Honig mischen. \n Auf einem Blech verteilen, ca. 30 Minuten backen.  \n 2.) \n 3/4 L heißes Wasser, Ajvar und Brühe verrühren. Reis und Flüssigkeit zum \n Fleisch geben und untermischen. Ofentemperatur reduzieren \n (E-Herd: 180 °C / Umluft: 160 °C), ca. 30 Minuten weiterbacken. \n 3.) \n Knoblauch schälen, hacken. Mit 1 EL 01 und Joghurt verrühren, würzen. \n Petersilie waschen, hacken. Reisfleisch mit Petersilie bestreuen. \n Joghurt dazu reichen. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Fisch Ragout";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "800g Seezungenfilet \n 100g Butter \n 3 fein gehackte Schalotten \n 8EL Semmelbrösel \n 300g Tomaten \n 250g Mozzarella \n 2EL fein gehackte Petersilie \n frisches Basilikum \n ";
        listRezepteAnweisungen = "1.) \n Einen Teil der Butter in einer Pfanne erhitzen und die Seezungenfilets \n darin kurz anbraten. Eine Auflaufform mit Butter einfetten und die \n Filets hineinlegen. \n 2.) \n In der Pfanne nochmals Butter erhitzen und die gehackten Schalotten \n darin andünsten. Die Semmelbrösel und die Petersilie unter die \n Schalottenwürfel mischen. Die Bröselmischung über die  \n Seezungenfilets geben. \n 3.) \n Die Tomaten waschen, trocknen und in Scheiben schneiden. Den \n Mozzarella ebenfalls in Scheiben schneiden und im Wechsel mit den  \n Tomatenscheiben auf dem Fisch verteilen. Bei 200°C überbacken, \n bis der Mozzarella geschmolzen ist. Mit Basilikum garnieren. \n  \n Dazu reicht man Reis oder Folienkartoffeln und einen trockenen italienischen Weißwein, zum Beispiel einen Orvieto. \n ";
        listRezepteSonstiges = "Zubereitungszeit: 35min. \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Jägerpfanne mit Spätzle";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 Zwiebel \n 450g Champignons \n 740g Schweineschnitzel \n Salz, Pfeffer \n 350g Spätzle \n 4EL Öl \n 250ml Gemüsebrühe \n 145g Sahne \n 2EL Soßenbinder \n 1 kleine Tomate \n 3 Zweige Petersilie \n ";
        listRezepteAnweisungen = "1.) \n Zwiebel abziehen und würfeln. Pilze putzen, evtl. abbrausen, in Scheiben schneiden. \n Einige kleinere Pilze ganz lassen. Fleisch abbrausen, trocken tupfen, \n in 8-12  Stücke schneiden und würzen. Spätzle in kochendem Salzwasser \n nach Angaben garen. \n 2.) \n 2EL Öl in einer Pfanne erhitzen. Zwiebel darin 5min. anbraten. \n Pilze zugeben, ca. 5min. Mitbraten. Würzen. Etwas Pilz-Mix herausnehmen. \n Brühe und Sahne in die Pfanne gießen. Aufkochen lassen. Soßenbinder \n einrühren. Aufkochen. Mit Salz und Pfeffer würzen. Soße vom \n Herd nehmen und warm halten. \n 3.) \n Spätzle abgießen. Rest Öl in einer Panne erhitzen. Fleisch darin 5-7min. \n braten. Tomate abbrausen, vierteln, entkernen, würfeln. Petersilie abbrausen, \n trocknen, hacken. Spätzle mit Fleisch, Soße und Rest Pilz-Mix anrichten. \n Mit Petersilie und Tomate garnieren. \n ";
        listRezepteSonstiges = "Arbeitszeit: ca. 40min. \n Garen: ca. 22min. \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Ofenkartoffeln mit Quark";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "250g Kartoffeln \n grobes Salz, Pfeffer \n 200g Magerquark \n 2EL Mineralwasser \n 3-4 Stiele Petersilie \n 1TL eingelegten Pfefferkörner \n Zitronensaft \n ";
        listRezepteAnweisungen = "Kartoffeln waschen und der Länge nach halbieren. Backblech mit \n Backpapier auslegen, Kartoffeln darauf verteilen. Mit grobem Salz \n und Pfeffer bestreuen. Im heißen Ofen (E-Herd:200°C) ca. 40min backen. \n Magerquark mit 2EL Mineralwasser cremig rühren. 3-4 Stiele Petersilie \n fein hacken, mit 1TL eingelegten Pfefferkörnern unter den Quarkheben. \n Mit Salz, Zitronensaft und Pfeffer würzen. \n Mit Kartoffeln anrichten. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Feiner Fisch Kartoffel Auflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "250g frisches oder TK-Kabeljaufilet \n 600g festkochende Kartoffeln \n 300g Tomaten \n 1EL Zitronensaft \n 1 Beutel Würzmischung für buntes Gemüse mit Rindfleischstreifen \n 150ml Sahneersatz zum Kochen (15% Fett) \n 50g geriebener Emmentaler \n ";
        listRezepteAnweisungen = "1.) \n TK-Fischfilet auf einem Teller auftauen lassen. Kartoffeln waschen und in \n Wasser ca. 20min kochen. Kartoffeln anschließend abgießen, \n abschrecken und etwas abkühlen lassen. \n 2.) \n Karoffeln pellen und in Scheiben schneiden. Tomaten waschen, putzen \n und ebenfalls in Scheiben schneiden. Fischfilet waschen, mit Küchenpapier \n trocken tupfen und in mundgerechte Stücke schneiden. \n Fisch mit Zitronensaft beträufeln. \n 3.) \n Kartoffeln, Tomaten und Fisch in eine Auflaufform geben. Beutelinhalt \n Würzmischung in 200ml Wasser und Sahneersatz einrühren, \n unter Rühren aufkochen lassen. \n 4.) \n Soße über die Auflaufzutaten verteilen und mit Käse bestreuen. \n Im vorgeheizten Backofen (E-Herd: 220°C , Umluft: 200°C) \n 15-20min goldbraun überbacken. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schinken Toast";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "8 Scheiben gekochter Schinken \n 8 Scheiben roher Schinken \n 2 Zwiebeln \n 400g Kräuter Crème fraîche \n 1 Ei (Größe M) \n 50g Schlagsahne \n 200g geriebener Gouda Käse \n 200g geriebener Pizzakäse \n Salz, Pfeffer \n 16 Scheiben Toastbrot \n ";
        listRezepteAnweisungen = "1.) \n Schinken fein würfeln. Zwiebeln schälen, fein würfeln. Crème fraîche \n mit Ei und Sahne verrühren. Mit Schinken, Zwiebeln und Käse verrühren. \n Kräftig mit Salz und Pfeffer würzen. \n 2.) \n Toastbrotscheiben nebeneinander auf 2 mit Backpapier belegte Bleche legen. \n Schinkenmischung gleichmäßig darauf verteilen. Im heißen \n Ofen bei 180°C Ober/Unterhitze ca. 20min backen. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Bratkartoffel Hack Auflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Zwiebeln \n 2 Knoblauchzehen \n 400g Rinderhackfleisch \n 3-4 EL Olivenöl \n 1 EL Tomtenmark \n 800g Pellkartoffeln (vom Vortag) \n Salz, Pfeffer \n 3 Tomaten \n 1 Bund Oregano \n 130g geriebener Bergkäse \n ";
        listRezepteAnweisungen = "1.) \n Zwiebeln und Knoblauch schälen, beides in Scheiben schneiden. \n Rinderhackfleisch in 2 EL heißem Öl krümelig braten. Tomatenmark zugeben \n und kurz mitdünsten. Mischung beiseitestellen. \n 2.) \n Kartoffeln pellen, in Scheiben schneiden und in 1-2 EL heißem Öl goldbraun \n braten. Zwiebeln, Knoblauch und Hack zugeben, unter vorsichtigem \n Wenden kurz braten. Mit Salz und Pfeffer würzen. \n 3.) \n Tomaten waschen und in Scheiben schneiden. Oregano waschen, trocken \n schütteln, Blättchen abzupfen und hacken. Tomaten, Oregano und  \n Hack Kartoffelmischung in eine Auflaufform geben. Mit Käse \n bestreuen. Im vorgeheizten Backofen (E-Herd: 200°C , Umluft: 180°C) \n ca. 10 Minuten überbacken. \n ";
        listRezepteSonstiges = "Zubereitungszeit ca. 30min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Tomaten Reis mit Garnelen";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Knoblauchzehen \n 4EL Öl \n 400g geschälte TK Garnelen \n 2EL Zitronensaft \n Salz, Pfeffer \n 1 Zwiebel \n 3 Stangen Staudensellerie \n 1 Lauchzwiebel \n 250g Kirchtomaten \n 600ml Gemüsebrühe \n 200g stückige Tomaten \n 200g Schnellkochreis \n Koriander zum Garnieren \n ";
        listRezepteAnweisungen = "1.) \n Knoblauch schälen, hacken und im Topf in 2 EL Öl anbraten. \n Garnelen zugeben. Braten, mit Zitronensaft, Salz und Pfeffer würzen. \n Herausnehmen und beiseitestellen. \n 2.) \n Zwiebel schälen, würfeln. Sellerie und Lauchzwiebel waschen, klein \n schneiden. Tomaten waschen, halbieren. 2 EL Öl im Topf erhitzen. \n Zwiebel und Gemüse darin dünsten. Mit Brühe und stückigen Tomaten \n ablöschen, Reis zugeben, bedeckt ca. 10min garen. \n Garnelen zugeben und erwärmen. Salzen, pfeffern, mit Koriander garnieren. \n ";
        listRezepteSonstiges = "Zuereitungszeit: ca. 35min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Ofen Tomaten";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "12 mittelgroße Tomaten \n 2 Knoblauchzehe \n 2 EL Öl \n 300g Rinderhackfleisch \n 1 Packung stückige Tomaten (400g) \n Salz, Pfeffer \n 1 EL getrocknete Kräuter \n 125g Vollkornreis \n 1/2 Bund Petersilie \n 50g Frischkäse \n 200g Mozzarella \n ";
        listRezepteAnweisungen = "1.) \n Tomaten waschen, je einen Deckel abschneiden und Tomaten aushölen. \n Inneres hacken. Knoblauch schälen, hacken, im Öl andünsten. Hack \n darin krümelig braten. Tomateninneres und stückige Tomaten zugeben. \n Mit Salz, Pfeffer und Kräutern würzen. Ca. 10min offen köcheln. \n Reis in Salzwasser kochen. \n 2.) \n Petersilie waschen und hacken. Reis abgießen. Mit Hacksoße, Petersilie \n und Frischkäse mischen, abschmecken. Tomaten damit füllen, in eine \n Auflaufform setzen. Mozzarella reiben, darüberstreuen. Im Ofen \n (E-Herd: 180°C , Umluft: 160°C) ca. 20min überbacken. \n ";
        listRezepteSonstiges = "Zubereitungszeit: ca. 40min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schinkenfilets mit Kartoffelgratin";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1kg mittelgroße Kartoffeln \n 5 Schalotten \n 1 Knoblauchzehe \n 1EL Butter \n 250g Schlagsahne \n Salz, Pfeffer \n geriebene Muskatnuss \n 2 Schweinefilets (á ca. 250g) \n 1 Bund Petersilie \n 80g Parmaschinken in Scheiben \n 100g Kirschtomaten \n 50g geriebener Cheddar \n ";
        listRezepteAnweisungen = "1.) \n Kartoffeln schälen, waschen und in Scheiben hobeln. Schalotten und \n Knoblauch schälen, beides in feine Würfel schneiden. \n 2.) \n Butter in einem ofenfesten Topf schmelzen. Schalotten- und Knoblauchwürfel \n darin andünsten. Sahne zugeben, kräftig mit salz, Pfeffer und Muskatnuss würzen. \n Kartoffeln in die Schlagsahne geben. \n Ca. 7min unter vorsichtigem Rühren erwärmen. Mischung in Auflaufform \n füllen. Im vorgeizten Backofen (E-Herd: 200°C , Umluft: 180°C) \n ca. 40min backen. \n 3.) \n Schweinefilets in der Zwischenzeit waschen, trockentupfen, rundherum \n mit Salz und Pfeffer würzen. Petersilie waschen, trocken schütteln und \n die Blättchen abzupfen. Bis auf einige zum Garnieren auf dem Fleisch \n verteilen. Fleisch mit Schinkenscheiben umwickeln. Nach ca. 10min \n Backzeit die Filets mittig auf das Kartoffelgratin setzten. Kirschtomaten \n waschen, trocken reiben und um das Fleisch verteilen. Mit Cheddar \n bestreuen und alles zusammen zu Ende garen. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Gefüllte Paprika mit Hack und Reis";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "3 rote Paprikaschoten \n 2 Zwiebeln \n 150g Rinderhackfleisch \n 70g + 2EL Tomatenmark \n 180g Reis \n Salz, Pfeffer \n 1EL Gemüsebrühe \n 1TL Speisestärke \n ";
        listRezepteAnweisungen = "1.) \n Paprika waschen, einen Deckel abchneiden und Kerne entfernen. \n 2.) \n Zwiebeln schälen und würfeln. Mit Hack, 70g Tomatenmark und Reis \n vermengen. Mit Salz und Pfeffer würzen. Paprika mit der Hackmasse \n füllen. \n 3.) \n Paprika in einem Topf stellen und 1/2 L kochendes Wasser zugießen. \n Paprikadeckel daraufsetzen und alles ca. 30min köcheln lassen. \n 4.) \n Paprika herausnehmen. Brühe und 2EL Tomatenmark in den Sud rühren. \n Stärke einrühren und ca. 1min köcheln lassen. \n Mit Salz und Pfeffer würzen. Paprika mit Tomatensoße \n auf Tellern anrichten und servieren. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Tomaten Mozzarella Gratin";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2EL Tomatenmark \n 500g Schlagsahne \n 400ml Gemüsebrühe \n 2TL Pesto (Glas) \n 350g Vollkorn Spiralnudeln \n 4 Tomaten \n 250g Mozzarella \n 4 Scheiben Parmaschinken \n ";
        listRezepteAnweisungen = "1.) \n Tomatenmark, Sahne, Gemüsebrühe und Pesto in einem Topf \n verrühren und unter Rühren aufkochen. Vollkornspiralnudeln zugeben \n und alles unter gelegentlichem Rühren ca. 3min köcheln lassen. \n 2.) \n Tomaten inzwischen waschen, putzen und in Scheiben schneiden. \n Mozzarella gut abtropfen lassen und ebenfalls in dünne Scheiben schneiden. \n 3.) \n Nudeln mit dem Sud in eine Auflaufform füllen. Tomaten und \n Mozzarella darauf in Streifen nebeneinander verteilen. Schinken \n ebenfalls daraufgeben. Gratin im vorgeizten Backofen \n (E_Herd: 180°C , Umluft: 160°C) ca. 20min goldbraun backen. \n ";
        listRezepteSonstiges = "Zubereitungszeit: ca. 40min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Schnitzel mit Kräuterkartoffeln";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "8 dünne kleine Schweineschnitzel (à ca. 50g) \n Salz, Pfeffer \n 300g Knuspermüsli Flakes mit Mandeln \n 2 Eier \n 75g Mehl \n 800g kleine Kartoffeln \n 250g Kirschtomaten \n 2 Lauchzwiebeln \n 100g geräucherter roher Schinken in dünnen Scheiben \n ca. 6EL Öl \n 125g Kräuter Crème fraîche \n ";
        listRezepteAnweisungen = "1.) \n Schnitzel mit Salz und Pfeffer würzen. Müsli in einen Gefrierbeutel geben, \n mit einer Teigrolle zerdrücken. Eier in einem tiefen Teller verquirlen. \n Schnitzel erst in Mehl, dann im Ei und zuletzt im Müsli wenden. \n Panade andrücken. \n 2.) \n Kartoffeln schälen, waschen, in Salzwasser ca. 15min kochen. Tomaten \n waschen und halbieren. Lauchzwiebeln putzen, waschen und in Ringe schneiden. \n 3.) \n Schinken in Streifen schneiden und in 1EL Öl knusprig braten. Auf \n Küchenpapier abtropfen lassen. Ca. 5EL Öl erhitzen. Schnitzel darin \n je Seite ca. 4min braten. \n 4.) \n Kartoffeln abgießen, mit Tomaten, Lauchzwiebeln und Crème fraîche  \n mischen. Alles anrichten. \n ";
        listRezepteSonstiges = "Zubereitungszeit: ca. 45min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Ofen Geschnetzeltes auf Baguette";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 Bund Lauchzwiebeln \n 300g Ananasfruchtfleisch (ersatzweise aus der Dose) \n 3 Schweineschnitzel (à ca. 160g) \n 1EL Öl \n Salz, Pfeffer \n Paprikapulver edelsüß \n 200g Doppelrahmfrischkäse \n 120g geriebener Gouda \n 1 Baguette (ca. 250g) \n 2 Tomaten \n 4 Scheiben gekochter Schinken \n ";
        listRezepteAnweisungen = "1.) \n Lauchzwiebeln putzen, waschen, in Ringe schneiden. Ananasfruchtfleisch \n in Scheiben schneiden. Schnitzel trocken tupfen und in Streifen schneiden. \n Öl in einer Pfanne erhitzen. Schnitzel darin 4-6 min scharf anbraten. \n Mit Salz, Pfeffer und Paprikapulver würzen. Lauchzwiebeln und Ananas \n zugeben und kurz mitbraten. Alles aus der Pfanne nehmen und etwas  \n abkühlen lassen. Mit 150g Frischkäse und Gouda verrühren und \n mit Salz und Pfeffer würzen. \n 2.) \n Baguette halbieren und Hälften je waagerecht durchschneiden. \n Tomaten waschen, putzen und in Scheiben schneiden. Baguette je mit \n etwas vom restlichen Frischkäse bestreichen, mit je 1 Scheibe Schinken \n und Tomatenscheiben belegen. Geschnetzeltes darauf verteilen. \n Bagutte auf ein mit Backpapier belegtes Blech setzen. \n Im heißen Ofen (E-Herd: 200°C , Umluft: 180°C) ca. 15min backen. \n ";
        listRezepteSonstiges = "Zubereitungszeit: ca. 40min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Reis Gemüseauflauf mit Käsehaube";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "200g Langkornreis \n Salz, Pfeffer \n 250g Brokkoli \n je 1/2 rote und gelbe Paprikaschote \n 1 Zucchini \n 150g Kirchtomaten \n 100g gekochter Schinken (Scheiben) \n 100g Comté Käse (Stück) \n 4 Stiele Thymian \n 2EL Öl \n 3 Eier \n 100ml Milch \n 50g Schlagsahne \n geriebene Muskatnuss \n ";
        listRezepteAnweisungen = "1.) \n Reis in kochendem Salzwasser nach Packungsanweisung garen. Brokkoli \n waschen, putzen, in kleine Röschen teilen und in kochendem Salzwasser \n ca. 2min blanchieren. Abschrecken und abtropfen lassen. Paprika und \n Zucchini waschen, putzen und würfeln. Tomaten waschen und halbieren. \n Schinken in Streifen schneiden. Käse grob raspeln. Thymian waschen, \n trocken schütteln und die Blättchen abzupfen. \n 2.) \n Öl in einer Pfanne erhitzen. Paprika und Zucchini darin andünsten. Reis \n abgießen. Mit Brokkoli, Paprika Zucchini Mischung, Tomaten, \n 2/3 geraspeltem Käse, Schinken und Thymian mischen.  \n Mit Salz und Pfeffer würzen. \n 3.) \n Eier, Milch und Sahne verquirlen. Mit Salz, Pfeffer und Muskat würzen. \n Reis Gemüse Mischung in eine Auflaufform geben. Eiersahne \n darübergießen. Mit übrigem Käse bestreuen. Im heißen Ofen \n (E-Herd: 180°C , Umluft: 160°C) ca. 50min backen. \n Reis Auflauf aus dem Ofen nehmen und anrichten. \n ";
        listRezepteSonstiges = "Zubereitungszeit: ca. 1 1/2 Std. \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Penne mit Champignons & Tomaten";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "300g Nudeln (z.B. Penne rigate) \n Salz, Pfeffer \n 1 Zwiebel \n 2 kleine Knoblauchzehen \n 400g braune Champignons \n 250g Kirschtomaten \n 1EL Öl \n 2TL getrockneter Oregano \n 100ml Gemüsebrühe (Instant) \n ";
        listRezepteAnweisungen = "1,) \n Nudeln in kochendem Salzwasser nach Packungsanweisung garen, \n abgießen und abtropfen lassen. Zwiebel und Knoblauch inzwischen  \n schälen und fein würfeln. Champignons putzen und in dicke Scheiben \n schneiden. Kirschtomaten waschen und halbieren. \n 2.) \n Öl in einer beschichteten Pfanne erhitzen. Champignons darin kurz \n anbraten. Zwiebel und Knoblauch zugeben und kurz andünsten. \n Kirschtomaten, Oregano und Gemüsebrühe zugeben und ca. 5min \n köcheln lassen. Nudeln unterheben und mit Pfeffer würzen. \n Nach Belieben mit frischen Oregano Blättchen bestreuen. \n ";
        listRezepteSonstiges = "Zubereitungszeit: ca. 25min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Bayerisches Dunkelbiergulasch";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1 kg Rindergulasch \n 1 Flasche Dunkelbier 0,5 l \n 400ml Rinderbrühe \n 500g Kartoffeln \n 1 große Zwiebel \n 2 Zehen Knoblauch \n 2 rote Paprika \n 1 EL Thymian \n 1 EL Paprikapulver edelsüß \n 1-2 EL mittelscharfer Senf \n 2 EL Tomatenmark \n Salz, Pfeffer, Zucker \n ";
        listRezepteAnweisungen = "1.) \n Zuerst Zwiebeln und Knoblauch häuten und fein würfeln. \n Die Paprika waschen, entkernen und in kleine Stücke schneiden. \n Kartoffeln schälen und ebenfalls würfeln. \n Das Fleisch waschen, trocken tupfen und ggf. fein würfeln, sofern es noch am Stück ist. \n Einen Schmortopf auf höchster Stufe erhitzen. Wenn der Topf heiß ist, \n Fett hinein geben und warten, bis auch dieses heiß ist. Anschließend das \n Fleisch schön resch anbraten, damit sich Röstaromen bilden können. Wenn \n das Fleisch angebraten ist, aus dem Topf nehmen und auf einem Teller oder \n in einer Schüssel zur Seite stellen. \n 2.) \n Die Temperatur herunter drehen und im selben Topf die gewürfelten \n Zwiebeln mit dem Knoblauch glasig dünsten. Paprika hinzu geben \n und zwei TL Zucker. Kurz anbraten und immer wieder durchrühren. \n Tomatenmarkt unterrühren und weiter dünsten. \n Mit ca. einem viertel des Bieres angießen und ein wenig ein reduzieren lassen. \n Nach und nach das ganze Bier hinein schütten. \n Fleisch, Kartoffeln und Rinderbrühe hinzu geben. \n 3.) \n Mit Thymian, Paprikapulver und Senf würzen. Kurz aufkochen lassen und \n mindestens 1,5 bis 2 Stunden auf dem Herd schmoren lassen, damit das \n Fleisch schön zart wird und das Bittere vom Bier verschwindet. \n Mit Salz und Pfeffer abschmecken. \n 4.) \n Serviert schmeckt das Gulasch einfach mit Brot. \n ";
        listRezepteSonstiges = "Ich brate Paprika immer mit Zucker an, da sie dann besser zum Verdauen \n ist und nicht so schwer im Magen liegt. -> Paprika Unverträglichkeit \n Dieses Gulasch ist nach diesem Rezept eigentlich eher wie eine \n Gulaschsuppe. Durch die Stärke der Kartoffeln dickt es ein wenig ein. \n Wer es nicht so flüssig mag, kann weniger Brühe hinzu geben und/oder \n dunklen Saucenbinder verwenden. \n Die Kartoffeln können ungekocht in das Gulasch getan werden. Wenn sie \n klein gewürfelt sind, dann sind diese nach den 1,5 Stunden \n Schmorzeit durch. \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Tomaten Käse Zupfbrot";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "2 Packungen Ofenfrisches Zupfbrot (Knoblauch und Kräuter) \n 125ml Tomatensoße \n getrocknete italienische Kräuter \n geriebener Käse \n 2EL Butter \n ";
        listRezepteAnweisungen = "1.) \n Teig aus der Verpackung nehmen. Jedes Teigstück noch einmal halbieren. \n Teigscheiben mit etwas Tomatensoße bestreichen, jeweils mit Kräutern \n und Käse bestreuen. Butter und beigelegte Knoblauchpaste (vom Zupfbrot) \n in einem kleinem Topf schmelzen lassen. \n 2.) \n Die Hälfte der Teigstücke überlappend in eine Auflaufform stellen. \n Mit ca. der Hälfte der Buttermischung beträufeln. \n Restliche Teigstücke und Buttermischung darauf verteilen. \n Im vorgeheizten Backofen (E-Herd 180°C) ca. 35min backen. \n Evtl. nach ca. 20min mit Alufolie bedecken, damit das Brot nicht \n zu dunkel wird. \n ";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kartoffelkuchen";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "1.800 g Kartoffeln, festkochend \n 1 Bund Schnittlauch oder Lauchzwiebeln \n 1 Knoblauchzehe \n 200 ml MILFINA Schlagsahne \n 3 LANDFREUDE Eier \n 250 g ALPENMARK Emmentaler, gerieben \n Salz \n LE GUSTO Gewürzmühle, Sorte: Pfeffer, schwarz \n LE GUSTO Paprika, edelsüß \n Springform 26 cm \n MILFINA Butter zum Einfetten der Form \n ";
        listRezepteAnweisungen = "1.) \n Den Ofen auf 170 °C Ober-/Unterhitze vorheizen. Die Kartoffeln schälen, waschen und in dünne Scheiben schneiden oder hobeln. \n 2.) \n Schnittlauch und Knoblauch fein hacken. Schlagsahne mit den Eiern und Gewürzen gut verquirlen. Schnittlauch und Knoblauch unterheben. \n 3.) \n Den Boden der Springform fetten oder mit Backpapier auslegen. Mit den Kartoffelscheiben überlappend auslegen. Eine Schicht Emmentaler darüber geben, anschließend wieder mit einer Kartoffelschicht bedecken. Weiter fortfahren, bis alle Zutaten aufgebraucht sind. \n 4.) \n Nun die Schlagsahne-Eier-Mischung über die Kartoffel-Käse-Schichten gießen. Den Kartoffelkuchen 75 Minuten backen, bis die Kartoffeln goldbraun sind. Vorsichtig aus der Form lösen und heiß servieren. \n ";
        listRezepteSonstiges = "Zubereitungszeit: 20min \n Kochzeit: 75min \n Gesamtzeit: 95min \n ";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Russentopf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500gr. Hackfleisch\n500gr. Nudeln\n1/2 Becher Schmand\n1 Tube Tomatenmark\n1 Esslöffel Senf\n1 Brühe Würfel\n 1 Zwiebel";
        listRezepteAnweisungen = "Die Zwiebel schälen, kleinschneiden und mit dem Hackfleisch zusammen anbraten.\nBrüheWürfel in kochendem Wasser auflösen und mit Tomatenmark, Senf und Schmand verühren.\nSoße über das angebratene Hackfleisch geben und kurz erhitzen.\n" +
                "Nudeln Kochen und nach abschütten in eine große Schüssel geben.\nFertige Soße über die Nudeln und alles gut vermischen.\nGuten Appetit";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Kaese Lauch Suppe";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500gr. Hackfleisch\n3 Stangen Lauch\n250gr. Schmelzkäse\n1Becher Creme Fraiche\n3 Würfel Gemüsebrühe\n700ml Wasser\nSalz und Pfeffer";
        listRezepteAnweisungen = "Das Hackfleisch etwas würzen und in der Pfanne mit ein bisschen Öl anbraten.\nDen Lauch putzen, in Ringe schneiden und kurz mit anbraten.\n" +
                "Brühewürfel in etwas Wasser auflösen und mit dem restlichen Wasser, Hackfleisch und Lauch in einen Topf geben und 10 Minuten köcheln lassen.\nSchmelzkäse einrühren und kurz weiter köcheln lassen.\n" +
                "Ggf. nochmal etwas nachwürzen, CremeFraiche unter rühren, FERTIG.\nDazu kann man noch ein paar Brötchen oder Baguette aufbacken.\nGuten Appetit";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Nudelauflauf";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "500gr. Hackfleisch\n500gr. Nudeln\n2x Knorr Tomato Algusto\n2x Sahne\n2 Würfel Gemüsebrühe\n500ml Wasser\n1 Stück Käse Mittelalt oder fertig geriebener Käse";
        listRezepteAnweisungen = "Den Backofen auf 200°C vorheizen.\nDas Hackfleisch etwas würzen und in der Pfanne mit ein bisschen Öl anbraten.\nNudeln, Hackfleisch, Al Gusto und die Sahne in den ThermoChef geben.\nDie Brühewürfel in 500ml kochendem Wasser auflösen lasse und dazu geben.\n" +
                "Alles gut umrühren.\nGgf. noch Wasser hinzugeben, damit die Nudeln komplett mit Wasser bedeckt sind.\nDen Käse reiben und großzügig darauf verteilen.\nDanach den Deckel auf den Turbo Chef und ab damit in den Backofen.\nGarzeit: 45 Minuten mit Deckel und dann noch 15 Minuten ohne Deckel, damit der Käse braun wird.\n" +
                "\nGuten Appetit";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

/*
        listRezepteName = "";
        listBild = R.drawable.icon_logo;
        listRezepteZutaten = "";
        listRezepteAnweisungen = "";
        listRezepteSonstiges = "";
        listRezepteHauptgerichte.add(listRezepteHauptgerichte.size(),new RezepteArray(listRezepteName,listBild,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

*/

        return listRezepteHauptgerichte;
    }
}
