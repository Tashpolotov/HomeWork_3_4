package com.example.homework_3_4;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<teamViewHolder> {

        private ArrayList<String> names;
        private OnclickListener listener;

        public NameAdapter (ArrayList<String> names, OnclickListener listener){
            this.names = names;
            this.listener = listener;
        }


    @NonNull
    @Override
    public teamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new teamViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_club, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull teamViewHolder holder, int position) {
    holder.bind(names.get(position));

    holder.itemContainer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            listener.onItemClickListener(names.get(position));
        }
    });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
