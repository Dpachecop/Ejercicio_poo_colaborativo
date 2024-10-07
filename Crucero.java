import java.sql.Date;

public class Crucero {

    String nombre;
    int capacidad;
    String destino;
    Date fechaInicio;
    Date fechaFinal;
    float tamaño;

    public Crucero(String nombre, int capacidad, String destino, Date fechaInicio, Date fechaFinal, float tamaño) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.tamaño = tamaño;
    }

    public void mostrarDatos() {
        System.out.println("Crucero: " + nombre + ", Capacidad: " + capacidad + ", Destino: " + destino +
                ", Fecha Inicio: " + fechaInicio + ", Fecha Final: " + fechaFinal + ", Tamaño: " + tamaño);
    }

}