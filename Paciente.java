public class Paciente {

    String nombre;
    String apellido;
    int edad;
    double altura;
    
    public String mostrarNombre(){
        System.out.println("El nombre del paciente es "+this.nombre);
        return nombre;
    }
    public String mostrarApellido(){
        System.out.println("Se apellida "+this.apellido);
        return apellido;
    }         
    public int mostrarEdad(){
        System.out.println("Su edad es de "+this.edad);
        return edad;
    }     
    public double mostrarAltura(){
        System.out.println("Y mide "+this.altura);
        return altura;
    }

}