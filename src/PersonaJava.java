public class PersonaJava {

    String Nombre;
    int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PersonaJava(String nombre, int edad) {
        Nombre = nombre;
        this.edad = edad;
    }
}
