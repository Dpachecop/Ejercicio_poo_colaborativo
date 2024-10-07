import java.sql.Date;
class reserva{
String pasajero;
float costo;
String tipo;
Date fecha;
int idreserva;
 public reserva(String pasajero, float costo, String tipo, Date fecha, int idreserva) {
        this.pasajero = pasajero;
        this.costo = costo;
        this.tipo = tipo;
        this.fecha = fecha;
        this.idreserva = idreserva;
    }

    public void mostrarDatos() {
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Costo: " + costo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Fecha: " + fecha);
        System.out.println("ID de reserva: " + idreserva);
    }

}