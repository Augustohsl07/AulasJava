package org.example;

import org.example.contatodeAgenda.ContatoAgenda;
import org.example.estudoClassesEObjetos.Carro;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random cria = new Random();
        Carro car = new Carro("Van","BB",2);
        ContatoAgenda contatoAgenda = new ContatoAgenda();

        contatoAgenda.setNum(83991003);
        contatoAgenda.setNome("Audugot");

        System.out.println(contatoAgenda.getNome());
        System.out.println(contatoAgenda.getNum());

 /*       int[] num = new int[5];
        int[][] num2 = new int[4][5];
        for(int i=0; i < num2.length;i++){
            for(int j=0; j<num2[i].length;j++){
                System.out.println("Numero");
                num2[i][j]= ler.nextInt();

            }
            System.out.println("Valor do I:"+i);
        }
*/

        int num = 6;
        for(int i=0;i < 10;i++) {
            if (num == cria.nextInt(10)) {
                System.out.println(num);
            }
        }
    }
}