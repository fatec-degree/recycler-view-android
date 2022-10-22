package br.com.fatec.recyclerviewpersonalizada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder> {

    List<FilmeDto> filmes;

    public MeuAdapter(ArrayList<FilmeDto> filmes) {
        this.filmes = filmes;
    }

    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.meu_adapter, parent, false);
        return new MeuViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {
        holder.textViewTitulo.setText(filmes.get(position).getTitulo());
        holder.textViewAno.setText(filmes.get(position).getAno());
        holder.textViewGenero.setText(filmes.get(position).getGenero());
        holder.textViewNota.setText(filmes.get(position).getNota());
        holder.imageViewCapa.setImageResource(filmes.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    protected class MeuViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitulo;
        private TextView textViewAno;
        private TextView textViewGenero;
        private TextView textViewNota;
        private ImageView imageViewCapa;

        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewAno = itemView.findViewById(R.id.textViewAno);
            textViewGenero = itemView.findViewById(R.id.textViewGenero);
            textViewNota = itemView.findViewById(R.id.textViewNota);
            imageViewCapa = itemView.findViewById(R.id.imageViewFilme);
        }
    }
}
