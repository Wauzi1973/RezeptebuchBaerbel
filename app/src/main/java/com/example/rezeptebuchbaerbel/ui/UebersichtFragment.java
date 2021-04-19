package com.example.rezeptebuchbaerbel.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;
import com.example.rezeptebuchbaerbel.ListViewAdapterRoomÜbersicht;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.Rezepteingabe;
import com.example.rezeptebuchbaerbel.RoomÜbersicht;
import com.example.rezeptebuchbaerbel.dao.KategorienDAO;
import com.example.rezeptebuchbaerbel.dao.RezepteDAO;
import com.example.rezeptebuchbaerbel.dao.ZutatenDAO;
import com.example.rezeptebuchbaerbel.database.DatabaseClass;
import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepte;
import com.example.rezeptebuchbaerbel.entity.Kategorien;
import com.example.rezeptebuchbaerbel.entity.Rezepte;
import com.example.rezeptebuchbaerbel.entity.Zutaten;

import java.util.ArrayList;
import java.util.List;


public class  UebersichtFragment extends Fragment {
    View view;
    Activity activity;
    Context context;
    TextView ueberschrift;
    String ueberschriftText;
    ListView listView;
    Resources resources;

    ArrayList<RoomÜbersicht> listÜbersicht = new ArrayList<RoomÜbersicht>();
    ListViewAdapterRoomÜbersicht listViewAdapterRoomÜbersicht;

    DatabaseClass databaseClass;
    ArrayList<Kategorien> kategorienArrayList;
    List<Kategorien> kategorienList;
    List<KategorieWithRezepte> kategorieWithRezepteList;
    Kategorien kategorien;
    KategorienDAO kategorienDAO;
    RezepteDAO rezepteDAO;
    ZutatenDAO zutatenDAO;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_uebersicht, container, false);
        listView = view.findViewById(R.id.listview_übersicht);
        activity = this.getActivity();
        context = getContext();
        ueberschrift = view.findViewById(R.id.listview_ueberschrift);

        resources = getResources();

        listÜbersicht = new Rezepteingabe().RezepteingabevonHand();

        listViewAdapterRoomÜbersicht = new ListViewAdapterRoomÜbersicht(getActivity(),listÜbersicht);
        listView.setAdapter(listViewAdapterRoomÜbersicht);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                  onClickFragment(position);
            }
        });

        ueberschriftText = resources.getString(R.string.menu_übersicht_überschrift);
        ueberschrift.setText(ueberschriftText);
        ueberschrift.setBackgroundColor(resources.getColor(R.color.colorToolbarÜbersicht,null));

        ((MainActivity) getActivity()).setToolbar(view.getId());

    return  view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
activity.setTitle("Kategorien");

    }

    @Override
    public void onResume(){
        super.onResume();
    }



    public void onClickFragment(int position) {
        Fragment fragment = new RezepteFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("übersichtPosition",position);

        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(this.getId(),fragment)
                .addToBackStack(null)
                .commit();
    }

    private void loadRoom(){
        databaseClass = Room.databaseBuilder(context,DatabaseClass.class,"DatabaseRezepte")
                .allowMainThreadQueries()
                .build();

        kategorienDAO = databaseClass.createKategorienDAO();
        rezepteDAO = databaseClass.createRezepteDAO();
        zutatenDAO = databaseClass.createZutatenDAO();

        kategorienList = kategorienDAO.getKategoriens();
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();
/*
Damit wäre eine Kategorie mit Rezepte und Zutaten gespeichert.
        kategorienDAO.insert(new Kategorien(R.drawable.icon_hauptgerichte,"Hauptgericht"));
        rezepteDAO.insert(new Rezepte(kategorieWithRezepteList.get(0).kategorien.getId(),"Nudeln"));
        zutatenDAO.insert(new Zutaten(kategorieWithRezepteList.get(0).kategorieWithRezeptes.get(0).rezepte.getId(),"100g Butter\n","Machen","schön"));
*/
/*
So wird updates einzelner Daten gemacht.
        kategorienDAO.updateKategorie(kategorieWithRezepteList.get(0).kategorien.getId(),"Neuer Name auf Index 0");
        rezepteDAO.updateRezeptname(kategorieWithRezepteList.get(0).kategorieWithRezeptes.get(0).rezepte.getId(),"neuer Rezeptname in Kategorieindex 0 und Rezeptindex 0");
*/
        if (kategorieWithRezepteList.size() != 0) {
            // Das würde dann so im ListViewAdapter in die ListView ausgegeben.
            String kategorie = kategorieWithRezepteList.get(0).kategorien.getKategorie(); // get(0) Index für Kategorie
            String rezept = kategorieWithRezepteList.get(0).kategorieWithRezeptes.get(0).rezepte.getRezeptName();// get(0) Index für Kategorie ;get(0) Index Rezepte
            String zutaten = kategorieWithRezepteList.get(0).kategorieWithRezeptes.get(0).zutatens.get(0).getZutaten();// get(0) Index für Kategorie ;get(0) Index Rezepte ;get(0) immer =0!!!
            String anweisung = kategorieWithRezepteList.get(0).kategorieWithRezeptes.get(0).zutatens.get(0).getAnweisung();
            String sonstiges = kategorieWithRezepteList.get(0).kategorieWithRezeptes.get(0).zutatens.get(0).getSonstiges();

            Toast.makeText(context, ""+kategorie, Toast.LENGTH_SHORT).show();
        }
    }
}

