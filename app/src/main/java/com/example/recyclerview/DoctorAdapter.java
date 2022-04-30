package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder> {

    String data1[],data2[];
    int images[];
    Context context;

    public DoctorAdapter(Context ct, String s1[],String s2[],int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public DoctorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.doctor_item,parent,false);
        return new DoctorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorViewHolder holder, int position) {
        holder.name.setText(data1[position]);
        holder.role.setText(data2[position]);
        holder.image.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class DoctorViewHolder extends RecyclerView.ViewHolder{

        TextView name,role;
        ImageView image;

        public DoctorViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            role = itemView.findViewById(R.id.tv_role);
            image = itemView.findViewById(R.id.img_doctor);
        }
    }

}
