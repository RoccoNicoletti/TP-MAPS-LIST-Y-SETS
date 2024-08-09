import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DiasSemana {

   private ArrayList<String> semana;


   ///constructores
   public DiasSemana (){


   }

    public DiasSemana(ArrayList<String> semana) {
        this.semana = semana;
    }

    ///getters y setters

    public ArrayList<String> getSemana() {
        return semana;
    }

    public void setSemana(ArrayList<String> semana) {
        this.semana = semana;
    }

    ///metodos
    public void agregar (String obj){

       semana.add(obj);

    }

    public  void copiarLista(ArrayList<String> listaCopia){

       listaCopia.addAll(semana);
        System.out.println(listaCopia);
    }

    public void mostrarContenidopos3y4(){

        System.out.println("Elemento 3 de la lista: " + semana.get(3));
        System.out.println("Elemento 4 de la lista: " + semana.get(4));
    }

    public void mostrarPrimeryUltimo(){
        System.out.println("Primer elemento de la lista: " + semana.get(0));
        System.out.println("Ultimo elemento de la lista: " + semana.get(semana.size()-1));
    }

    public boolean eliminarJuernes(){
       boolean confirmacion=false;

       for(int i=0; i<semana.size(); i++) {

           if (semana.get(i).equals("Juernes")){
               semana.remove(i);
               confirmacion=true;
               i--;

           }

       }
       return confirmacion;
    }

    public void mostrarUnoaUnoIterador(){

        Iterator<String> DiasSemana= semana.iterator();

        while(DiasSemana.hasNext()){
            String dia= DiasSemana.next();
            System.out.println(dia);
        }
    }

    public boolean buscarDialunes (){

       boolean chequeo=false;

       for (int i=0; i<semana.size();i++){
           if(semana.get(i).equals("Lunes")){
               chequeo=true;
           }
       }
       return chequeo;
    }

    public void ordenarLista(){

       Collections.sort(semana);

        System.out.println(semana);
    }

    public void borrarTodosElementoslista(){

       semana.clear();
       if(semana.isEmpty()){

           System.out.println("Los elementos de la lista han sido borrados");
           System.out.println("Elementos:");
           System.out.println(semana);
       }
       else{
           System.out.println("Los elementos de la lista no han sido o fueron parcialmente borrados");
       }

    }

}
