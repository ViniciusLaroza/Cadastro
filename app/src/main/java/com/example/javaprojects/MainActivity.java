package com.example.javaprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nomeCompleto;
    private TextInputEditText telefone;
    private TextInputEditText email;
    private CheckBox ingressarEmail;
    //private RadioButton sexo;
    private Button salvar;
    private Button limpar;
    private TextInputEditText cidade;
    private AutoCompleteTextView uf;
    private formularioCadastro formulario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        formulario = new formularioCadastro();

        nomeCompleto = findViewById(R.id.nomeCompleto);
        telefone = findViewById(R.id.telefone);
        email = findViewById(R.id.email);
        ingressarEmail = findViewById(R.id.checkbox);
        //sexo = findViewById(R.id.sexo);
        salvar = findViewById(R.id.botao_1);
        limpar = findViewById(R.id.botao_2);
        cidade = findViewById(R.id.cidade);
        uf  = findViewById(R.id.uf);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = nomeCompleto.getText().toString();
                String tel = telefone.getText().toString();
                String em = email.getText().toString();
                Boolean check = ingressarEmail.isChecked();
                String city = cidade.getText().toString();
                String estado = uf.getText().toString();

                formulario.setNomeCompleto(nome);
                formulario.setTelefone(tel);
                formulario.setEmail(em);
                formulario.setIngressarEmail(check);
                formulario.setCidade(city);
                formulario.setUf(estado);


                Toast.makeText(getApplicationContext(), formulario.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


}