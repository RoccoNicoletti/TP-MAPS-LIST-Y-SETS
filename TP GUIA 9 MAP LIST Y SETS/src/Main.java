import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ///PUNTO 1///

       /* Scanner teclado=new Scanner(System.in);

        HashMap<String, String> map=new HashMap<>();
        Colegio colegio=new Colegio(map);
        colegio.addAlumno("Mike", "estadounidense");
        colegio.addAlumno("Jimmy", "canadiense");
        colegio.addAlumno("Alejandro", "argentina");
        colegio.addAlumno("Peter", "venezolano");
        colegio.addAlumno("Rocco", "argentina");
        colegio.addAlumno("Diana", "estadounidense");
        colegio.addAlumno("Jonathan", "española");
        colegio.addAlumno("Victor", "argentina");

        System.out.println("--------------------------------");
        System.out.println("MOSTRAR CANTIDAD DE CADA NACIONALIDAD:");
        colegio.showAll();
        System.out.println("--------------------------------");
        System.out.println("AVERIGUAR CUANTOS ALUMNOS HAY DE DETERMINADA NACIONALIDAD:");
        String nacionalidad;
        System.out.println("Ingrese la nacionalidad para saber cuantos alumnos hay de esa nacionalidad:");
        nacionalidad=teclado.next();
        colegio.showNacionalidad(nacionalidad);
        System.out.println("--------------------------------");
        System.out.println("CANTIDAD DE NACIONALIDADES EN TOTAL:");
        colegio.cuantos();
        System.out.println("--------------------------------");
        System.out.println("BORRAR TODOS LOS ELEMENTOS INGRESADOS:");
        colegio.borra();
        System.out.println("--------------------------------"); */

        ///PUNTO 2///
        ArrayList<String> semana=new ArrayList<>();
        DiasSemana semanita=new DiasSemana(semana);
        semanita.agregar("Lunes");
        semanita.agregar("Martes");
        semanita.agregar("Miercoles");
        semanita.agregar("Jueves");
        semanita.agregar("Juernes");
        semanita.agregar("Sabado");
        semanita.agregar("Domingo");
        ArrayList<String> nuevaLista=new ArrayList<>();
        System.out.println("--------------------------------");
        System.out.println("Copiar de una lista a otra:");
        semanita.copiarLista(nuevaLista);
        System.out.println("--------------------------------");
        System.out.println("Mostrar el tercer y cuarto elemento de la lista:");
        semanita.mostrarContenidopos3y4();
        System.out.println("--------------------------------");
        System.out.println("Mostrar el primero y el ultimo de lista: ");
        semanita.mostrarPrimeryUltimo();
        System.out.println("--------------------------------");

        System.out.println("Buscar y eliminar juernes:");
        boolean confirmar=semanita.eliminarJuernes();

        if(confirmar==true){
            System.out.println("El elemento se elimino");
        }
        else{
            System.out.println("El elemento no se elimino");
        }

        System.out.println("Lista con el elemento eliminado: ");
        System.out.println(semana);

        System.out.println("--------------------------------");
        System.out.println("Mostrar uno a uno con iterador:");

        semanita.mostrarUnoaUnoIterador();

        System.out.println("--------------------------------");

        System.out.println("Busqueda del dia lunes:");

        boolean chequeo=semanita.buscarDialunes();

        if(chequeo){
            System.out.println("El dia lunes existe en la lista");
        }
        else{
            System.out.println("El dia lunes no existe en la lista");
        }
        System.out.println("--------------------------------");

        System.out.println("Lista ordenada de menor a mayor: ");

        semanita.ordenarLista();
        System.out.println("--------------------------------");
        System.out.println("Borrar todos los elementos de la lista");

        semanita.borrarTodosElementoslista();

        System.out.println("--------------------------------");

        ///PUNTO 3///

        HashSet<String> jugadoresVelez=new HashSet<>();
        Veleshhhh velez=new Veleshhhh(jugadoresVelez);
        velez.agregar("Lucas Pratto");
        velez.agregar("Diego Godin");
        velez.agregar("Leonardo Burian");
        velez.agregar("Lucas Janson");
        velez.agregar("Julian Fernandez");

        System.out.println("Ver la existencia de Neymar dentro del conjunto:");
        boolean confirmacion=velez.existenciaNey();

        if(confirmacion){
            System.out.println("Neymar juega en velez, que fichaje");
        }
        else{

            System.out.println("Neymar no juega en velez, que flasheas");

        }

        System.out.println("--------------------------------");

        HashSet<String> jugadoresElite=new HashSet<>();
        jugadoresElite.add("Pique");
        jugadoresElite.add("Busquets");

        System.out.println("Ver si TODOS los elementos de jugadores de elite existe en el conjunto de velez:");
        velez.existenciaTodosjugadores(jugadoresElite);
        System.out.println("--------------------------------");
        System.out.println("Unir el conjunto de jugadores de elite con el de Velez:");
        velez.unionDeConjuntos(jugadoresElite);
        System.out.println("--------------------------------");
        System.out.println("Eliminar conjunto jugadores de elite de dos maneras:");
        velez.eliminarymostrarJugadoreselite(jugadoresElite);
        System.out.println("--------------------------------");






    }
}