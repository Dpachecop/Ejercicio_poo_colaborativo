public class Excursion {
    String destino;
    String duracion;
    String nombre;
    float costo;

    public Excursion(String destino, String duracion, String nombre, float costo) {
        this.destino = destino;
        this.duracion = duracion;
        this.nombre = nombre;
        this.costo = costo;
    }

    public void mostrarDatos() {
        System.out.println("Excursión: Destino: " + destino + ", Duración: " + duracion + 
                           ", Nombre: " + nombre + ", Costo: " + costo);
    }
}
