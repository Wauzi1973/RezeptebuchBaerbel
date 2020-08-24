package com.example.rezeptebuchbaerbel.ui;

import android.app.Activity;
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
import com.example.rezeptebuchbaerbel.ListViewAdapterRoomRezepte;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.Rezepteingabe;
import com.example.rezeptebuchbaerbel.RoomÜbersicht;
import java.util.ArrayList;

public class RezepteFragment extends Fragment {
View view;
Activity activity;
ListView listView;
TextView überschrift;
String überschriftText;
Bundle bundle;
int übersichtPosition;
Resources resources;

    ArrayList<RoomÜbersicht> listÜbersicht = new ArrayList<RoomÜbersicht>();
    ListViewAdapterRoomRezepte listViewAdapterRoomRezepte;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_rezepte, container, false);
        listView = view.findViewById(R.id.listview_rezepte);
        activity = this.getActivity();
        überschrift = view.findViewById(R.id.listview_ueberschrift);
        resources = getResources();

        bundle = this.getArguments();
        übersichtPosition = bundle.getInt("übersichtPosition",0);

        listÜbersicht = new Rezepteingabe().RezepteingabevonHand();

        listViewAdapterRoomRezepte = new ListViewAdapterRoomRezepte(übersichtPosition,getActivity(),listÜbersicht);
        listView.setAdapter(listViewAdapterRoomRezepte);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                onClickFragment(position);
            }
        });

        überschriftText = listÜbersicht.get(übersichtPosition).nameÜbersicht;
        überschrift.setText(überschriftText);
        überschrift.setBackgroundColor(resources.getColor(R.color.colorToolbarRezepte,null));
        activity.setTitle("Rezepte");

        ((MainActivity) getActivity()).setToolbar(view.getId());
  return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
 @Override
 public void onResume(){
        super.onResume();
 }

    public void onClickFragment(int position) {
        Fragment fragment = new EinzelheitenFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("übersichtPosition",übersichtPosition);
        bundle.putInt("rezeptPosition",position);
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(this.getId(),fragment)
                .addToBackStack(UebersichtFragment.class.getName())
                .commit();
    }
}
