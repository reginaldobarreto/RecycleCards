package br.com.barrsoft.recyclecards;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<VHProject> {


    private List<Modelo> modelList;

    @NonNull
    @Override
    public VHProject onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VHProject holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
