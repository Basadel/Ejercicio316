import java.time.LocalDate;

public class FrecuenciasCardiacas {


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

    public int calcularFrecuenciaCardiaca(){
    return 220 - this.edad;
    }

    public double calcularFrecuenciaCardiacaEsperadaMin(){
        return calcularFrecuenciaCardiaca() * 0.50;
    }

    public double calcularFrecuenciaCardiacaEsperadaMax(){
        return calcularFrecuenciaCardiaca() * 0.85;
    }


    public int calcularEdad(){
       LocalDate hoy = LocalDate.now();
       int anioActual = hoy.getYear();
       int mesActual = hoy.getMonthValue();
       int diaActual = hoy.getDayOfMonth();
        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
       int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
       int edadDias = fechaActualDias - fechaNacimientoDias;
       this.edad = edadDias / 365;
       return edad;
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
