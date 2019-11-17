package br.com.barrsoft.recyclecards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<VHProject> {


    private List<Modelo> list;

    @NonNull
    @Override
    public VHProject onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcardview,parent,false);
        return new VHProject(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHProject holder, int position) {
        Modelo modelo = list.get(position);
        holder.title.setText(modelo.getTitle());
        holder.subTitle.setText(modelo.getSubTitle());
        holder.descricao.setText(modelo.getDescricao());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
