package com.example.assignmentrecyclerview.models;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignmentrecyclerview.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private ArrayList<DataModel> dataSet;

    public Adapter(ArrayList<DataModel> dataSet){
        this.dataSet=dataSet;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView textCharacterName;
        TextView textCharacterDescription;
        ImageView CharacterImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.CardLayoutRes);
            textCharacterName = itemView.findViewById(R.id.textCharacterName);
            textCharacterDescription = itemView.findViewById(R.id.textCharacterDescription);
            CharacterImage = itemView.findViewById(R.id.CharacterImage);
        }


    }

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position){
        TextView textViewCName = holder.textCharacterName;
        TextView textViewCDesc = holder.textCharacterDescription;
        ImageView imageCharacterImage = holder.CharacterImage;

        textViewCName.setText(dataSet.get(position).getcName());
        textViewCDesc.setText(dataSet.get(position).getcDesc());
        imageCharacterImage.setImageResource(dataSet.get(position).getImage());
    }

    @Override
    public int getItemCount() {return dataSet.size();}
}
