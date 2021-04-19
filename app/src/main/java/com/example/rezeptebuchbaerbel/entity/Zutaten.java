package com.example.rezeptebuchbaerbel.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity
public class Zutaten {
    @PrimaryKey(autoGenerate = true)
    public long Id;

    @ColumnInfo
    public String zutaten;
    public String anweisung;
    public String sonstiges;

    @ForeignKey(entity = Rezepte.class,
    parentColumns = {"Id"},
    childColumns = {"zutatenID"},
    onDelete = ForeignKey.CASCADE)
    public long zutatenID;

    public Zutaten(){}

    public Zutaten(long zutatenID, String zutaten, String anweisung, String sonstiges){
        this.zutatenID = zutatenID;
        this.zutaten = zutaten;
        this.anweisung = anweisung;
        this.sonstiges = sonstiges;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getZutaten() {
        return zutaten;
    }

    public void setZutaten(String zutaten) {
        this.zutaten = zutaten;
    }

    public String getAnweisung() {
        return anweisung;
    }

    public void setAnweisung(String anweisung) {
        this.anweisung = anweisung;
    }

    public String getSonstiges() {
        return sonstiges;
    }

    public void setSonstiges(String sonstiges) {
        this.sonstiges = sonstiges;
    }

    public long getZutatenID() {
        return zutatenID;
    }

    public void setZutatenID(long zutatenID) {
        this.zutatenID = zutatenID;
    }
}
