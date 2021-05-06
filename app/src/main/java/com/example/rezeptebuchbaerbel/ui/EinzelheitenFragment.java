package com.example.rezeptebuchbaerbel.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.Rezepteingabe;
import com.example.rezeptebuchbaerbel.roomAlt.RoomÜbersicht;
import com.example.rezeptebuchbaerbel.dao.KategorienDAO;
import com.example.rezeptebuchbaerbel.database.DatabaseClass;
import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepte;

import java.util.ArrayList;
import java.util.List;

public class EinzelheitenFragment extends Fragment {
    View view;
    Activity activity;
    Context context;
    TextView ueberschrift, zutaten, anweisungen, sonstiges;
    ImageView imageView;
    String ueberschriftText, zutatenText, anweisungText, sonstigesText;
    Resources resources;

    ArrayList<RoomÜbersicht> listUebersicht = new ArrayList<RoomÜbersicht>();
    Bundle bundle;

    int uebersichtPosition, rezeptPosition, intBild;

    DatabaseClass databaseClass;
    List<KategorieWithRezepte> kategorieWithRezepteList;
    ArrayList<KategorieWithRezepte> kategorieWithRezepteArrayList = new ArrayList<>();

    KategorienDAO kategorienDAO;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_zutaten, container, false);
        activity = this.getActivity();
        context = this.getContext();
        bundle = this.getArguments();
        resources = getResources();
        ueberschrift = view.findViewById(R.id.listview_ueberschrift);
        imageView = view.findViewById(R.id.imgRezept);

        uebersichtPosition = bundle.getInt("übersichtPosition",0);
        rezeptPosition = bundle.getInt("rezeptPosition",0);

        listUebersicht = new Rezepteingabe().RezepteingabevonHand();

        zutaten = view.findViewById(R.id.txtZutaten);
        anweisungen = view.findViewById(R.id.txtAnweisung);
        sonstiges = view.findViewById(R.id.txtSonstiges);

        intBild = listUebersicht.get(uebersichtPosition).getBildname();
        zutatenText = listUebersicht.get(uebersichtPosition).roomRezeptes.get(rezeptPosition).zutaten;
        anweisungText = listUebersicht.get(uebersichtPosition).roomRezeptes.get(rezeptPosition).verarbeitung;
        sonstigesText = listUebersicht.get(uebersichtPosition).roomRezeptes.get(rezeptPosition).sonstiges;

        zutaten.setText(zutatenText);
        anweisungen.setText(anweisungText);
        sonstiges.setText(sonstigesText);
        imageView.setImageResource(intBild);
        zutaten.setMovementMethod(new ScrollingMovementMethod());
        anweisungen.setMovementMethod(new ScrollingMovementMethod());
        sonstiges.setMovementMethod(new ScrollingMovementMethod());

        ueberschriftText = listUebersicht.get(uebersichtPosition).roomRezeptes.get(rezeptPosition).nameRezepte;
        ueberschrift.setText(ueberschriftText);
        ueberschrift.setBackgroundColor(resources.getColor(R.color.colorToolbarZutaten,null));
        activity.setTitle("Zutaten");

        ((MainActivity) getActivity()).setToolbar(view.getId());
        return view;
    }

    public void loadRoom(){
        databaseClass = MainActivity.databaseClassMainActivity(context);
        kategorienDAO = databaseClass.createKategorienDAO();
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();

        kategorieWithRezepteArrayList = new ArrayList<>(kategorieWithRezepteList);

    }
}
