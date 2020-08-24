package com.example.rezeptebuchbaerbel.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.Rezepteingabe;
import com.example.rezeptebuchbaerbel.RoomÜbersicht;
import java.util.ArrayList;

public class EinzelheitenFragment extends Fragment {
    View view;
    Activity activity;
    TextView überschrift;
    TextView zutaten;
    TextView anweisungen;
    TextView sonstiges;
    String überschriftText;
    String zutatenText;
    String anweisungText;
    String sonstigesText;
    Resources resources;

    ArrayList<RoomÜbersicht> listÜbersicht = new ArrayList<RoomÜbersicht>();
    Bundle bundle;

    int übersichtPosition;
    int rezeptPosition;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_zutaten, container, false);
        activity = this.getActivity();
        bundle = this.getArguments();
        resources = getResources();
        überschrift = view.findViewById(R.id.listview_ueberschrift);

        übersichtPosition = bundle.getInt("übersichtPosition",0);
        rezeptPosition = bundle.getInt("rezeptPosition",0);

        listÜbersicht = new Rezepteingabe().RezepteingabevonHand();

        zutaten = view.findViewById(R.id.txtZutaten);
        anweisungen = view.findViewById(R.id.txtAnweisung);
        sonstiges = view.findViewById(R.id.txtSonstiges);

        zutatenText = listÜbersicht.get(übersichtPosition).roomRezeptes.get(rezeptPosition).zutaten;
        anweisungText = listÜbersicht.get(übersichtPosition).roomRezeptes.get(rezeptPosition).verarbeitung;
        sonstigesText = listÜbersicht.get(übersichtPosition).roomRezeptes.get(rezeptPosition).sonstiges;

        zutaten.setText(zutatenText);
        anweisungen.setText(anweisungText);
        sonstiges.setText(sonstigesText);
        zutaten.setMovementMethod(new ScrollingMovementMethod());
        anweisungen.setMovementMethod(new ScrollingMovementMethod());
        sonstiges.setMovementMethod(new ScrollingMovementMethod());

        überschriftText = listÜbersicht.get(übersichtPosition).roomRezeptes.get(rezeptPosition).nameRezepte;
        überschrift.setText(überschriftText);
        überschrift.setBackgroundColor(resources.getColor(R.color.colorToolbarZutaten,null));
        activity.setTitle("Zutaten");

        ((MainActivity) getActivity()).setToolbar(view.getId());
        return view;
    }
}
