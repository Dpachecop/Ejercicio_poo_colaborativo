import java.sql.Date;

public class Main {
    public static void main(String[] args) {







        System.out.println("             Estudiantes:");
    System.out.println("Valentina Zuñiga - codigo: 7502410013");
    System.out.println("Daniel pacheco - codigo: 7502410006");
    System.out.println("");
    Cabina cabina = new Cabina(112, "suite", 10);
    cabina.mostrarDatos();
    System.out.println("");
    Crucero crucero = new Crucero("Titanic", 3000, "francia",  Date.valueOf("1998-10-07"), Date.valueOf("1998-12-10"), 3500);
    crucero.mostrarDatos();
    System.out.println("");
    Excursion excursion = new Excursion("Buceo ", "buceo guiado, para conocer tiburones", "el mundo de los tiburones", 15000);
    excursion.mostrarDatos();
    System.out.println("");
   Pasajero pasajero = new Pasajero("Mauricio", 25, "2345", 756, "Mauviajer@gmail.com");
   pasajero.mostrarDatos();



   capitan capitan = new capitan("Neyder Ruiz", "1128282344", "10");
   capitan.mostrarDatos();
   System.out.println("");
   reserva reserva= new reserva("Rose Dominguez", 2000000, "Gold VIP",  Date.valueOf("1998-10-07"),  1005);
   reserva.mostrarDatos();
   System.out.println("");
   tripulacion tripulacion = new tripulacion("Mayor", "Luis Santodomingo","112324156");
   tripulacion.mostrarDatos();
   System.out.println("");
   restaurante restaurante = new restaurante("Cactus", 30, "Ensaladas", "Comida saludable");
   restaurante.mostrarDatos();














































    }
}