package br.ufrn.eaj.tads.testedaltonismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();
        params.putInt("imagem", 1);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void onClick2(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();
        params.putInt("imagem", 2);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void onClick3(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();
        params.putInt("imagem", 3);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void verificar(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();

    }
}