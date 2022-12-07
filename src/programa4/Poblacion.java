package programa4;
import java.util.ArrayList;
import programa4.Individuo;
public class Poblacion {
    ArrayList<Individuo> individuos = new ArrayList<Individuo>();
    int size, sizeInd,alfabeto;
    String target;
    Poblacion(int size, String target, int alfabeto){
        this.size = size;
        this.sizeInd = target.length();
        this.alfabeto = alfabeto;
        this.target = target;
    }

    public void initPoblacion(){
        for(int i=0;i<size;i++){
            //Se crea el nuevo individuo
            Individuo ind = new Individuo(sizeInd,alfabeto);
            //Se inicializa
            ind.initCromosoma();
            //Se agrega a la población
            individuos.add(ind);
        }
    
    }
    public ArrayList<Individuo> getIndividuos() {
        return individuos;
    }

    public void setIndividuos(ArrayList<Individuo> individuos) {
        this.individuos.addAll(individuos);
    }

     
    
}
