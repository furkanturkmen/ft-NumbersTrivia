package com.furkanturkmen.numberstrivia.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.furkanturkmen.numberstrivia.R;

public class RandomFactViewholder extends RecyclerView.ViewHolder {

    public TextView randomNumber;
    public TextView descriptiveText;

    public RandomFactViewholder(@NonNull View itemView) {
        super(itemView);
        this.randomNumber = itemView.findViewById(R.id.randomNumber);
        this.descriptiveText = itemView.findViewById(R.id.descriptiveText);
    }
}
