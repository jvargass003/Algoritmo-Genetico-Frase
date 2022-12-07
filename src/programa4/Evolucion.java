package programa4;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;
import org.apache.commons.lang3.ArrayUtils;
import programa4.*;
public class Evolucion{
    Random random = new Random();
    JTextArea individuo,mejor,ultima;
    JTextField frase;
    int size,sizeInd;
    int alfabeto = 223;
    Poblacion nuevaPob;
    Poblacion anteriorPob;
    String cadena;
    ArrayList<Integer> aptitudes = new ArrayList<Integer>();
    ArrayList<Integer> ruleta = new ArrayList<Integer>();
    ArrayList<Individuo> ind;
    public Evolucion(String cadena,int size, JTextArea ultima, JTextField frase){
        this.individuo = individuo;
        this.mejor = mejor;
        this.ultima = ultima;
        this.cadena = cadena;
        this.size = size;
        this.frase = frase;
        this.sizeInd = cadena.length();
        nuevaPob= new Poblacion(size, cadena, alfabeto);
        nuevaPob.initPoblacion();
        FuncionAptitud fun = new FuncionAptitud(nuevaPob);
        while(true){ 
            if(fun.getTotalAptitudes()!=0) break;
            else{
                nuevaPob.initPoblacion();
            }
        } 
        for(int t =0;t<size;t++){
            Interfaz.areaTextIndividuos.append("Individuo "+(t+1)+": "+nuevaPob.getIndividuos().get(t).getCadena()+"\n");
               
        }
    }
    
    public void evolucion(){
        
        int o=0;
        while(true){
            ind = new ArrayList<Individuo>();
            
            /*for(int t =0;t<size;t++){
                
                System.out.print(nuevaPob.getIndividuos().get(t).getCadena()+",");
            }*/
            //System.out.println();
            FuncionAptitud fun = new FuncionAptitud(nuevaPob);
            aptitudes.clear();
            aptitudes.addAll(fun.getAptitudes());
            int mej = aptitudes.get(aptitudes.indexOf(Collections.max(aptitudes)));
            Interfaz.areaTextMejor.append("MEJOR DE "+(o+1)+": "+nuevaPob.getIndividuos().get(mej).getCadena()+"\n");
            if(aptitudes.contains(sizeInd*2)){
                Interfaz.areaTextMejor.append("MEJOR DE "+(o+1)+": "+nuevaPob.getIndividuos().get(aptitudes.indexOf(sizeInd*2)).getCadena()+"\n");
                for(int t =0;t<size;t++){
                    ultima.append("Individuo "+(t+1)+": "+nuevaPob.getIndividuos().get(t).getCadena()+"\n");
                }
                frase.setText(nuevaPob.getIndividuos().get(aptitudes.indexOf(sizeInd*2)).getCadena());
                return;
            }
            //System.out.println("Estoy aquí");
            //System.out.println(aptitudes.toString());
            Seleccion selec = new Seleccion(aptitudes,fun.getTotalAptitudes());
            ruleta.clear();
            ruleta.addAll(selec.getRuleta());
            
            //Mejor de la población 
            
            
            if(size%2==1){
                int in = aptitudes.get(aptitudes.indexOf(Collections.max(aptitudes)));
                ind.add(nuevaPob.getIndividuos().get(in));
            
            }
            for(int i=0;i<(int)size/2;i++){
                
                int n1 = random.nextInt(fun.getTotalAptitudes());
                int n2 = random.nextInt(fun.getTotalAptitudes());
                //System.out.println(n1+","+n2);
                int ind1 = ruleta.get(n1);
                int ind2 = ruleta.get(n2);
                //System.out.println(ind1+","+ind2);
                Individuo hijos[] = nuevaPob.getIndividuos().get(ind1).cruza(nuevaPob.getIndividuos().get(ind2));
                
                ind.add(hijos[0]);
                ind.add(hijos[1]);
                //System.out.println(hijos[0].getCadena());
                //System.out.println(hijos[1].getCadena());
            }
            
            for(int n =0 ;n<Math.ceil(size*.05);n++){
                int idx = random.nextInt(size);
                ind.get(idx).mutacion();
            }

            anteriorPob = new Poblacion(size,cadena,alfabeto);
            anteriorPob.setIndividuos(nuevaPob.getIndividuos());
            nuevaPob.individuos.clear();
            nuevaPob.setIndividuos(ind);
            
            
           
            
        o++;    
        }
       
    
    }
    
}
