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
        // TODO code application logic here
    }
cancion pieza = new cancion(id"707", titulo"wow", autor"mom", duracion"2:00", anio"2024");
//se crea la clase en el main


System.out.println("id: " + cancion.getid());
System.out.println("Titulo: " + cancion.gettitulo());
System.out.println("Autor: " + cancion.getautor());
System.out.println("Duracion: " + cancion.getduracion());
System.out.println("Anioo de Creacion: " + cancion.getanio());
//se usan los get 

cancion.setTitulo("owo");
System.out.println("Nuevo titulo:" + cancion.gettitulo());
//se usa el set


}
