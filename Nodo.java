
import java.util.ArrayList;

/**
 *
 * @author Ignacio Diaz Romero
 */

//(G,L,O,C)
//1 = Izquierda
//0 = Derecha

public class Nodo {
    int[] estado;
    String estadoS;
    ArrayList<Nodo> hijos = new ArrayList<>();
    Nodo padre ;
    String operador = "";


    
    public Nodo(int[] d){
        this.estado=d;
        this.estadoS = this.toString();
    }

    public Nodo(int[] d, Nodo padre,String x){
        this.estado=d;
        this.estadoS = this.toString();
        this.padre=padre;
        this.operador=x;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    @Override
    public String toString(){
        String x = "(";
        for(int i:estado)
            x+= Integer.toString(i);
        x+=")";
        return x;
    }
    
    
    public int[] getEstado(){
       return this.estado;
    }

    public ArrayList getHijos() {
        return this.hijos;
    }

    public void setHijos(ArrayList<Nodo> h) {
        this.hijos = h;
    }
    
    public void correguir(){
        int j=0;
        for(int i=1; i < 4; i++,j++)
            this.estado[j]=Character.getNumericValue(this.estadoS.charAt(i));
            
    }
    


    

}
    

