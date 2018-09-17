package com.example.nascimento.recycle1.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nascimento.recycle1.R;

import java.util.List;

public class ListagemAdapter extends RecyclerView.Adapter<ListagemAdapter.ListagemViewHolder>{

    private Context context;
    private List<String> data;

    public ListagemAdapter(Context context,List<String> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ListagemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_campanha, parent, false);

        return new ListagemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListagemViewHolder holder, int position) {
        String texto=data.get(position).toString();
        holder.textView.setText(texto);
    }

    @Override
    public int getItemCount() {
        Log.i("Tamanho", Integer.toString(data.size()));
        return data.size();
    }

    public class ListagemViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ListagemViewHolder(View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.ivfoto);
            textView=itemView.findViewById(R.id.txtDescricao);

        }
    }
}
