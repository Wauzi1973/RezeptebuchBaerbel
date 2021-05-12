package com.example.rezeptebuchbaerbel.roomAlt;

import java.util.ArrayList;


public class RoomUebersicht {

    public int bildname;
    public String nameUebersicht;
    public ArrayList<RoomRezepte> roomRezeptes;



    public RoomUebersicht(int bildName, String nameUebersicht, ArrayList<RoomRezepte> roomRezeptes){
        super();
        this.bildname = bildName;
        this.nameUebersicht = nameUebersicht;
        this.roomRezeptes = roomRezeptes;
    }
    public int getBildname() {
        return bildname;
    }

    public String getNameUebersicht() {
        return nameUebersicht;
    }

    public ArrayList<RoomRezepte> getRoomRezeptes() {
        return roomRezeptes;
    }
}



