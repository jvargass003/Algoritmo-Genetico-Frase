package programa4;
import java.util.Random;
import java.util.Arrays; 
import java.util.stream.Stream;
import org.apache.commons.lang3.ArrayUtils;
public class Individuo {
    String cadena="";
    int size,alfabeto;
    int cromosoma[];
    Random random = new Random();
    Individuo(int size, int alfabeto){
        this.size = size;
        this.alfabeto = alfabeto;
        cromosoma= new int[size];
    }


    public void setCromosoma(int[] cromosoma) {
        this.cromosoma = cromosoma;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
        for(int n=0; n<size;n++){
            cromosoma[n]=(int)(cadena.toCharArray()[n]); 
        }
    }
    
    public String getCadena() {
        /*Regresa la cromosoma decofificada*/
        this.decodificar();
//        System.out.println(cadena);
        return cadena;
    }
    public void decodificar(){
        String cad="";
        for(int i=0;i<size;i++){
            cad = cad+ String.valueOf((char)(cromosoma[i]));
        }
        cadena=cad;
    }

    public int[] getCromosoma() {
        return cromosoma;
    }
    
    public void initCromosoma(){
        /*Incializa cromosoma, con número enteros, que posteriormente, se podrán traducir a código ASCII*/
        for(int i=0 ; i<size; i++){
            cromosoma[i] = random.nextInt(alfabeto+32);
        }
        
    }
    public Individuo[] cruza(Individuo mon){
        Individuo hijos[] = new Individuo[2];
        int padre[] = this.getCromosoma();
        int madre[] = mon.getCromosoma();
        //System.out.println(Arrays.toString(padre));
        //System.out.println(Arrays.toString(madre));
        int hijo1[]= ArrayUtils.addAll(Arrays.copyOfRange(padre, 0, (int)size/2),Arrays.copyOfRange(madre, (int)(size/2),size));
        int hijo2[]= ArrayUtils.addAll(Arrays.copyOfRange(madre, 0, (int)size/2),Arrays.copyOfRange(padre, (int)(size/2),size));
        
        Individuo h1 = new Individuo(size,alfabeto);
        Individuo h2 = new Individuo(size,alfabeto);
        
        h1.setCromosoma(hijo1);
        h2.setCromosoma(hijo2);
        
        hijos[0]=h1;
        hijos[1]=h2;
        
        return hijos;
        //System.out.println("Hijo 1: "+Arrays.toString(hijo1));
        //System.out.println("Hijo 2: "+Arrays.toString(hijo2));
        
    }
    
    
    public void mutacion(){
        int n = random.nextInt(alfabeto+32);
        int idx = random.nextInt(size);
        
        cromosoma[idx] = n;
        
    
    }
    
    /*public static void main(String[] args) {
        Individuo ind1= new Individuo(10,223);
        Individuo ind2= new Individuo(10,223);
        
        ind1.initCromosoma();
        ind2.initCromosoma();
        
        System.out.println(Arrays.toString(ind1.getCromosoma()));
        System.out.println(Arrays.toString(ind2.getCromosoma()));
        
        Individuo hijos[] =ind1.cruza(ind2);
        
        System.out.println(Arrays.toString(hijos[0].getCromosoma()));
        System.out.println(Arrays.toString(hijos[1].getCromosoma()));
        
        System.out.println();
        System.out.println(Arrays.toString(ind1.getCromosoma()));
        ind1.mutacion();
        System.out.println(Arrays.toString(ind1.getCromosoma()));
        
    }*/
    
    
}
