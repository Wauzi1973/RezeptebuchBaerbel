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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.example.rezeptebuchbaerbel.Rezepte.BackenRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.BrotaufstrichRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.CocktailRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.DipsRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.GrillenRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.HauptgerichteRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.KuchenRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.NachtischRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.SalateRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.SmoothieRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.SuppenRezepte;
import com.example.rezeptebuchbaerbel.Rezepte.VorspeiseRezepte;
import com.example.rezeptebuchbaerbel.entity.Rezepte;
import com.example.rezeptebuchbaerbel.entity.RezepteArray;
import com.example.rezeptebuchbaerbel.entity.Zutaten;
import com.example.rezeptebuchbaerbel.listviewAdapter.ListViewAdapterRoomÜbersicht;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.Rezepteingabe;
import com.example.rezeptebuchbaerbel.roomAlt.RoomÜbersicht;
import com.example.rezeptebuchbaerbel.dao.KategorienDAO;
import com.example.rezeptebuchbaerbel.dao.RezepteDAO;
import com.example.rezeptebuchbaerbel.dao.ZutatenDAO;
import com.example.rezeptebuchbaerbel.database.DatabaseClass;
import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepte;
import com.example.rezeptebuchbaerbel.entity.Kategorien;
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
    List<KategorieWithRezepte> kategorieWithRezepteList;
    ArrayList<KategorieWithRezepte> kategorieWithRezepteArrayList;
    ArrayList<Kategorien> kategoriens;
    ArrayList<Rezepte> rezeptes;
    ArrayList<Zutaten> zutatens;

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
loadRoom();
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
        databaseClass = MainActivity.databaseClassMainActivity(context);

        kategorienDAO = databaseClass.createKategorienDAO();
        rezepteDAO = databaseClass.createRezepteDAO();
        zutatenDAO = databaseClass.createZutatenDAO();
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();

        kategorienDAO.deleteAllKategorien();
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();

        kategoriens = new ArrayList<>();
        rezeptes = new ArrayList<>();
        zutatens = new ArrayList<>();

        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_hauptgerichte,"Hauptgerichte"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_salate,"Salate"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_suppe,"Suppen"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_backen,"Backen"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_kuchen,"Kuchen"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_dips,"Dips"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_grillen,"Grillen"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_nachtisch,"Nachtisch"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_brotaufstrich,"Brotaufstrich"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_vorspeise,"Vorspeise"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_smoothies,"Smoothie´s"));
        kategoriens.add(kategoriens.size(), new Kategorien(R.drawable.icon_smoothies,"Cocktail´s"));

        kategorienDAO.insertAllKategorien(kategoriens);
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();

        ArrayList<RezepteArray> rezepteArrayListHauptgerichte = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListSalate = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListSuppe = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListBacken = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListKuchen = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListDips = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListGrillen = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListNachtisch = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListBrotaufstrich = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListVorspeise = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListSmoothies = new ArrayList<>();
        ArrayList<RezepteArray> rezepteArrayListCocktails = new ArrayList<>();

        rezepteArrayListHauptgerichte = new HauptgerichteRezepte().Hauptgerichte();
        rezepteArrayListSalate = new SalateRezepte().Salate();
        rezepteArrayListSuppe = new SuppenRezepte().Suppen();
        rezepteArrayListBacken = new BackenRezepte().Backen();
        rezepteArrayListKuchen = new KuchenRezepte().Kuchen();
        rezepteArrayListDips = new DipsRezepte().Dips();
        rezepteArrayListGrillen = new GrillenRezepte().Grillen();
        rezepteArrayListNachtisch = new NachtischRezepte().Nachtisch();
        rezepteArrayListBrotaufstrich = new BrotaufstrichRezepte().Brotaufstrich();
        rezepteArrayListVorspeise = new VorspeiseRezepte().Vorspeise();
        rezepteArrayListSmoothies = new SmoothieRezepte().Smoothie();
        rezepteArrayListCocktails = new CocktailRezepte().Cocktail();

        ArrayList<ArrayList<RezepteArray>> rezepte = new ArrayList<>();
        rezepte.add(rezepte.size(),rezepteArrayListHauptgerichte);
        rezepte.add(rezepte.size(),rezepteArrayListSalate);
        rezepte.add(rezepte.size(),rezepteArrayListSuppe);
        rezepte.add(rezepte.size(),rezepteArrayListBacken);
        rezepte.add(rezepte.size(),rezepteArrayListKuchen);
        rezepte.add(rezepte.size(),rezepteArrayListDips);
        rezepte.add(rezepte.size(),rezepteArrayListGrillen);
        rezepte.add(rezepte.size(),rezepteArrayListNachtisch);
        rezepte.add(rezepte.size(),rezepteArrayListBrotaufstrich);
        rezepte.add(rezepte.size(),rezepteArrayListVorspeise);
        rezepte.add(rezepte.size(),rezepteArrayListSmoothies);
        rezepte.add(rezepte.size(),rezepteArrayListCocktails);

        int z = 0;
        for (int x = 0 ; x < kategorieWithRezepteList.size() ; x++){
            for (int y = 0 ; y < rezepte.get(x).size() ; y++){
                rezeptes.add(z, new Rezepte(kategorieWithRezepteList.get(x).kategorien.getId(),rezepte.get(x).get(y).getRezeptName()));
                z = z + 1;
            }
        }
        rezepteDAO.insertAllRezepte(rezeptes);
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();
        z = 0;
        for (int x = 0 ; x < kategorieWithRezepteList.size() ; x++){
            for (int y = 0 ; y < kategorieWithRezepteList.get(x).kategorieWithRezeptes.size() ; y++){
                int bild = rezepte.get(x).get(y).getRezeptBild();
                String zutaten = rezepte.get(x).get(y).getZutaten();
                String anweisung = rezepte.get(x).get(y).getAnweisung();
                String sonstiges = rezepte.get(x).get(y).getSonstiges();

                zutatens.add(z, new Zutaten(kategorieWithRezepteList.get(x).kategorieWithRezeptes.get(y).rezepte.getId(),bild,zutaten,anweisung,sonstiges));
                z = z + 1;
            }
        }
        zutatenDAO.insertAllZutaten(zutatens);
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();
        kategorieWithRezepteArrayList = new ArrayList<>(kategorieWithRezepteList);

    }
}

