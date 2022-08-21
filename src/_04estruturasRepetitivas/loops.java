package _04estruturasRepetitivas;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // While
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);

        // For
        int n = sc.nextInt();
        soma = 0;
        for (int i = 0; i<n; i++) {
            x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);

        // do while
        char resp;
        do {
            System.out.println("Bom dia");
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp == 's');

        sc.close();
    }
}
