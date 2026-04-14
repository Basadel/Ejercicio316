import java.io.BufferedReader;
import java.util.Scanner;

public class FrecuenciasCardiacas {

    Scanner sc;
    BufferedReader br;

    private String nombre;
    private String apellido;
    private int anio;
    private int mes;
    private int dia;
    private int edad;

    public FrecuenciasCardiacas(String nombre, String apellido, int anio, int mes, int dia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int calcularFrecuenciaCardiaca(int edad){
    int frecuenciaCardiaca = 200 - this.edad;
    return frecuenciaCardiaca;
    }


    public int calcularEdad(int anioActual, int mesActual, int diaActual){
       int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
       int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
       int edadDias = fechaActualDias + fechaNacimientoDias;
       this.edad = edadDias / 365;
       return edad;
    }




    public void setFechaNacimiento(int anio, int mes, int dia){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String nombre) {
        this.apellido = nombre;
    }


}
