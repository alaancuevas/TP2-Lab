import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Reloj {

    Scanner leer = new Scanner(System.in);
    private LocalDate dia;
    private LocalTime hora; 
    private int numSerie;
    private double modelo;
    
    public Reloj(int numSerie, double modelo) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.dia = LocalDate.now();
        this.hora=LocalTime.now().withNano(0);
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void mostrarPantalla() {
        System.out.println(hora);
        System.out.println(dia);
    }
   
    public void limpiarPantalla() {
        this.dia = LocalDate.now();
        this.hora= LocalTime.now().withNano(0);
    }

    public void incrementarHora(int horaMas, int minutoMas) {
        int suma = horaMas * 60 + minutoMas;
        hora=hora.plusMinutes(suma);
        System.out.println("La hora es: " + hora);
    }
    
    public void incrementarDia(int diasMas) {
        dia=dia.plusDays(diasMas);
        System.out.println("El dia es : " + dia);
    }
    
    public void menu() {
        mostrarPantalla();
        boolean bandera = true;
        do {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Incrementar Dia.");
            System.out.println("2. Incrementar Hora.");
            System.out.println("3. Limpiar Pantalla.");
            System.out.println("4. Terminar Programa.");
            
            int opcion = leer.nextInt();
            int a;
            int b;
            switch (opcion) {
                case 1:
                    System.out.print("Cuenatos dias desea incrementar? ");
                    a = leer.nextInt();
                    incrementarDia(a);
                    break;
                case 2:
                    System.out.print("Cuenatas horas deseas incrementar? ");
                    a = leer.nextInt();
                    System.out.print("Ingrese la cantidad de minutos: ");
                    b = leer.nextInt();
                    incrementarHora(a, b);
                    break;
                case 3:
                    limpiarPantalla();
                    mostrarPantalla();
                    break;
                case 4:
                    System.out.println("Terminando programa..");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (bandera);
    }
}
