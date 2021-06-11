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


public class Ejercicio6 {
    
    public static void cargarSet(Set<Empleado> empleados) {

        Scanner input = new Scanner(System.in);

        Empleado emp = new Empleado();

        int resp = 0;


        System.out.println("Cargar los datos del empleado");

        do {
            System.out.print("Nombre y Apellido: ");
            emp.nombYApell = input.nextLine();
            System.out.print("DNI: ");
            emp.dni = input.nextLine();
            System.out.print("Horas Trabajadas:: ");
            emp.horasTrabajadas = input.nextLine();
            System.out.print("Valor por Hora: ");
            emp.valorPorHora = input.nextLine();


            System.out.println("Desea agregar otro empleado? \n\t(presione [1] para salir) ");
            resp = input.nextInt();

        } while (resp == 0);

        input.close();
    }

    public static void main(String[] args){
        
        Set<Empleado> empleados = new HashSet<>();
        Map sueldoXEmp = new HashMap();

        cargarSet(empleados);

        
        for (Set empleado: empleados) {
            System.out.println(empleado);
        } 


    }    
}