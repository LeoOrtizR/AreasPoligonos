package ejemploareaspoligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemploAreasPoligonos {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    public static void main(String[] args) {
        mostrarInformacion();
        mostrarPoligonos();
    }
    
    public static void mostrarInformacion(){
    int opcion = 0;
        char respuesta;

        do {
            do {
                System.out.println("Que poligono desea realizar");
                System.out.println("1. Rectangulo");
                System.out.println("2. Triangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1: 
                            mostrarRectangulo();
                        break;
                    case 2: mostrarTriangulo();
                        break;
                }
            } while (opcion < 1 || opcion > 2);
            System.out.println("Desea realizar otro poligono? (s/n)");
            respuesta = entrada.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
    }
    
    public static void mostrarRectangulo(){
        double lado1;
        double lado2;
        System.out.println("Ingrese el lado 1 del Rectangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del Rectangulo");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
    }
    
    public static void mostrarTriangulo(){
        double lado1;
        double lado2;
        double lado3;
        System.out.println("Ingrese el lado 1 del Triangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del Triangulo");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del Triangulo");
        lado3 = entrada.nextDouble();
        Triangulo triangulo = new Triangulo(lado1,lado2, lado3);
        poligono.add(triangulo);
    }
    
    public static void mostrarPoligonos(){
        for(Poligono p : poligono){
            System.out.println(p.toString());
            System.out.println("Area = " + p.area());
            
        }
    }
}
