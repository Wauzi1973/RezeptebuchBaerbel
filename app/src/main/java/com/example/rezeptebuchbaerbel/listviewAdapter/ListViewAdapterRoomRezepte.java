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

public class ListViewAdapterRoomRezepte extends BaseAdapter {

    Context context;
    ArrayList<RoomUebersicht> listReszepte;
    LayoutInflater inflater;
    int uebersichtPosition;

    public ListViewAdapterRoomRezepte(int uebersichtPosition,Context context, ArrayList<RoomUebersicht> listReszepte){
        super();

        this.context = context;
        this.listReszepte = listReszepte;
        inflater = (LayoutInflater.from(context));
        this.uebersichtPosition = uebersichtPosition;
    }

    //    @Override
    public int getCount() {
        return listReszepte.get(uebersichtPosition).roomRezeptes.size();
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
        TextView txtViewÜbersicht;
        ImageView imageView;
    }

    //    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListViewAdapterRoomRezepte.ViewHolder holder;
        convertView = inflater.inflate(R.layout.listview_rezepte_item,null);

        if(position % 2 == 0 ){
            convertView.setBackgroundColor(Color.argb(100,200,200,200));
        } else {
            convertView.setBackgroundColor(Color.argb(50,200,200,150));
        }

        holder = new ListViewAdapterRoomRezepte.ViewHolder();
        holder.txtViewÜbersicht = convertView.findViewById(R.id.textViewRezepte);
        holder.imageView = convertView.findViewById(R.id.imgRezept);

        convertView.setTag(holder);

        holder.txtViewÜbersicht.setText(listReszepte.get(uebersichtPosition).roomRezeptes.get(position).nameRezepte);
        holder.imageView.setImageResource(listReszepte.get(uebersichtPosition).getBildname());

        return convertView;
    }
}
