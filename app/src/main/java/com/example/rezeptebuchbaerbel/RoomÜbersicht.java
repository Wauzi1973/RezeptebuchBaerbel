package com.example.rezeptebuchbaerbel;

import java.util.ArrayList;


public class RoomÜbersicht {

    public int bildname;
    public String nameÜbersicht;
    public ArrayList<RoomRezepte> roomRezeptes;



    public RoomÜbersicht(int bildName, String nameÜbersicht, ArrayList<RoomRezepte> roomRezeptes){
        super();
        this.bildname = bildName;
        this.nameÜbersicht = nameÜbersicht;
        this.roomRezeptes = roomRezeptes;
    }
    public int getBildname() {
        return bildname;
    }

    public String getNameÜbersicht() {
        return nameÜbersicht;
    }

    public ArrayList<RoomRezepte> getRoomRezeptes() {
        return roomRezeptes;
    }
}



