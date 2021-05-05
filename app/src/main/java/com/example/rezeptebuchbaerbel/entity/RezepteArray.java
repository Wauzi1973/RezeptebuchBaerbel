package com.example.rezeptebuchbaerbel.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;


@Entity
public class RezepteArray {
    @PrimaryKey(autoGenerate = true)
    public long Id;

    @ColumnInfo
    public String rezeptName;
    public int rezeptBild;
    public String zutaten;
    public String anweisung;
    public String sonstiges;


    public RezepteArray(){
    }

    public RezepteArray(String rezeptName, int rezeptBild, String zutaten, String anweisung, String sonstiges){
        this.rezeptName = rezeptName;
        this.rezeptBild = rezeptBild;
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

    public String getRezeptName() {
        return rezeptName;
    }

    public void setRezeptName(String rezeptName) {
        this.rezeptName = rezeptName;
    }

    public int getRezeptBild() {
        return rezeptBild;
    }

    public void setRezeptBild(int rezeptBild) {
        this.rezeptBild = rezeptBild;
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
}
