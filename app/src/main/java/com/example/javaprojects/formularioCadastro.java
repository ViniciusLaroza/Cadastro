package com.example.javaprojects;

import android.widget.CheckBox;

import com.google.android.material.textfield.TextInputEditText;

public class formularioCadastro {

    public formularioCadastro(String nomeCompleto, String telefone, String email,boolean ingressarEmail, String sexo, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.ingressarEmail = ingressarEmail;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    public formularioCadastro() {

    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isIngressarEmail() {
        return ingressarEmail;
    }

    public void setIngressarEmail(boolean ingressarEmail) {
        this.ingressarEmail = ingressarEmail;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "formularioCadastro{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", telefone='" + telefone + '\'' +
                ", Email=" + email +
                ", ingressarEmail=" + ingressarEmail +
                ", sexo='" + sexo + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }

    private String nomeCompleto;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    private boolean ingressarEmail;
    private String sexo;
    private String cidade;
    private String uf;

}
