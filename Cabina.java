public class Cabina {
    int numero;
    String tipo;
    int capacidad;

    public Cabina(int numero, String tipo, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public void mostrarDatos() {
        System.out.println("Cabina: Número: " + numero + ", Tipo: " + tipo + ", Capacidad: " + capacidad);
    }
}
