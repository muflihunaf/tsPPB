package com.muflihundev.tspppb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {

    private List<Wisata> wisataList;

    public WisataAdapter(List<Wisata> wisataList) {
        this.wisataList = wisataList;
    }

    @NonNull
    @Override
    public WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wisata, parent, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataViewHolder holder, int position) {
        Wisata wisata = wisataList.get(position);
        holder.imageView.setImageResource(wisata.getImageRes());
        holder.textViewName.setText(wisata.getName());
    }

    @Override
    public int getItemCount() {
        return wisataList.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewName;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textViewName);
        }
    }
}

