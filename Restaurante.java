class restaurante{
    String nombre;
    int capacidad;
    String especialidad;
    String tipo;
    public restaurante() {
    }
    public restaurante(String nombre, int capacidad, String especialidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.especialidad = especialidad;
        this.tipo = tipo;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Tipo: " + tipo);
    }
}