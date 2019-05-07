import java.util.ArrayList;

public class Main {
    public static void main (String[] ars){

        Punto punto = new Punto();
        Distancia distancia = new Distancia();
        ArrayList<Punto> misPuntos = punto.generarPuntos();

        System.out.println("================================");
        System.out.println("========PUNTOS GENERADOS========");
        System.out.println("================================");

        punto.mostrarPuntos(misPuntos);

        System.out.println("================================");
        System.out.println("===========DISTANCIAS===========");
        System.out.println("=================================");

        distancia.mostrarDistancias(distancia.calcularDistancia(misPuntos));

        System.out.println("=================================");
        System.out.println("=========PUNTOS CERCANOS=========");
        System.out.println("=================================");

        System.out.println("Los puntos más cercanos son:");
        distancia.mostrarDistancias(distancia.ordenarDistancias(distancia.calcularDistancia(misPuntos)));
    }
}
