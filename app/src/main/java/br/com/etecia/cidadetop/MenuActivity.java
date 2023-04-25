package br.com.etecia.cidadetop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuActivity extends AppCompatActivity {

    CardView card_policia, card_perfil, card_documentos, card_dicas, card_sobre, card_contato;

    MaterialToolbar toolbar;

    @SuppressLint("MissingInFlatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        card_policia = findViewById(R.id.card_policia);
        card_perfil = findViewById(R.id.card_perfil);
        card_documentos = findViewById(R.id.card_documentos);
        card_dicas = findViewById(R.id.card_dicas);
        card_sobre = findViewById(R.id.card_sobre);
        card_contato = findViewById(R.id.card_contato);

        toolbar = findViewById(R.id.ToolbarMenu);
        setSupportActionBar(toolbar);

        card_policia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PoliciaActivity.class));
            }
        });

        card_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PerfilActivity.class));
            }
        });

        card_documentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DocumentosActivity.class));
            }
        });

        card_dicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DicasActivity.class));
            }
        });

        card_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SobreActivity.class));
            }
        });

        card_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ContatoActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mLogin:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
                break;
            case R.id.mSobre:
                startActivity(new Intent(getApplicationContext(), SobreActivity.class));
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}