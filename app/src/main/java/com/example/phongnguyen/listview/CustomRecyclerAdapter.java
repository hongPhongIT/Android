package com.example.phongnguyen.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.CustomViewHolder> {

    private List<Frust> mFrust;
    Context mContext;
    LayoutInflater inflater;

    public CustomRecyclerAdapter(List<Frust> mFrust, Context mContext){
        this.mFrust = mFrust;
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    public class CustomViewHolder  extends RecyclerView.ViewHolder{

        TextView tv_title;
        TextView tv_content;
        ImageView im_image;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.item_txt_name);
            tv_content = (TextView) itemView.findViewById(R.id.item_txt_description);
            im_image = (ImageView) itemView.findViewById(R.id.item_img);
        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_view_frust, parent,false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        holder.tv_title.setText(mFrust.get(position).getName());
        holder.tv_content.setText(mFrust.get(position).getDescription());
//        holder.im_image.setImageResource(mFrust.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mFrust.size();
    }

}
