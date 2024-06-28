/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea00;

/**
 *
 * @author lucas
 */
public class Tarea00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
spotify cancion =  new spotify("707", "En To lao","Jhayco","3:40","2023");
//se crea la clase en el main


System.out.println("Id:" + cancion.getId);
System.out.println("TITULO:" + cancion.getTitulo);
System.out.println("AUTOR:" + cancion.getAutor);
System.out.println("DURACION:" + cancion.getDuracion);
System.out.println("ANIO:" + cancion.getAnio);
//se usabn los get para la informacion
//profe he intentado por todos los medios para que el System out println sirva pero de niguna forma lo hace, no se si sera algun problema de mi maquina 

cancion.setTitulo("no me conoce");
System.out.println("TITULO NUEVO:" + cancion.getTitulo);
//los set dandole un nuevo valor
}
