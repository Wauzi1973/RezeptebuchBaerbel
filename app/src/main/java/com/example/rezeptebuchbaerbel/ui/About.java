package com.example.rezeptebuchbaerbel.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.R;


public class About extends Fragment {

    View view;
    Activity activity;
    TextView textView;
    Resources resources;
    TextView toolbartxtView;
    String toolbarText;
    String toolbarSchütze;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_about,container,false);
        activity = this.getActivity();
        textView = view.findViewById(R.id.txtViewAbout);
        resources = getResources();
        toolbartxtView = view.findViewById(R.id.listview_ueberschrift);

        textView.setText(resources.getText(R.string.about));

        toolbarText = resources.getString(R.string.app_name);
        toolbarSchütze = resources.getString(R.string.menu_about_überschrift);

        toolbartxtView.setText(toolbarText);
        toolbartxtView.setBackgroundColor(resources.getColor(R.color.colorToolbarImpressum,null));


        ((MainActivity) getActivity()).setToolbar(view.getId(),toolbarSchütze);
        view.refreshDrawableState();
        return view;
    }
}
