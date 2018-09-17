package com.example.nascimento.recycle1.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.nascimento.recycle1.Adapters.ListagemAdapter;
import com.example.nascimento.recycle1.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

     private RecyclerView listagem;
     private List<String> lista=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listagem=(RecyclerView) findViewById(R.id.rvListagem);

        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");
        lista.add("Quero doar :)");

        listagem.setAdapter(new ListagemAdapter(this,lista));
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        listagem.setLayoutManager(linearLayoutManager);



    }
}
