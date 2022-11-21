package com.example.homework_3_4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class teamViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView;
    LinearLayout itemContainer;

    public teamViewHolder(@NonNull View itemView) {
        super(itemView);

            nameTextView = itemView.findViewById(R.id.club_tv);
            itemContainer = itemView.findViewById(R.id.container);

    }

    public void bind (String name){

        nameTextView.setText(name);
    }

}
