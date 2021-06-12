/**
 * Ejercicio 6:
 * 
 * Se dispone de una lista de Empleados, de cada empleado se conoce:
 * ○ Nombre y Apellido
 * ○ DNI
 * ○ horasTrabajadas
 * ○ valorPorHora
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular el
 * sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
 * almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
 * (value) es el sueldo calculado.
 *
 */

import java.util.*;

public class Ejercicio6 {
    
    public static void cargarSet(Set<Empleado> empleados) {

        Scanner input = new Scanner(System.in);

        int resp = 0;

        System.out.println("Cargar los datos del empleado");

        while (resp == 0) {
            
            Empleado emp = new Empleado();
            System.out.print("Nombre y Apellido: ");
            emp.setNombYAp(input.nextLine());
            System.out.print("DNI: ");
            emp.setDni(input.nextInt());
            System.out.print("Horas Trabajadas: ");
            emp.setHorasT(input.nextInt());
            System.out.print("Valor por Hora: ");
            emp.setValor(input.nextInt());

            empleados.add(emp);

            System.out.println("Desea agregar otro empleado? \n\t(presione [0] para continuar o [1] para salir) ");
            resp = input.nextInt();
            input.nextLine();

        }

        input.close();
    }

    public static void cargarMap(Set<Empleado> empleados, Map<Integer, Integer> sueldoXEmp) {

        for (Empleado empleado: empleados) {
           sueldoXEmp.put(empleado.getDni(), empleado.sueldoCalculado());
        } 
    }

    public static void main(String[] args){
        
        Set<Empleado> empleados = new HashSet<>();
        
        Map<Integer, Integer> sueldoXEmp = new HashMap<>();
        
        cargarSet(empleados);

        cargarMap(empleados ,sueldoXEmp);
        
        for (Integer key: sueldoXEmp.keySet()){  
            System.out.println("DNI: " + key + "; Sueldo: " + sueldoXEmp.get(key));
        } 

    }    
}