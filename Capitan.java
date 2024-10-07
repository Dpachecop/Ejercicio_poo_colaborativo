class capitan{
    String nombre;
    String id;
    String experiencia;

     public capitan() {
    }
    public capitan(String nombre, String id, String experiencia) {
        this.nombre = nombre;
        this.id = id;
        this.experiencia = experiencia;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Experiencia: " + experiencia);
    }
}