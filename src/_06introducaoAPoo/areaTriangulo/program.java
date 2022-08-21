package _06introducaoAPoo.areaTriangulo;

import _06introducaoAPoo.areaTriangulo.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale. setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle triangle;
        triangle = new Triangle();

        triangle.a = 10.2;
        triangle.b = 20.3;
        triangle.c = 12.5;

        System.out.println(triangle.area());
    }
}
