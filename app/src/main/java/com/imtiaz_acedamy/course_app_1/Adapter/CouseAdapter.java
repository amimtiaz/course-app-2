package com.imtiaz_acedamy.course_app_1.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.imtiaz_acedamy.course_app_1.Domain.CouseDomain;
import com.imtiaz_acedamy.course_app_1.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CouseAdapter extends RecyclerView.Adapter<CouseAdapter.ViewHolder> {
    ArrayList<CouseDomain> items;
    DecimalFormat formatter;
    Context context;

    public CouseAdapter(ArrayList<CouseDomain> items) {
        this.items = items;
        formatter = new DecimalFormat("###,###,###,###.##");
    }

    @NonNull
    @Override
    public CouseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_course, parent, false);
        context = parent.getContext();

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CouseAdapter.ViewHolder holder, int position) {
        holder.titleTxt.setText(items.get(position).getTitle());
        holder.ownerTxt.setText(items.get(position).getOwner());
        holder.priceTxt.setText( "$"+formatter.format(items.get(position).getPrice()));

        int drawableResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPicPath(),"drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);
        

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTxt, ownerTxt, priceTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            ownerTxt = itemView.findViewById(R.id.ownerTxt);
            priceTxt = itemView.findViewById(R.id.priceTxt);

            pic = itemView.findViewById(R.id.pic);
        }
    }
}
