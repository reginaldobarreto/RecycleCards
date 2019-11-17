package br.com.barrsoft.recyclecards;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class VHProject extends RecyclerView.ViewHolder {

    @BindView(R.id.textViewTitle)
    public TextView iitle;
    @BindView(R.id.textViewSubTitle)
    public TextView subTitle;
    @BindView(R.id.textViewDescribe)
    public TextView descricao;
    @BindView(R.id.imageView)
    public ImageView imagem;
    @BindView(R.id.buttonCurtir)
    public Button curtir;
    @BindView(R.id.buttonComentar)
    public Button comentar;

    public VHProject(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this,itemView);
    }
}
