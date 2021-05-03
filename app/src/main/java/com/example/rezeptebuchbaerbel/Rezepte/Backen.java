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

        listRezepteName = "Fanta Kuchen";
        listRezepteZutaten = "Boden: \n5 Eier\n300gr. Zucker\n1 Päckchen Vanillezucker \n350gr. Mehl\n1 Päckchen Backpulver\n175ml. Fanta\n Belag: \n3 Dosen Mandarinen\n600gr. Schlagsahne\n5 Päckchen Vanillezucker\n3 Päckchen Sahnestei\n500gr. Schmand";
        listRezepteAnweisungen = "Boden:\nAls erstes stellt man den Backofen auf 200°C und lässt ihn schonmal warm werden.\nIn der zwischenzeit gibt man Zucker, Mehl, Backpulver, Vanillezucker, Eier Öl und Fanta in eine Schüssel knetet es gut durch. (Teig ist sehr flüssig)\nDanach gibt man den Teig auf ein Backblech mit hohem Rand.\nWenn der Ofen vorgeheitzt ist kommt das Backblech mit dem Teig für ca. 40 Minuten auf die mittlere Schiene, bis er schön goldgelb ist.\n Wenn der Boden fertig ist, diesen abkühlen lassen.\nJetzt kümmern wir uns um den Belag:\nDafür geben wir die Sahne mit Vanillezucker und Sahnesteif in eine Rührschüssel und schlagen die Sahne.\nDie Mandarinen schütten wir in ein Sieb und lassen sie abtropfen.\n(Wer mag kann den Saft auffangen und trinken, lecker und Gesund)\nAls nächstes geben wir den Schmand zu der Sahne und mischen es nochmal kurz durch.\n Zum Schluss heben wir die Mandarinen vorsichtig unter die Sahne-Schmand Mischung.\nSchon ist der Belag fertig und kann gleichmäßig auf dem abgekühlten Boden verteilt werden.\nDen Kuchen noch eine Stunde in den Kühlschrank stellen und dann genießen.\nGuten Appetit";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(), new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

        listRezepteName = "Pfannekuchen";
        listRezepteZutaten = "6 Personen >> 4Personen \n 6 Eier >> 4 Eier\n150gr. Margarine >> 125gr. Margarine\n100gr. Zucker >> 75gr. Zucker\n1/2Tl Salz >> 1/4Tl Salz\n3Päckchen Vanillezucker >> 2Päckchen Vanillezucker\n800ml Milch >> 600ml Milch\n600gr. Mehl >> 400gr. Mehl";
        listRezepteAnweisungen = "Man gibt alle Zutaten zusammen in eine große Rührschüssel und mixen es mit dem Mixer gut durch, bis das es eine gleichmäßige Masse geworden ist.\nDie Pfanne auf dem Herd vorheizen und mit etwas Fett oder Trennspray einsprühen.\n" +
                "Als nächstes mit einer Schöpfkelle einen Löffel Teig in die Pfanne geben und gleichmäßig verteilen.\nPfannekuchen wenden und von beiden Seiten GoldGelb werden lassen.\nFertige Pfannekuchen mit Marmelade, Schokolade, Zucker oder das was man möchte verzieren und geniesen.\nGuten Appetit";
        listRezepteSonstiges = "";
        listRezepteBacken.add(listRezepteBacken.size(), new RoomRezepte(listRezepteName,listRezepteZutaten,listRezepteAnweisungen,listRezepteSonstiges));

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
