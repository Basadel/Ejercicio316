import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sistema {
    Scanner sc;
    BufferedReader br;

    public Sistema(){
        sc = new Scanner(System.in);
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public FrecuenciasCardiacas crearPaciente(){
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del paciente: ");
        String apellido = sc.next();
        System.out.println("Ingrese el año de nacimiento del paciente: ");
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento del paciente (1 - 12): ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia de nacimiento del paciente (1 - 30): ");
        int dia = sc.nextInt();
        return new FrecuenciasCardiacas(nombre,apellido,anio,mes,dia);
    }

    public void imprimirPaciente(FrecuenciasCardiacas frecuenciasCardiacas){
        System.out.println("Datos del Paciente: ");
        System.out.println("Nombre: "+frecuenciasCardiacas.getNombre());
        System.out.println("Apellido: "+frecuenciasCardiacas.getApellido());
        System.out.println("Edad del Paciente: "+frecuenciasCardiacas.calcularEdad());
        System.out.println("Frecuencia Cardiaca del Paciente: "+frecuenciasCardiacas.calcularFrecuenciaCardiaca());
        System.out.println("Frecuencia Cardiaca Esperada del Paciente Minima: "+frecuenciasCardiacas.calcularFrecuenciaCardiacaEsperadaMin());
        System.out.println("Frecuencia Cardiaca Esperada del Paciente Maxima: "+frecuenciasCardiacas.calcularFrecuenciaCardiacaEsperadaMax());
    }
}
