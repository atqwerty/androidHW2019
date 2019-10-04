package com.example.reddit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MainViewHolder> {
    private ArrayList<Post> data;

    private ItemClickListener itemClickListener;

    public RecyclerViewAdapter(ArrayList<Post> data, ItemClickListener itemClickListener) {
        super();
        this.data = data;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_row_data, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {
        holder.textViewDataSub.setText(data.get(position).subReddit);
        holder.textViewDataName.append(data.get(position).user);
        holder.textViewDataDate.append(data.get(position).postDate);
        holder.setItemClick(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewDataSub;
        private TextView textViewDataName;
        private TextView textViewDataDate;
//        private TextView textViewDataSub;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDataSub = itemView.findViewById(R.id.textViewDataSub);
            textViewDataName = itemView.findViewById(R.id.textViewDataName);
            textViewDataDate = itemView.findViewById(R.id.textViewDataDate);
        }

        public void setItemClick(final Post item) {
            textViewDataSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(item.subReddit, getAdapterPosition());
                    }
                }
            });
            textViewDataName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(item.user, getAdapterPosition());
                    }
                }
            });
        }
    }

    public interface ItemClickListener {

        void onItemClick(String item, int position);
    }
}
