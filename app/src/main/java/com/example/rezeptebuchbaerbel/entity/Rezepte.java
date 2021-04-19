package com.example.rezeptebuchbaerbel.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity
public class Rezepte {
    @PrimaryKey(autoGenerate = true)
    public long Id;

    @ColumnInfo
    public String rezeptName;

    @ForeignKey(entity = Kategorien.class,
    parentColumns = {"Id"},
    childColumns = {"kategorieID"},
    onDelete = ForeignKey.CASCADE)
    public long kategorieID;

    public Rezepte(){
    }

    public Rezepte(long kategorieID, String rezeptName){
        this.kategorieID = kategorieID;
        this.rezeptName = rezeptName;
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

    public long getKategorieID() {
        return kategorieID;
    }

    public void setKategorieID(long kategorieID) {
        this.kategorieID = kategorieID;
    }
}
