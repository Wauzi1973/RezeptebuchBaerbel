package com.example.rezeptebuchbaerbel.embedded;

import androidx.room.Embedded;
import androidx.room.Relation;
import com.example.rezeptebuchbaerbel.entity.Rezepte;
import com.example.rezeptebuchbaerbel.entity.Zutaten;

import java.util.List;

public class KategorieWithRezepteWithZutaten {
    @Embedded
    public Rezepte rezepte;

    @Relation(
            parentColumn = "Id",
            entityColumn = "zutatenID",
            entity = Zutaten.class)
    public List<Zutaten> zutatens;
}
