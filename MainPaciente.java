import java.util.Scanner;
public class MainPaciente{
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Dame el nombre del paciente: ");
        String nombre = opc.next();
        System.out.println("Ingrese su apellido: ");
        String apellido = opc.next();
        System.out.println("Cual es la edad el paciente: ");
        int edad = opc.nextInt();
        System.out.println("Cual es su estatura: ");
        double altura = opc.nextDouble();
        Paciente p1 = new Paciente();
        p1.nombre=nombre;
        p1.apellido=apellido;
        p1.edad=edad;
        p1.altura=altura;
        nombre=p1.mostrarNombre();
        apellido=p1.mostrarApellido();
        edad=p1.mostrarEdad();
        altura=p1.mostrarAltura();
    }
}