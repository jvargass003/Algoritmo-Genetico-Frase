package programa4;
import java.util.ArrayList;
import programa4.Poblacion;
import programa4.Individuo;
import java.util.Arrays;
public class FuncionAptitud {
    String target;
    Poblacion pob;
    ArrayList<Individuo> individuos = new ArrayList<Individuo>();
    ArrayList<Integer> cod = new ArrayList<Integer>();
    ArrayList<Integer> aptitudes = new ArrayList<Integer>();
    int totalAptitudes=0, sizeInd;
    
    FuncionAptitud(Poblacion pob){
        this.target = pob.target;
        this.pob = pob;
        this.sizeInd = pob.sizeInd;
        this.individuos = pob.getIndividuos();
        //Se obtienen los valores de la cadena real, en enteros
        this.cod = codificar();
        for(int i=0;i<pob.size;i++){
            //Se calculan las aptitudes de cada uno de los individuos con respecto a la cadena real
            aptitudes.add(obtAptitudCon(individuos.get(i)));
        
        }
    }
    
    public int obtAptitudCon(Individuo ind){
        //Copia de la cadena real
        ArrayList<Integer> auxCod = new ArrayList<Integer>();
        auxCod.addAll(cod);
        int aptitud=0;
        //Se compreba que en la cadena de invididuo caracter por caracter si la contiene la cadena real, en caso de que contenga 
        //el caracter se toma se elimina de la cadena copia real para evitar que se le asigne más aptirud al individuo por caracteres repetidos
        for(int i=0;i<sizeInd;i++){
            if(auxCod.contains(ind.getCromosoma()[i])){
                //System.out.println("Cromosoma: "+(char)ind.getCromosoma()[i]);
                //System.out.println("Individuo: "+auxCod.get(auxCod.indexOf(ind.getCromosoma()[i])));
                auxCod.remove(auxCod.indexOf(ind.getCromosoma()[i]));
            }
            //Se compueba si el cacter de la posición i de la cadera real es igual a la de caracter en la posición i de la cadena del individuo
            if(cod.get(i)==ind.getCromosoma()[i]){
                //Se agrega aptitud si son iguales
                aptitud++;
            }
        }
        //Se realiza la resta de la cadena real y la cadena copi que a disminuido su tamaño de la cadena de individuo contenia caracteres de la cadena real
        aptitud = aptitud+(cod.size()-auxCod.size());
        //System.out.println("Aptitud: "+aptitud);
        //Se agrega a la suma total de aptitudes que permitiran la selección
        totalAptitudes = totalAptitudes +aptitud;
        return aptitud;
    }
    
    
    public ArrayList codificar(){
        //Se codifica la cadena real a sus correspodientes números en código ASCII
        ArrayList<Integer> cod = new ArrayList<Integer>();
        for(int n=0; n<sizeInd;n++){
            cod.add((int)(target.toCharArray()[n]));
            //System.out.println(cod.get(n));
        }
        return cod;
    }
    
    public ArrayList<Integer> getAptitudes() {
        return aptitudes;
    }

    public int getTotalAptitudes() {
        return totalAptitudes;
    }
    
    
    
}

