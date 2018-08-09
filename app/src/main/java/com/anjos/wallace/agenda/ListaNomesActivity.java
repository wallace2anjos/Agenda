package com.anjos.wallace.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaNomesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_nomes);

        /*
        Até aqui, só colocamos uma lista vazia na nossa tela. Agora precisamos popular essa lista!
        Editaremos agora a classe ListaAlunosActivity e definiremos no método
        onCreate(...) quais são os dados que queremos mostrar na lista:
        */
        String[] alunos = {"Daniel", "Samuel", "Ozeias", "Joel"};
        /*
        Agora, como precisaremos manipular a lista que declaramos no xml de layout da nossa
        Activity, vamos guardar uma referência para a ListView:
        */
        ListView listaNomes = (ListView) findViewById(R.id.lvwNomes);
        /*
        Depois disso, precisaremos criar um ArrayAdapter que ficará responsável por
        converter os nossos alunos, que são do tipo String, para as View que serão exibidas
        pela ListView:
        */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        /*
        Para finalizar, só precisamos associar o ArrayAdapter com a ListView:
        */
        listaNomes.setAdapter(adapter);
    }
}
