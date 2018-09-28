package com.example.alejandro.act1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class ClasesAdapter extends RecyclerView.Adapter<ClasesAdapter.ViewHolder> {
    ArrayList<Clases> clases;

    public ClasesAdapter(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.clase_layout, null);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.texViewClassName.setText(clases.get(position).getClassName());
        holder.textViewHorario.setText(clases.get(position).getHora());
    }

    @Override
    public int getItemCount() {
        return clases.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView texViewClassName;
        TextView textViewHorario;

        public ViewHolder(View v) {
            super(v);
            this.texViewClassName = v.findViewById(R.id.textViewClassName);
            this.textViewHorario = v.findViewById(R.id.textViewHorario);
        }
    }
}
