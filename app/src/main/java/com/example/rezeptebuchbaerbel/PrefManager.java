package com.example.rezeptebuchbaerbel;

import android.content.Context;
import android.widget.Toast;
import com.example.rezeptebuchbaerbel.embedded.KategorieWithRezepte;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class PrefManager {

    Context context;
    String myData;
    int mode = Context.MODE_PRIVATE;

    public PrefManager(Context context){
        this.context = context;
    }

    public void saveListDatabaseExtern(File myExternalFile, ArrayList<KategorieWithRezepte> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(myExternalFile);
            fos.write(json.getBytes());
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(context,"FileNotFound  "+e.getMessage(),Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(context,"IOException   "+e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }


    public ArrayList<KategorieWithRezepte> getListDatabaseExtern(File myExternalFile) {
        try {
            FileInputStream fis = new FileInputStream(myExternalFile);
            DataInputStream in = new DataInputStream(fis);
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(in));
            myData = br.readLine();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(context,"IOException   "+e.getMessage(),Toast.LENGTH_SHORT).show();
        }

        ArrayList<KategorieWithRezepte> list;
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<KategorieWithRezepte>>(){}.getType();
        list = gson.fromJson( myData,type );

        if (list==null){
            list = new ArrayList<>();
        }
        return list;
    }
}
