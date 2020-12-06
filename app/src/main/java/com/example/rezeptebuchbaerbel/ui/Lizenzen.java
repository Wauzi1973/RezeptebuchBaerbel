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


public class Lizenzen extends Fragment {

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
        view = inflater.inflate(R.layout.fragment_lizenzen,container,false);
        activity = this.getActivity();
        textView = view.findViewById(R.id.txtViewLizenzen);
        resources = getResources();
        toolbartxtView = view.findViewById(R.id.listview_ueberschrift);

        textView.setText(resources.getText(R.string.lizenzen));

        toolbarText = resources.getString(R.string.app_name);
        toolbarSchütze = resources.getString(R.string.menu_lizenzen_überschrift);

        toolbartxtView.setText(toolbarText);
        toolbartxtView.setBackgroundColor(resources.getColor(R.color.colorToolbarLizenzen,null));


        ((MainActivity) getActivity()).setToolbar(view.getId(),toolbarSchütze);
        view.refreshDrawableState();
        return view;
    }
}
