public class Main {

    public static void main(String[] args) {
        Reloj casio = new Reloj(6217672, 4.0);
        Persona persona = new Persona("Alan", "Cuevas", 23, casio);
        
        persona.comer();
        persona.hablar();
        persona.usarReloj();
        
    }
}
