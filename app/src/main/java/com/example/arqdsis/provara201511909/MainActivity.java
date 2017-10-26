package com.example.arqdsis.provara201511909;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.meuprimeiroapp.R;

/*Gustavo Justiniano Ortia RA: 201511909*/
public class MainActivity extends Activity {

    @Override
    /*Gustavo Justiniano Ortia RA: 201511909*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){

    }
    Intent intent = new Intent(this, ListaTabuada.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);

}
