package _02estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); //input de dados

        String x;
        int y;
        double z;
        char a;

        System.out.print("Digite uma string: ");
        x = sc.next(); //texto

        System.out.print("Digite um inteiro: ");
        y = sc.nextInt(); //inteiro

        System.out.print("Digite uma double: ");
        z = sc.nextDouble(); //double, pega o locale do sistema

        System.out.print("Digite uma string: ");
        a = sc.next().charAt(0); // pega primeiro caracter

        System.out.println("string: " + x);
        System.out.printf("int: %d", y);
        System.out.println(z);
        System.out.println(a);

        // ler varios dados na mesma linha separados por espaco
        // entrada = Maria 30 4.5
        String b;
        int c;
        double d;

        b = sc.next();
        c = sc.nextInt();
        d = sc.nextDouble();

        // ler texto ate quebra de linha

        String s1,s2,s3;
        /*
            Bom dia
            Bom tarde
            Boa noite
         */

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        sc.close(); // quando o objeto sc nao for mais necessario
    }
}
