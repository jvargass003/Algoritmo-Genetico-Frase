package programa4;
import java.util.ArrayList;
import java.util.Random;
import programa4.*;
public class Seleccion {
    
    ArrayList<Integer> aptitudes = new ArrayList<Integer>();
    ArrayList<Integer> ruleta = new ArrayList<Integer>();
    int totalAptitudes;
    
    public Seleccion(ArrayList<Integer> aptitudes, int totalAptitudes){
        this.aptitudes = aptitudes;
        this.totalAptitudes = totalAptitudes;
        //System.out.println(totalAptitudes);
        this.generarRuleta();
    }
    
    public void generarRuleta(){
        //De acuerdo con las adtitudes, se asigna la cantidad de espacio que se almacena en la ruleta
        for(int i=0;i<aptitudes.size();i++){
            //Si es la aptitud del individuo es 0 no se le asigna ningun numero
            for(int n=0;n<aptitudes.get(i);n++){
                ruleta.add(i);
                //System.out.println(i);
            }//for aptitud
            
        }//for aptitudes
    
    }//generarRuleta

    public ArrayList<Integer> getRuleta() {
        return ruleta;
    }
    
    
    /*public static void main(String[] args) {
        Random random = new Random();
        Poblacion pob = new Poblacion(100,"hola",223);
        pob.initPoblacion();
        FuncionAptitud fun = new FuncionAptitud(pob);
        Seleccion sel = new Seleccion(fun.getAptitudes(),fun.totalAptitudes);
        System.out.println("Individuo 1: "+sel.getRuleta().get(random.nextInt(fun.getTotalAptitudes())));
        System.out.println("Individuo 2: "+sel.getRuleta().get(random.nextInt(fun.getTotalAptitudes())));
    }*/
}//Seleccion
