package com.furkanturkmen.numberstrivia.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.furkanturkmen.numberstrivia.R;
import com.furkanturkmen.numberstrivia.models.RandomFact;
import com.furkanturkmen.numberstrivia.viewholders.RandomFactViewholder;

import java.util.List;

public class RandomFactAdapter extends RecyclerView.Adapter<RandomFactViewholder> {

    private Context context;
    public List<RandomFact> listRandomFacts;

    public RandomFactAdapter(Context context, List<RandomFact> listRandomFacts) {
        this.context = context;
        this.listRandomFacts = listRandomFacts;
    }

    @NonNull
    @Override
    public RandomFactViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_grid,viewGroup,false);
        return new RandomFactViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RandomFactViewholder randomNumberViewHolder, int position) {

        System.out.println(position);
        final RandomFact randomNumberFact = listRandomFacts.get(position);
        randomNumberViewHolder.randomNumber.setText(randomNumberFact.getRandomNumber().toString());
        randomNumberViewHolder.descriptiveText.setText(randomNumberFact.getDescriptiveText().toString());


    }

    @Override
    public int getItemCount() {
        return listRandomFacts.size();
    }

    public void swapList (List<RandomFact> newList) {
        listRandomFacts = newList;
        if (newList != null) {
            // Force the RecyclerView to refresh
            this.notifyDataSetChanged();
        }
    }
}
