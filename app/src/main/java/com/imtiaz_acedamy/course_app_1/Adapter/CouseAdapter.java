package com.imtiaz_acedamy.course_app_1.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.imtiaz_acedamy.course_app_1.Activity.CouseDetailsActivity;
import com.imtiaz_acedamy.course_app_1.Domain.CouseDomain;
import com.imtiaz_acedamy.course_app_1.R;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CouseAdapter extends RecyclerView.Adapter<CouseAdapter.ViewHolder> {
    ArrayList<CouseDomain> items;
    DecimalFormat formatter;
    Context context;
    public CouseAdapter(ArrayList<CouseDomain> items ) {
        this.items = items;

        formatter = new DecimalFormat("###,###,###,###.##");
    }

    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */

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
        holder.des.setText(items.get(position).getDes());
        holder.starTxt.setText((""+formatter.format(items.get(position).getStar())));
        holder.priceTxt.setText( "$"+formatter.format(items.get(position).getPrice()));


        holder.cardItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //CouseDetailsActivity.DESCRIPTION = holder.des.getText().toString();
                CouseDetailsActivity.OWNER_NAME = holder.ownerTxt.getText().toString();
                CouseDetailsActivity.TITLE = holder.titleTxt.getText().toString();
                CouseDetailsActivity.PRICE = holder.priceTxt.getText().toString();
                CouseDetailsActivity.RATEING = holder.starTxt.getText().toString();
                CouseDetailsActivity.DESCRIPTION = holder.des.getText().toString();

                Bitmap bitmap = ((BitmapDrawable) holder.pic.getDrawable()).getBitmap();
                CouseDetailsActivity.MY_BITMAP = bitmap;

                Intent intent = new Intent(context, CouseDetailsActivity.class);
                context.startActivity(intent);

            }


        });

        int drawableResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPicPath(),"drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);
        

    }

    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardItem;
        TextView titleTxt, ownerTxt, priceTxt, des, starTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
            ownerTxt = itemView.findViewById(R.id.ownerTxt);
            priceTxt = itemView.findViewById(R.id.priceTxt);
            des = itemView.findViewById(R.id.des);
            cardItem = itemView.findViewById(R.id.cardItem);
            starTxt = itemView.findViewById(R.id.starTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }


    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */
}
