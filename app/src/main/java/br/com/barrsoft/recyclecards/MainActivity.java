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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        modelo = new Modelo("Titulo Teste", "Sub Titulo","Descrição", getResources().getDrawable(R.drawable.image1));
        list.add(modelo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

    }
}
