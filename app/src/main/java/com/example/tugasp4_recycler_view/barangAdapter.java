package com.example.tugasp4_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class barangAdapter extends RecyclerView.Adapter<barangAdapter.barangViewHolder>{
    private ArrayList<barang> dataList;
    public barangAdapter(ArrayList<barang> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public barangAdapter.barangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_barang, parent, false);
        return new barangViewHolder(view);
    }
    public void onBindViewHolder(barangViewHolder holder, int position) {
        holder.logo.setImageResource(dataList.get(position).getLogo());
        holder.txtbrand.setText(dataList.get(position).getBrand());
        holder.txttgl.setText(dataList.get(position).getTgl());
        holder.txtchat.setText(dataList.get(position).getChat());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class barangViewHolder extends RecyclerView.ViewHolder{
        private TextView txtbrand, txttgl, txtchat;
        private ImageView logo;
        public barangViewHolder(View itemView) {
            super(itemView);
            logo =  (ImageView) itemView.findViewById(R.id.img_logo);
            txtbrand = (TextView) itemView.findViewById(R.id.txt_brand);
            txttgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            txtchat = (TextView) itemView.findViewById(R.id.txt_chat);
        }
    }
}

