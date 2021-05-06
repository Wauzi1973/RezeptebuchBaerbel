package com.example.rezeptebuchbaerbel.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rezeptebuchbaerbel.BuildConfig;
import com.example.rezeptebuchbaerbel.MainActivity;
import com.example.rezeptebuchbaerbel.PrefManager;
import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.dao.KategorienDAO;
import com.example.rezeptebuchbaerbel.database.DatabaseClass;
import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepte;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShareFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShareFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    Activity activity;
    Context context;
    Button rezepte_save_handy, rezepte_save_sd , rezepte_save_googledrive;
    Button rezepte_get_handy, rezepte_get_sd , rezepte_get_googledrive;

    KategorienDAO kategorienDAO;
    List<KategorieWithRezepte> kategorieWithRezepteList;
    ArrayList<KategorieWithRezepte> kategorieWithRezepteArrayList;
    private final String filenameRezepte = "Rezepte.db";
    private final String foldername = "Rezepte";

    boolean sdCard;
    String myData;

    File myExternalFileRezepteHandy;
    File myExternalFileRezepteSD;
    File myExternalFileRezepteGoogle;

    File file;

    File myInternalFile;
    File myExternalFile;

    private static final int WRITE_PERMISSION_CODE = 1;
    private static final int MANAGE_PERMISSION_CODE = 2;
    private static final int Clear_PERMISSION_CODE = 999;

    String externalPathRezepte;
    DatabaseClass databaseClass;
    TextView pfadRezepte;

    public ShareFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShareFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShareFragment newInstance(String param1, String param2) {
        ShareFragment fragment = new ShareFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_share, container, false);
        context = getContext();
        activity = getActivity();
        pfadRezepte = view.findViewById(R.id.txtViewPfadRezepte);

        rezepte_save_handy = view.findViewById(R.id.rezepte_save_handy);
        rezepte_get_handy = view.findViewById(R.id.rezepte_get_handy);
        rezepte_save_sd = view.findViewById(R.id.rezepte_save_sd);
        rezepte_get_sd = view.findViewById(R.id.rezepte_get_sd);
        rezepte_save_googledrive = view.findViewById(R.id.rezepte_save_googledrive);
        rezepte_get_googledrive = view.findViewById(R.id.rezepte_get_googledrive);
loadRoom();
        rezepte_save_handy.setOnClickListener(this);
        rezepte_get_handy.setOnClickListener(this);

        final File[] sdKarte = ContextCompat.getExternalFilesDirs(context, null);
        ArrayList<String> extRootPathsRezepte = new ArrayList<>();

        for (int i=0; i < sdKarte.length; i++) {
            extRootPathsRezepte.add(sdKarte[i].getParent() + "/" + foldername);
        }

//--Ordner für die Datensicherung erstellen---------------------------------------------------------
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (!Environment.isExternalStorageManager()) {
                Uri uri = Uri.parse("package:" + BuildConfig.APPLICATION_ID);
                Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION, uri);
                startActivity(intent);
            }
            createDirectory(foldername);
            file = new File(Environment.getExternalStorageDirectory(),foldername);
            myExternalFileRezepteHandy = new File(file,filenameRezepte);

        } else {
            int index = 0;
            if (sdKarte[index].canWrite() && sdKarte[index].exists()) {
                File f = new File(extRootPathsRezepte.get(index));
                try {
                    if (!f.exists()) {
                        boolean wasSuccessful = f.mkdirs();
                        if (wasSuccessful) {
                            Toast.makeText(context, "Ordner wurde auf dem Handy erstellt. \nGilt bis Android 10", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(context, "Wauzi kontaktieren", Toast.LENGTH_LONG).show();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(context, "" + e.getMessage(), Toast.LENGTH_LONG).show();
                    Toast.makeText(context, "Hier ist was falsch", Toast.LENGTH_LONG).show();
                }
            }
            externalPathRezepte = extRootPathsRezepte.get(index)+ "/" + filenameRezepte;
            
            myExternalFileRezepteHandy = new File(externalPathRezepte);
        }
//--------------------------------------------------------------------------------------------------
        startPermission(context);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        updateView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rezepte_save_handy:
                new PrefManager(context).saveListDatabaseExtern(myExternalFileRezepteHandy,kategorieWithRezepteArrayList);
                updateView();
                if(sdCard){
                    Toast.makeText(context,"Lohnabrechnungen auf SD Karte gespeichert",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context,"Lohnabrechnungen auf Handy gespeichert",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rezepte_get_handy:
//                kategorieWithRezepteArrayList = new PrefManager(context).getListDatabaseExtern(myExternalFileRezepteHandy);
                updateView();
        }
    }

    private void createDirectory(String folderName) {
        File file = new File(Environment.getExternalStorageDirectory(),folderName);
        try {
            if (!file.exists()) {
                boolean wasSuccessful = file.mkdirs();
                if (wasSuccessful){
                    Toast.makeText(context, "Ordner wurde von Wauzi erstellt. \nGilt ab Android 11", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(context, "Verwaltung aller Dateien NICHT zugelassen. Du böser.", Toast.LENGTH_LONG).show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateView(){
        if (MainActivity.checkPermission(context)) {
            if (myExternalFileRezepteHandy.exists()) {
                rezepte_get_handy.setEnabled(true);
            } else {
                rezepte_get_handy.setEnabled(false);
            }
        }
    }

    private void startPermission(Context context){
        MainActivity.checkPermission(activity,context,WRITE_EXTERNAL_STORAGE,WRITE_PERMISSION_CODE);

        askAllPermission();

        if (MainActivity.checkPermission(context)){
            rezepte_save_handy.setEnabled(true);
            sdCard = false;
            pfadRezepte.setText("Der Pfad zur Datei wäre\n"+myExternalFileRezepteHandy.toString().replace("/storage/emulated/0/","Interner Speicher/"));

        } else {
            Toast.makeText(context,"Zum speichern und laden muss die Berechtigung\n" +
                    "für den Zugriff auf Fotos, Medien und Dateien\n" +
                    "in den Einstellungen erlaubt sein!!!",Toast.LENGTH_LONG).show();
            rezepte_save_handy.setEnabled(false);
            sdCard = false;
        }

        rezepte_save_sd.setEnabled(false);
        rezepte_save_googledrive.setEnabled(false);
        rezepte_get_sd.setEnabled(false);
        rezepte_get_googledrive.setEnabled(false);
    }

    private void askAllPermission() {
        //Zugriff auf alle Dateien zulassen
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (!Environment.isExternalStorageManager()) {
                Uri uri = Uri.parse("package:" + BuildConfig.APPLICATION_ID);
                Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION, uri);
                startActivity(intent);
            }
        }
    }

    public void loadRoom(){
        databaseClass = MainActivity.databaseClassMainActivity(context);
        kategorienDAO = databaseClass.createKategorienDAO();
        kategorieWithRezepteList = kategorienDAO.getKategorieWithRezeptens();
        kategorieWithRezepteArrayList = new ArrayList<>(kategorieWithRezepteList);
    }
}