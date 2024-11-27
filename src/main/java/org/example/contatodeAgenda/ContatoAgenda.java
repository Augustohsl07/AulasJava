package org.example.contatodeAgenda;

import java.math.BigInteger;

public class ContatoAgenda {
    int num;
    String nome;

    StringBuilder trans = new StringBuilder();
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNum(int num){
        this.num = num;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNum(){
        return this.num;
    }

    public String retornaTudo(){
        return Integer.toString(getNum()) + getNome();
    }


}
