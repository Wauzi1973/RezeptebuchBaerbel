package com.example.rezeptebuchbaerbel.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.example.rezeptebuchbaerbel.entity.Zutaten;

import java.util.List;

@Dao
public interface ZutatenDAO {

    @Transaction
    @Insert
    public long insert(Zutaten zutaten);

    @Update
    public void update(Zutaten zutaten);

    @Delete
    public void delete(Zutaten zutaten);

    @Query("Select * From zutaten")
    public List<Zutaten> getZutatens();

    @Query("Update zutaten Set zutaten=:zutaten Where Id=:Id")
    public void updateZutaten(long Id, String zutaten);

    @Query("Update zutaten Set anweisung=:anweisung Where Id=:Id")
    public void updateAnweisung(long Id, String anweisung);

    @Query("Update zutaten Set sonstiges=:sonstiges Where Id=:Id")
    public void updateSonstiges(long Id, String sonstiges);
}
