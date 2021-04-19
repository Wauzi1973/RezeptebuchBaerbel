package com.example.rezeptebuchbaerbel.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.rezeptebuchbaerbel.dao.KategorienDAO;
import com.example.rezeptebuchbaerbel.dao.RezepteDAO;
import com.example.rezeptebuchbaerbel.dao.ZutatenDAO;
import com.example.rezeptebuchbaerbel.entity.Kategorien;
import com.example.rezeptebuchbaerbel.entity.Rezepte;
import com.example.rezeptebuchbaerbel.entity.Zutaten;

@Database(entities = {Kategorien.class, Rezepte.class, Zutaten.class},version = 1)
public abstract class DatabaseClass extends RoomDatabase {
    public abstract KategorienDAO createKategorienDAO();
    public abstract RezepteDAO createRezepteDAO();
    public abstract ZutatenDAO createZutatenDAO();
}
