package br.com.barrsoft.recyclecards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    Adapter adapter;
    List<Modelo> list = new ArrayList<>();
    Modelo modelo;
    Modelo modelo1;
    Modelo modelo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        modelo = new Modelo("Sandra Bullock", "Atriz e produtora","andra Annette Bullock é uma atriz e produtora estadunidense. Ela chegou à fama na década de 1990 com papéis em filmes como Demolition Man, Speed, The Net, While You Were Sleeping, A Time to Kill, e Hope Floats. No novo milênio, Bullock estrelou Miss Congeniality, Two Weeks Notice, The Lake House, e o aclamado criticamente", getResources().getDrawable(R.drawable.image1));
        modelo1 = new Modelo("Jessica Chastain", "Atriz e modelo","essica Michelle Chastain é uma atriz norte-americana. Fez várias aparições em séries de televisão até sua estreia no cinema, no filme independente Jolene. Em 2011, Chastain recebeu atenção devido a seus papéis em filmes lançados naquele ano; por sua performance em The Help, ela recebeu indicação ao Óscar de Melhor Atriz Coadjuvante, Globo de Ouro, BAFTA e Screen Actors Guild Award. Em 2012, a revista Time a classificou como uma das \"100 Personalidades Mais Influentes do Mundo\".", getResources().getDrawable(R.drawable.image2));
        modelo2 = new Modelo("Marion Cotillard", "Atriz","Marion Cotillard é uma atriz francesa vencedora do Oscar, conhecida principalmente por estrelar os filmes Piaf - Um Hino ao Amor, A Origem, Meia-Noite em Paris, Ferrugem e Osso, Dois Dias, Uma Noite e Macbeth.", getResources().getDrawable(R.drawable.image3));
        list.add(modelo);
        list.add(modelo1);
        list.add(modelo2);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

    }
}
