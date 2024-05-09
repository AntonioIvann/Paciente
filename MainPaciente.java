import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainPaciente { // Declara una clase pública llamada MainPaciente
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner opc = new Scanner(System.in); // Crea un objeto Scanner llamado opc para leer la entrada del usuario

        // Solicita al usuario que ingrese el nombre del paciente
        System.out.println("Dame el nombre del paciente: ");
        String nombre = opc.next(); // Lee el nombre proporcionado por el usuario

        // Solicita al usuario que ingrese el apellido del paciente
        System.out.println("Ingrese su apellido: ");
        String apellido = opc.next(); // Lee el apellido proporcionado por el usuario

        // Solicita al usuario que ingrese la edad del paciente
        System.out.println("Cual es la edad el paciente: ");
        int edad = opc.nextInt(); // Lee la edad proporcionada por el usuario

        // Solicita al usuario que ingrese la estatura del paciente
        System.out.println("Cual es su estatura: ");
        double altura = opc.nextDouble(); // Lee la estatura proporcionada por el usuario

        Paciente p1 = new Paciente(); // Crea un objeto de la clase Paciente llamado p1

        // Asigna los valores proporcionados por el usuario al objeto p1
        p1.nombre = nombre;
        p1.apellido = apellido;
        p1.edad = edad;
        p1.altura = altura;

        // Llama a los métodos mostrarNombre(), mostrarApellido(), mostrarEdad() y mostrarAltura()
        // de p1 para obtener los valores actualizados y asignarlos a las variables correspondientes
        nombre = p1.mostrarNombre();
        apellido = p1.mostrarApellido();
        edad = p1.mostrarEdad();
        altura = p1.mostrarAltura();
    }
}
