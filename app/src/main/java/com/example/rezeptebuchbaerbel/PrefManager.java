package com.example.rezeptebuchbaerbel;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class PrefManager {

    Context context;
    int mode = Context.MODE_PRIVATE;

    PrefManager(Context context){
        this.context = context;
    }

    public void saveListDetails(String ARRAY_LIST, String SHARED_PREFS, ArrayList<RoomÜbersicht> list) {

        SharedPreferences sharedPreferences = context.getSharedPreferences( SHARED_PREFS,mode );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(ARRAY_LIST,json);
        editor.apply();
    }

    public  ArrayList<RoomÜbersicht> getList(String ARRAY_LIST, String SHARED_PREFS) {

        ArrayList<RoomÜbersicht> list;

        SharedPreferences sharedPreferences = context.getSharedPreferences( SHARED_PREFS,mode );
        Gson gson = new Gson();
        String json = sharedPreferences.getString( ARRAY_LIST,null );
        Type type = new TypeToken<ArrayList<RoomÜbersicht>>(){}.getType();
        list = gson.fromJson( json,type );

        if (list==null){
            list = new ArrayList<RoomÜbersicht>(  );
        }
        return list;
    }
}
