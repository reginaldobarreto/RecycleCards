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


        modelo = new Modelo("Titulo Teste", "Sub Titulo","Descrição", getResources().getDrawable(R.drawable.image1));
        modelo1 = new Modelo("Titulo Teste", "Sub Titulo","Descrição", getResources().getDrawable(R.drawable.image2));
        modelo2 = new Modelo("Titulo Teste", "Sub Titulo","Descrição", getResources().getDrawable(R.drawable.image3));
        list.add(modelo);
        list.add(modelo1);
        list.add(modelo2);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

    }
}
