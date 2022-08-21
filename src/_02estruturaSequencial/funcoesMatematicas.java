package _02estruturaSequencial;

public class funcoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); //raiz quadrada
        B = Math.pow(x, y); // x elevado a y
        C = Math.abs(y); //valor absoluto

        // funcao de bhaskara

        double delta = Math.pow(B, 2.0) - 4*A*C;

        double x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
        double x2 = (-B + Math.sqrt(delta)) / (2.0 * A);
    }
}
