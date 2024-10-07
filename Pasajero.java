public class Pasajero {
    String nombre;
    int edad;
    String id;
    int idReserva;
    String email;

    public Pasajero(String nombre, int edad, String id, int idReserva, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.idReserva = idReserva;
        this.email = email;
    }

    public void mostrarDatos() {
        System.out.println("Pasajero: Nombre: " + nombre + ", Edad: " + edad + ", ID: " + id + 
                           ", ID Reserva: " + idReserva + ", Email: " + email);
    }
}

