import java.util.HashMap;
import java.util.HashSet;

public class Colegio {

    private HashMap<String, String> mapColegio;


    ///constructores
    public Colegio(){

    }

    public Colegio(HashMap<String, String> mapColegio) {
        this.mapColegio = mapColegio;
    }

    public void addAlumno(String key,String nacionalidad){

        mapColegio.put(key, nacionalidad);
    }

   public void showAll(){

         HashMap<String, Integer> contador=new HashMap<>();
        for (String nacionalidades: mapColegio.values()) {
            if (contador.containsKey(nacionalidades))

                contador.put(nacionalidades, contador.get(nacionalidades) + 1);

            else {
                contador.put(nacionalidades, 1);


            }
        }
       System.out.println("Nacionalidades del colegio: ");

        for(String nacionalidades: contador.keySet()){

            System.out.println("* " + nacionalidades + " " + contador.get(nacionalidades));
        }

    }


    public void showNacionalidad(String nacionalidad) {

        int contador = 0;

        for (String nacionalidades : mapColegio.values()) {
            if (nacionalidades.equalsIgnoreCase(nacionalidad)) {
                contador++;

            }
        }
        System.out.println("La nacionalidad " + nacionalidad + " tiene " + contador + " personas");

    }

    public void cuantos(){

        ///la creacion del hashset permite  guardar las nacionalidades sin repeticion, solo una por cada.
        HashSet<String> contador=new HashSet<>();

        for(String nacionalidades: mapColegio.values()){
            if(mapColegio.values().equals(nacionalidades))
            contador.add(nacionalidades);
        }

        System.out.println("El colegio presenta en total " + contador.size() + " nacionalidades distintas");

        System.out.println("Las cuales son: ");

            System.out.println("- " + contador);

    }

    public void borra(){

        mapColegio.clear();
        System.out.println("Todos los datos insertados han sido borrados con exito");

    }

    ///getters y setters


    public HashMap<String, String> getMapColegio() {
        return mapColegio;
    }

    public void setMapColegio(HashMap<String, String> mapColegio) {
        this.mapColegio = mapColegio;
    }
}
