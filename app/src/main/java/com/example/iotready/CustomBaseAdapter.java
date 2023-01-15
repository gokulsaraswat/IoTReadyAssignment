package com.example.iotready;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String Data[];
    String Values[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx , String [] Data , String [] Values){
        this.context = ctx;
        this.Data = Data;
        this.Values = Values;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return Data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_data_list , null);
        TextView txtd = (TextView) view.findViewById(R.id.textdatapresent);
        TextView txtv = (TextView) view.findViewById(R.id.textvaluepresent);
        txtd.setText(Data[i]);
        txtv.setText(Values[i]);
        return view;
    }
}
