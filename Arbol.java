
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Ignacio Diaz Romero
 */
public class Arbol {
    Nodo inicial,estadoFinal;
    String caminoProfundidad,caminoAnchura;
      
    ArrayList<String> cerradosP = new ArrayList<>();
    ArrayList<String> caminoP = new ArrayList<>();
    
    ArrayList<String> cerradosA = new ArrayList<>();
    ArrayList<String> caminoA = new ArrayList<>();
    
    Stack<Nodo> profundidad = new Stack();
    Queue<Nodo> anchura = new LinkedList();
    
    Stack<String> operadores = new Stack();
    
    public Arbol(Nodo estadoInicial,Nodo estadoFinal) {
        this.inicial = estadoInicial;
        this.estadoFinal = estadoFinal;
    }
    
    
    
    public Nodo getRaiz(){
       return inicial;
    }

   
    
    public void busquedaProfundidad(Nodo primero,Nodo ultimo){
        if(cerradosP.isEmpty())
            cerradosP.add(primero.estadoS);
        
        if(!caminoP.contains(primero.estadoS))
            caminoP.add(primero.estadoS);       
        
        Nodo sG=soloGranjero(primero.estado.clone());
        Nodo gL=granjeroLobo(primero.estado.clone());        
        Nodo gO=granjeroOveja(primero.estado.clone());        
        Nodo gC=granjeroCol(primero.estado.clone());
        
        if(primero.estadoS.equals(ultimo.estadoS) ){
           caminoProfundidad=imprimePadres(primero);
            System.out.println(caminoProfundidad + "\n" + imprimeOperadores(primero));
        }    
        else{
                      
            if(!cerradosP.contains(gC.estadoS)){ //OPERADOR GRANJERO-COL
                gC=new Nodo(gC.estado,primero,"granjeroCol");
                primero.hijos.add(gC);
                cerradosP.add(gC.estadoS);
            }
            if(!cerradosP.contains(gO.estadoS)){//OPERADOR GRANJERO-OVEJA
                gO=new Nodo(gO.estado,primero,"granjeroOveja");
                primero.hijos.add(gO);
                cerradosP.add(gO.estadoS);
            }
            if(!cerradosP.contains(gL.estadoS)){//OPERADOR GRANJERO-LOBO
                gL=new Nodo(gL.estado,primero,"granjeroLobo");
                primero.hijos.add(gL);
                cerradosP.add(gL.estadoS);
            }
            
            if(!cerradosP.contains(sG.estadoS)){//OPERADOR SOLO-GRANJERO
                sG=new Nodo(sG.estado,primero,"soloGranjero");
                primero.hijos.add(sG);
                cerradosP.add(sG.estadoS);
            }

            profundidad.addAll(primero.hijos);

           busquedaProfundidad(profundidad.pop(), ultimo);
        } 
        
    }
    
    public void busquedaAnchura(Nodo primero,Nodo ultimo){
        
        if(cerradosA.isEmpty())
            cerradosA.add(primero.estadoS);
        
        if(!caminoA.contains(primero.estadoS))
            caminoA.add(primero.estadoS);
        
        Nodo sG=soloGranjero(primero.estado.clone());
        Nodo gL=granjeroLobo(primero.estado.clone());        
        Nodo gO=granjeroOveja(primero.estado.clone());        
        Nodo gC=granjeroCol(primero.estado.clone());

        if(primero.estadoS.equals(ultimo.estadoS) ){
            caminoAnchura=imprimePadres(primero);
            System.out.println(caminoAnchura + "\n" + imprimeOperadores(primero)+ "\n" + cerradosA.toString());
        }
        else{   
            if(!cerradosA.contains(sG.estadoS) ){//OPERADOR SOLO-GRANJERO
                sG=new Nodo(sG.estado,primero,"soloGranjero");
                primero.hijos.add(sG);
                cerradosA.add(sG.estadoS);
            }
            
            if(!cerradosA.contains(gL.estadoS) ){//OPERADOR GRANJERO-LOBO
                gL=new Nodo(gL.estado,primero,"granjeroLobo");
                primero.hijos.add(gL);
                cerradosA.add(gL.estadoS);
            }
            if(!cerradosA.contains(gO.estadoS) ){//OPERADOR GRANJERO-OVEJA
                gO=new Nodo(gO.estado,primero,"granjeroOveja");
                primero.hijos.add(gO);
                cerradosA.add(gO.estadoS);
            }
            if(!cerradosA.contains(gC.estadoS)){
                gC=new Nodo(gC.estado,primero,"granjeroCol");//OPERADOR GRANJERO-COL
                primero.hijos.add(gC);
                cerradosA.add(gC.estadoS);
            }           
            
            anchura.addAll(primero.hijos);  
           busquedaAnchura(anchura.poll(), ultimo);
            
        }
    }
    
    public String imprimePadres(Nodo x){
        if(x.getPadre() == null)
            return  x.estadoS  ;//Con esta funcion imprimimos el camino optimo
        else
            return imprimePadres(x.getPadre()) + " ----> " + x.estadoS;
    
    }
    
    public String imprimeOperadores(Nodo x){
        if(x.getPadre() == null)
            return "Operadores: \n" + x.operador  ;//Con esta funcion imprimimos los operadores 
        else{
            operadores.push(x.operador); 
            return imprimeOperadores(x.getPadre()) + " ----> " + x.operador;
        }
    }
    //OPERADORES
    public Nodo soloGranjero(int[] x){
        Nodo aux = new Nodo(x);
        if(!loboOveja(aux) && !ovejaCol(aux)){
            aux.estado[0] = change(aux.estado[0]);
            aux.estadoS = aux.toString();
        }
    return aux;
    }
    
    public Nodo granjeroLobo(int[] x){
        Nodo aux = new Nodo(x);
        if(aux.estado[0] == aux.estado[1] && !ovejaCol(aux)){
           aux.estado[0]=change(aux.estado[0]);aux.estado[1]=change(aux.estado[1]);
           aux.estadoS = aux.toString();  
        }
    return aux;
    }
    

    public Nodo granjeroOveja(int[] x){
        Nodo aux = new Nodo(x);
         
        if(aux.estado[0] == aux.estado[2]){
            aux.estado[0] = change(aux.estado[0]);aux.estado[2] = change(aux.estado[2]);
            aux.estadoS = aux.toString();
            
        }
        
    return aux;
    }
    
    public Nodo granjeroCol(int[] x){
        Nodo aux = new Nodo(x);
        if(aux.estado[0] ==  aux.estado[3] && !loboOveja(aux)){
            aux.estado[0] = change(aux.estado[0]);aux.estado[3] = change(aux.estado[3]);
            aux.estadoS = aux.toString();
           
        }
        
    return aux;
    }
    
    //RESTRICCIONES
    public boolean loboOveja(Nodo n){
        return n.estado[1]== n.estado[2]; 
    }
    
    public boolean ovejaCol(Nodo n){
        return n.estado[2]== n.estado[3];
    }
    
    public boolean loboOvejaGranjero(Nodo n){
        return n.estado[1]== n.estado[2] && n.estado[2]!=n.estado[0]; 
    }
    
    public boolean ovejaColGranjero(Nodo n){
        return n.estado[2]== n.estado[3] && n.estado[2]!=n.estado[0];
    }
    
    
    public int change(int x){
        if(x==0)
            x=1;
        else if(x==1)
            x=0;
        return x;
    }
        
    
    
}