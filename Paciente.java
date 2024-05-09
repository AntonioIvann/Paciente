public class Paciente { // Declaración de la clase Paciente
    
    // Atributos de la clase Paciente
    String nombre;
    String apellido;
    int edad;
    double altura;
    
    // Método para mostrar el nombre del paciente
    public String mostrarNombre(){
        System.out.println("El nombre del paciente es " + this.nombre); // Imprime el nombre del paciente
        return nombre; // Retorna el nombre del paciente
    }
    
    // Método para mostrar el apellido del paciente
    public String mostrarApellido(){
        System.out.println("Se apellida " + this.apellido); // Imprime el apellido del paciente
        return apellido; // Retorna el apellido del paciente
    }         
    
    // Método para mostrar la edad del paciente
    public int mostrarEdad(){
        System.out.println("Su edad es de " + this.edad); // Imprime la edad del paciente
        return edad; // Retorna la edad del paciente
    }     
    
    // Método para mostrar la altura del paciente
    public double mostrarAltura(){
        System.out.println("Y mide " + this.altura); // Imprime la altura del paciente
        return altura; // Retorna la altura del paciente
    }
    
    // Métodos para obtener y establecer el nombre, apellido, edad y altura del paciente
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método toString para representar el objeto Paciente como una cadena de texto
    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }

}
