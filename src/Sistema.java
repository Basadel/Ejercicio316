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
        System.out.println("Ingrese el mes de nacimiento del paciente: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia de nacimiento del paciente: ");
        int dia = sc.nextInt();
        FrecuenciasCardiacas frecuenciasCardiacas = new FrecuenciasCardiacas(nombre,apellido,anio,mes,dia);
        return frecuenciasCardiacas;
    }
}
