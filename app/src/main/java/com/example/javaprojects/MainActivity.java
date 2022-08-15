package com.example.javaprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nomeCompleto;
    private TextInputEditText telefone;
    private TextInputEditText email;
    private CheckBox ingressarEmail;
    private RadioGroup sexo;
    private Button salvar;
    private Button limpar;
    private TextInputEditText cidade;
    private AutoCompleteTextView uf;
    private formularioCadastro formulario;
    private Spinner spinneruf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        formulario = new formularioCadastro();

        nomeCompleto = findViewById(R.id.nomeCompleto);
        telefone = findViewById(R.id.telefone);
        email = findViewById(R.id.email);
        ingressarEmail = findViewById(R.id.checkbox);
        sexo = findViewById(R.id.radioB);
        salvar = findViewById(R.id.botao_1);
        limpar = findViewById(R.id.botao_2);
        cidade = findViewById(R.id.cidade);
        spinneruf = (Spinner) findViewById(R.id.spinnerUF);

        String[] lsUf = getResources().getStringArray(R.array.lista_uf);
        spinneruf.setAdapter(new ArrayAdapter<String>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lsUf));

        sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(R.id.rb_1 == i){
                    formulario.setSexo("Masculino");
                }else {
                    formulario.setSexo("Feminino");
                }
            }
        });

        spinneruf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                formulario.setUf(adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = nomeCompleto.getText().toString();
                String tel = telefone.getText().toString();
                String em = email.getText().toString();
                Boolean check = ingressarEmail.isChecked();
                String city = cidade.getText().toString();

                formulario.setNomeCompleto(nome);
                formulario.setTelefone(tel);
                formulario.setEmail(em);
                formulario.setIngressarEmail(check);
                formulario.setCidade(city);

                Toast.makeText(getApplicationContext(), formulario.toString(), Toast.LENGTH_LONG).show();
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario.setNomeCompleto(null);
                formulario.setTelefone(null);
                formulario.setEmail(null);
                formulario.setCidade(null);
                formulario.setIngressarEmail(false);

                nomeCompleto.setText("");
                telefone.setText("");
                email.setText("");
                ingressarEmail.setChecked(false);
                cidade.setText("");

                nomeCompleto.requestFocus();
            }
        });
    }


}