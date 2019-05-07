import java.util.ArrayList;

public class Punto {
    private int x;
    private int y;
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto(){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<Punto> generarPuntos(){
        ArrayList<Punto> misPuntos = new ArrayList<>();
        for(int i =0;i<10;i++){
            int numX = (int) Math.floor(Math.random()*10);
            int numY = (int) Math.floor(Math.random()*10);
            Punto punto = new Punto(numX,numY);
            misPuntos.add(punto);
        }
        return misPuntos;
    }

    public void mostrarPuntos(ArrayList<Punto> misPunto){
        for(int k = 0; k <10;k++){
            Punto puntito = misPunto.get(k);
            System.out.println(puntito.toString());
        }
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
