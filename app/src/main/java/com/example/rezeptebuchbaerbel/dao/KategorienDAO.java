package com.example.rezeptebuchbaerbel.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepte;
import com.example.rezeptebuchbaerbel.entity.Kategorien;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface KategorienDAO {

    @Transaction
    @Insert
    public long insert(Kategorien kategorien);

    @Update
    public void update(Kategorien kategorien);

    @Delete
    public void delete(Kategorien kategorien);

    @Query("SELECT * FROM kategorien")
    public List<Kategorien> getKategoriens();

    @Query("SELECT * FROM kategorien")
    public List<KategorieWithRezepte> getKategorieWithRezeptens();

    @Insert
    public void insertAllKategorien(ArrayList<Kategorien> liste);

    @Query("Update kategorien Set kategorie=:kategorie Where Id=:Id")
    public void updateKategorie(long Id, String kategorie);

    @Query("Update kategorien Set bildName=:bildName Where Id=:Id")
    public void updateBild(long Id, int bildName);
}

