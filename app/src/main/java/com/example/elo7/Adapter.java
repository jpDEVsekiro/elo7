package com.example.elo7;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    private List<produto> data;
    Adapter(Context context, List<produto> data){
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.card_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        //pego os dados do data
       holder.nome.setText(data.get(i).getNome());
       holder.preço_antigo.setText(data.get(i).getPreço_anterios());
        holder.preço.setText(data.get(i).getPreço());
       holder.parcelas.setText(data.get(i).getParcelas());
       holder.cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //ação ao clicar no cardview
               Intent intent=new Intent(context,Web.class);
               intent.putExtra("name",data.get(i).getNome());
               intent.putExtra("url",data.get(i).get_link());
               context.startActivity(intent);

           }
       });

       Picasso.get().load(data.get(i).getPicture()).placeholder(R.drawable.logo).error(R.drawable.logo).into(holder.imgview, new Callback() {// carrego a imagem
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

    @Override
    public int getItemCount(){
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nome,preço_antigo,preço,parcelas;
        ImageView imgview;
        CardView cardView;

        public ViewHolder(@NonNull View itemView)  {
            super(itemView);
            cardView=(CardView) itemView.findViewById(R.id.produto);
            nome=itemView.findViewById(R.id.nome);
            preço_antigo=itemView.findViewById(R.id.preço_antigo);
            preço_antigo.setPaintFlags(preço_antigo.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            preço=itemView.findViewById(R.id.preço);
            parcelas=itemView.findViewById(R.id.parcelas);
            imgview =itemView.findViewById(R.id.img_produto);
        }
    }
}
