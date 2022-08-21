package _03estruturaCondicional;

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("x maior que 0");
        } else if (x < 0) {
            System.out.println("x menor que 0");
        } else {
            System.out.println("x igual a 0");
        }

        // operador ternario

        boolean condicao = (10 != 3) ? true : false;
        System.out.println(condicao);

        // switch case

        int z = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            default:
                dia = "comando indevido";
                break;
        }
    }
}
