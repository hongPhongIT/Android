package com.example.phongnguyen.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    ArrayList<Frust> mListFrusts;

    public CustomAdapter(Context context, ArrayList<Frust> list){
        mContext = context;
        mListFrusts = list;
    }

    @Override
    public int getCount() {
        return mListFrusts.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View convert_View = inflater.inflate(R.layout.item_list_view_frust,null);
        TextView txt_name = (TextView)convert_View.findViewById(R.id.item_txt_name);
        TextView txt_description = (TextView)convert_View.findViewById(R.id.item_txt_description);
        ImageView imgv = (ImageView)convert_View.findViewById(R.id.item_img);

        txt_name.setText(mListFrusts.get(position).getName());
        txt_description.setText(mListFrusts.get(position).getDescription());
        imgv.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.ic_launcher_round));
        return convert_View;
    }
}
