package com.example.arqdsis.provara201511909;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.usjt.meuprimeiroapp.R;

/*Gustavo Justiniano Ortia RA: 201511909*/
public class ListaTabuada extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tabuada);
        ArrayList<String> lista = Data.buscaClientes(chave);
        ArrayAdapter<String>
                adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView)
                findViewById(R.id.listview); listView.setAdapter(adapter);


/*Gustavo Justiniano Ortia RA: 201511909*/


        public void onItemClick(AdapterView<?> parent, View view, int position, long id){ {
            // manda para a tela de detalhe
            // Intent intent = new Intent(atividade, DetalheClienteActivity.class);
            // intent.putExtra(NOME, lista.get(position));
            startActivity(intent);
        }
    });


    }
}
