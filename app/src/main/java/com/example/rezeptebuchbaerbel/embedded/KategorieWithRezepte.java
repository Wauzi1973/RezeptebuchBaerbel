package com.example.rezeptebuchbaerbel.embedded;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.rezeptebuchbaerbel.entity.Kategorien;
import com.example.rezeptebuchbaerbel.entity.Rezepte;

import java.util.List;

public class KategorieWithRezepte {
    @Embedded
    public Kategorien kategorien;

    @Relation(
            parentColumn = "Id",
            entityColumn = "kategorieID",
            entity = Rezepte.class)
    public List<KategorieWithRezepteWithZutaten> kategorieWithRezeptes;


}
