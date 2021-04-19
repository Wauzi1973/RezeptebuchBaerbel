package com.example.rezeptebuchbaerbel.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepteWithZutaten;
import com.example.rezeptebuchbaerbel.entity.Rezepte;
import com.example.rezeptebuchbaerbel.entity.Zutaten;

import java.util.List;

@Dao
public interface RezepteDAO {

    @Transaction
    @Insert
    public long insert(Rezepte rezepte);

    @Update
    public void update(Rezepte rezepte);

    @Delete
    public void delete(Rezepte rezepte);

    @Query("Select * From rezepte")
    public List<Rezepte> getRezeptes();

    @Query("Select * From rezepte")
    public List<KategorieWithRezepteWithZutaten> getKategorieWithRezepteWithZutatens();

    @Query("Update rezepte Set rezeptName=:rezeptName Where Id=:Id")
    public void updateRezeptname(long Id, String rezeptName);
}
