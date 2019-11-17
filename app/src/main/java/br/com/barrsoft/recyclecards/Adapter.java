package br.com.barrsoft.recyclecards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<VHProject> {


    private List<Modelo> list;

    Adapter(List<Modelo> list) {
        this.list = list;
    }

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
        Glide
                .with(holder.itemView)
                .load(modelo.getDrawable())
                .centerCrop()
                .into(holder.imagem);

        holder.comentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.curtir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
