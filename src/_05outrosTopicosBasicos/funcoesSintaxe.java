package _05outrosTopicosBasicos;

public class funcoesSintaxe {
    public static void main(String[] args) {
        int higher = max(10, 20, 30);

        showResult(higher);
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
             aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int value) {
        System.out.println("higher = " + value);
    }
}
