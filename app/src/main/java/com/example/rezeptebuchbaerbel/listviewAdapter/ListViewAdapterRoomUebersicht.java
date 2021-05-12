package com.example.rezeptebuchbaerbel.listviewAdapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rezeptebuchbaerbel.R;
import com.example.rezeptebuchbaerbel.roomAlt.RoomUebersicht;

import java.util.ArrayList;

public class ListViewAdapterRoomUebersicht extends BaseAdapter{

    Context context;
    ArrayList<RoomUebersicht> listUebersicht;
    LayoutInflater inflater;
    int anzahlRezepte;
    String txtViewText;


    public ListViewAdapterRoomUebersicht(Context context, ArrayList<RoomUebersicht> listUebersicht){

        super();
        this.context = context;
        this.listUebersicht = listUebersicht;
        inflater = (LayoutInflater.from(context));
    }

//    @Override
    public int getCount() {
        return listUebersicht.size();
    }

//    @Override
    public Object getItem(int position) {
        return null;
    }

//    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView bild;
        TextView txtViewÜbersicht;
        TextView txtViewZusatz;
    }

//    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        holder = new ViewHolder();
        convertView = inflater.inflate(R.layout.listview_uebersicht_item,null);

        if(position % 2 == 0 ){
            convertView.setBackgroundColor(Color.argb(100,200,200,200));
        } else {
            convertView.setBackgroundColor(Color.argb(100,200,150,200));
        }

        anzahlRezepte = listUebersicht.get(position).roomRezeptes.size();

        txtViewText = String.valueOf(anzahlRezepte)+" Rezepte";


        holder.bild = convertView.findViewById(R.id.uebersichtsBild);
        holder.txtViewÜbersicht = convertView.findViewById(R.id.textViewKategorie);
        holder.txtViewZusatz = convertView.findViewById(R.id.textViewZusatz);
        convertView.setTag(holder);

        holder.bild.setImageResource(listUebersicht.get(position).bildname);
        holder.txtViewÜbersicht.setText(listUebersicht.get(position).nameUebersicht);
        holder.txtViewZusatz.setText(txtViewText);



        return convertView;
    }

}
