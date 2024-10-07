class tripulacion{
    String cargo;
    String nombre;
    String id;

    public tripulacion() {
    }
    public tripulacion(String cargo, String nombre, String id) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.id = id;
    }
    public void mostrarDatos() {
        System.out.println("Cargo: " + cargo);
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }
}