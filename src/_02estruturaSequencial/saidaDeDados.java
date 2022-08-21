package _02estruturaSequencial;

import java.util.Locale;

public class saidaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // configurar local padrao
        /*
        System.out.print("Sem quebra de linha");
        System.out.println("Com quebra de linha");
        */

        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f\n", x); // utilizado para printar com formatacao
        //%.2f - formatacao para duas casas decimais
        // %n ou \n- quebra de linha

        //Concatenacao
        System.out.println("Resultado = " + x + " Metros"); // usando +
        System.out.printf("Resultado = %.2f Metros\n", x); // usando formatacao

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
        /*
            %f - ponto flutuante
            %d - inteiro
            %s = texto
            %n - quebra de linha
         */


    }
}
