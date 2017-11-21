package br.usjt.arqdesis.aula15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText nome;
    public static final String CHAVE = "br.usjt.arqdesis.myapplcation3p1.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void buscarClientes(View view){
        nome = (EditText)findViewById(R.id.busca_nome_cliente);
        Intent intent = new Intent(this, Lista.class);
        String chave = nome.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }
}
