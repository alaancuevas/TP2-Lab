public class Persona {

    private String nombre;
    private String apellido;
    private double altura;
    private int edad;
    private Reloj reloj;

    public Persona(String nombre, String apellido, int edad, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.reloj = reloj;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void usarReloj() {
        reloj.menu();
    }
    
    public void comer(){
        System.out.println("Comiendo...");
    }
    
    public void hablar(){
        System.out.println("Hablando...");
    }
}
