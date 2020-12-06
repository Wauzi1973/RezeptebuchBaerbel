package com.example.rezeptebuchbaerbel;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class ListViewAdapterRoomRezepte extends BaseAdapter {

    Context context;
    ArrayList<RoomÜbersicht> listReszepte;
    LayoutInflater inflater;
    int übersichtPosition;

    public ListViewAdapterRoomRezepte(int übersichtPosition,Context context, ArrayList<RoomÜbersicht> listReszepte){
        super();

        this.context = context;
        this.listReszepte = listReszepte;
        inflater = (LayoutInflater.from(context));
        this.übersichtPosition = übersichtPosition;
    }

    //    @Override
    public int getCount() {
        return listReszepte.get(übersichtPosition).roomRezeptes.size();
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

        convertView.setTag(holder);

        holder.txtViewÜbersicht.setText(listReszepte.get(übersichtPosition).roomRezeptes.get(position).nameRezepte);

        return convertView;
    }
}
