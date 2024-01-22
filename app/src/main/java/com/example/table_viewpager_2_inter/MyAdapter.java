package com.example.table_viewpager_2_inter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<MyModel> myModelList;

    public MyAdapter(List<MyModel> myModelList) {
        this.myModelList = myModelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_galeria, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyModel model = myModelList.get(position);
        holder.imageView.setImageResource(model.getImageResId());
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return myModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        // Otros componentes de tu card_layout

        public MyViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            textView = view.findViewById(R.id.textView);
            // Inicializa los demás componentes de tu card_layout
        }
    }
}

