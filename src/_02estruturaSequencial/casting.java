package _02estruturaSequencial;

public class casting {
    public static void main(String[] args) {
        double a;
        int b;

        a = 5.0;
        b = (int) a; // casas decimais sao desprezadas

        System.out.println(b); // = 5
    }
}
