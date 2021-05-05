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
import com.example.rezeptebuchbaerbel.roomAlt.RoomÜbersicht;

import java.util.ArrayList;

public class ListViewAdapterRoomÜbersicht extends BaseAdapter{

    Context context;
    ArrayList<RoomÜbersicht> listÜbersicht;
    LayoutInflater inflater;
    int anzahlRezepte;
    String txtViewText;


    public ListViewAdapterRoomÜbersicht(Context context, ArrayList<RoomÜbersicht> listÜbersicht){

        super();
        this.context = context;
        this.listÜbersicht = listÜbersicht;
        inflater = (LayoutInflater.from(context));
    }

//    @Override
    public int getCount() {
        return listÜbersicht.size();
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

        anzahlRezepte = listÜbersicht.get(position).roomRezeptes.size();

        txtViewText = String.valueOf(anzahlRezepte)+" Rezepte";


        holder.bild = convertView.findViewById(R.id.uebersichtsBild);
        holder.txtViewÜbersicht = convertView.findViewById(R.id.textViewKategorie);
        holder.txtViewZusatz = convertView.findViewById(R.id.textViewZusatz);
        convertView.setTag(holder);

        holder.bild.setImageResource(listÜbersicht.get(position).bildname);
        holder.txtViewÜbersicht.setText(listÜbersicht.get(position).nameÜbersicht);
        holder.txtViewZusatz.setText(txtViewText);



        return convertView;
    }

}
