/**
 * Ejercicio 4:
 * 
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
 * en 3 cursos (3 arrayList) e imprimir dichos cursos.
 *
 */

import java.util.*;

public class Ejercicio4 {
    
    public static void cargarLista(List<String> estudiantes) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 12; i++) {
            System.out.print(i + "- Ingresar el nombre del alumno: ");
            estudiantes.add(input.nextLine()); 
        }

        input.close();
    }
    
   

    public static void main(String[] args){
    
        List<String> estudiantes = new ArrayList<>();

        cargarLista(estudiantes);
        List<String> cursoA = estudiantes.subList(0,4);         
        List<String> cursoB = estudiantes.subList(4,8);
        List<String> cursoC = estudiantes.subList(8,12);

        System.out.println("Curso A: " + cursoA + "\nCurso B: " + cursoB + "\nCurso C: " + cursoC);
    }    
}