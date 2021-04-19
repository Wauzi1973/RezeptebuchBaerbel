package com.example.rezeptebuchbaerbel.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Kategorien {

    @PrimaryKey(autoGenerate = true)
        public long Id;

    @ColumnInfo
    public int bildName;
    public String kategorie;

    public Kategorien(){
    }

    public Kategorien(int bildName, String kategorie){
        this.bildName = bildName;
        this.kategorie = kategorie;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getBildName() {
        return bildName;
    }

    public void setBildName(int bildName) {
        this.bildName = bildName;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }
}
