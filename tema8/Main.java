public class Main {

    public static void main(String[] args) {

        Persona yoSoy = new Persona();
        yoSoy.setNombre("Luis Arroyo");
        System.out.println("Me llamo " + yoSoy.getNombre());
        yoSoy.setEdad(27);
        System.out.println("Yo Tengo " + yoSoy.getEdad() + " años");
        yoSoy.setTelefono(7031071);
        System.out.println("Mi numero telefonico es " + yoSoy.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}