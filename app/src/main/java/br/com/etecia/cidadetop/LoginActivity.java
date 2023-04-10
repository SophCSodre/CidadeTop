package br.com.etecia.cidadetop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtSenha, edtEmail;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edtSenha = findViewById(R.id.edtSenha);
        edtEmail = findViewById(R.id.edtEmail);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, senha;
                email = edtEmail.getText().toString();
                senha = edtSenha.getText().toString();

                if (email.equals("admin") && senha.equals("1234")){
                    startActivity(new Intent(getApplicationContext(),
                            MenuActivity.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Usuario ou senha invalidos",
                            Toast.LENGTH_SHORT).show();
                    edtEmail.setText("");
                    edtSenha.setText("");
                    edtEmail.requestFocus();
                }
            }
        });
    }
}