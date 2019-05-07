import java.util.ArrayList;

public class Distancia {
    private String puntoA;
    private String puntoB;
    private double distanciaPuntos;

    public Distancia(String puntoA, String puntoB, double distanciaPuntos){
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.distanciaPuntos = distanciaPuntos;
    }
    public Distancia(){

    }

    public String getPuntoA() {
        return puntoA;
    }

    public String getPuntoB() {
        return puntoB;
    }

    public double getDistanciaPuntos() {
        return distanciaPuntos;
    }

    public void mostrarDistancias(ArrayList<Distancia> distanciasPuntos){
        for(int e = 0; e <distanciasPuntos.size();e++){
            Distancia miDistancia = distanciasPuntos.get(e);
            System.out.println(miDistancia.toString());
        }
    }

    public ArrayList<Distancia> calcularDistancia(ArrayList<Punto> puntoArrayList) {
        ArrayList<Distancia> distancias = new ArrayList();
        for(int a = 0; a <puntoArrayList.size();a++){
            for(int b = 0;b<puntoArrayList.size()-1;b++){
                if(a!=b){
                    int parteX1 = puntoArrayList.get(a).getX();
                    int parteX2 = puntoArrayList.get(b).getX();
                    int parteY1 = puntoArrayList.get(a).getY();
                    int parteY2 = puntoArrayList.get(b).getY();
                    int part1 =  parteX2 - parteX1;
                    int part2 = parteY2 - parteY1;
                    double distancia =Math.sqrt(part1*part1 + part2*part2);
                    distancias.add(new Distancia(puntoArrayList.get(a).toString(),puntoArrayList.get(b).toString(),distancia));
                }
            }

        }
        return distancias;
    }

    public ArrayList<Distancia> ordenarDistancias(ArrayList<Distancia> distanciasOrd){
        double menorDistancia = 0;
        String menorConPuntos= "";
        ArrayList<Distancia> miArray = new ArrayList();
        for(int z = 0; z < distanciasOrd.size(); z++) {
            for(int y = 0; y <distanciasOrd.size()-1;y++){
                if (distanciasOrd.get(z).getDistanciaPuntos()<distanciasOrd.get(y).getDistanciaPuntos()) {
                    menorDistancia = distanciasOrd.get(z).getDistanciaPuntos();
                }
            }
        }
        for(int z = 0; z < distanciasOrd.size(); z++) {
            if(menorDistancia>distanciasOrd.get(z).getDistanciaPuntos()){
                menorDistancia = distanciasOrd.get(z).getDistanciaPuntos();
                //menorConPuntos = distanciasOrd.get(z).toString()+"\nCon la distancia de: "+menorDistancia;
            }
        }
        for(int z = 0; z < distanciasOrd.size(); z++){
            if(distanciasOrd.get(z).getDistanciaPuntos()==menorDistancia){
                miArray.add(distanciasOrd.get(z));
            }
        }

        return miArray;
    }


    @Override
    public String toString() {
        return "Punto1: "+getPuntoA()+", Punto2: "+getPuntoB()+", Distancia: "+getDistanciaPuntos();
    }
}
