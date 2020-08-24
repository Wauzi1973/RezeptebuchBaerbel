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
import com.example.rezeptebuchbaerbel.ListViewAdapterRoomÜbersicht;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.Rezepteingabe;
import com.example.rezeptebuchbaerbel.RoomÜbersicht;
import java.util.ArrayList;


public class  UebersichtFragment extends Fragment {
    View view;
    Activity activity;
    TextView überschrift;
    String überschriftText;
    ListView listView;
    Resources resources;

    ArrayList<RoomÜbersicht> listÜbersicht = new ArrayList<RoomÜbersicht>();
    ListViewAdapterRoomÜbersicht listViewAdapterRoomÜbersicht;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_uebersicht, container, false);
        listView = view.findViewById(R.id.listview_übersicht);
        activity = this.getActivity();
        überschrift = view.findViewById(R.id.listview_ueberschrift);

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

        überschriftText = resources.getString(R.string.menu_übersicht_überschrift);
        überschrift.setText(überschriftText);
        überschrift.setBackgroundColor(resources.getColor(R.color.colorToolbarÜbersicht,null));

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
}

