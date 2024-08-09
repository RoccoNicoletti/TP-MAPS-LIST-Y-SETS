import java.util.HashSet;

public class Veleshhhh {

   private HashSet<String> jugadores;


   ///constructores
   public Veleshhhh(){

   }

    public Veleshhhh(HashSet<String> jugadores) {
        this.jugadores = jugadores;
    }


    ///getters y setters

    public HashSet<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<String> jugadores) {
        this.jugadores = jugadores;
    }

    ///metodos

    public void agregar(String obj){

       jugadores.add(obj);


    }

    public boolean existenciaNey(){

       boolean existe=false;

       for(String jugador: jugadores){
           if(jugador.equalsIgnoreCase("Neymar Jr")){
               existe=true;
           }
       }

       return false;
    }

    public void existenciaTodosjugadores(HashSet<String> jugadores2){

       boolean confirmar=jugadores.containsAll(jugadores2);

       if(confirmar){
           System.out.println("Los jugadores del conjunto 2 estan en el conjunto de jugadores de velez");
       }
       else{
           System.out.println("Los jugadores del conjunto 2  no estan en el conjunto de jugadores de velez");
       }



    }

    public void unionDeConjuntos(HashSet<String> jugadores2){

       jugadores.addAll(jugadores2);
        System.out.println("Jugadores de los dos conjuntos, unidos:");
        System.out.println(jugadores);
    }

    public void eliminarymostrarJugadoreselite(HashSet <String> jugadores2){

        System.out.println("Eliminar los jugadores del conjunto de velez, pertenecientes a jugadores de elite");
       jugadores.removeAll(jugadores2);//elimino los jugadores del conjunto 2 del conjunto jugadores
        System.out.println(jugadores);
        System.out.println("--------------------------------");
        System.out.println("Elimino todos los jugadores del conjunto jugadores de elite:");
        jugadores2.clear();
        System.out.println("La cantidad de jugadores dentro de jugadores de elite ahora es: " + jugadores2.size());




    }

}
