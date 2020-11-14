package com.example.elo7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<String> data;

    Adapter(Context context, List<String> data){
        layoutInflater=LayoutInflater.from(context);
        this.data=data;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=layoutInflater.inflate(R.layout.card_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        String nome=data.get(i);
        holder.nome.setText(nome);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nome,preço_antigo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nome=itemView.findViewById(R.id.nome);
            preço_antigo=itemView.findViewById(R.id.preço_antigo);
        }
    }
}
