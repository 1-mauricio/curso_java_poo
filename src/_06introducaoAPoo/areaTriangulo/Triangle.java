package _06introducaoAPoo.areaTriangulo;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

/*
    public - indica que o atributo ou metodo pode ser utilizado em outros atrquivos
    double - tipo do dado que o metodo retorna
 */
