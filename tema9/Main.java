public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        cliente.nombre = "Maite";
        cliente.edad = 24;
        cliente.telefono = 6727871;
        cliente.credito = 700.95;
        System.out.println("Hola yo soy " + cliente.nombre + ", yo tengo " + cliente.edad + " años y mi numero de telefono es " + cliente.telefono
                + " y mi monto disponible es: " + cliente.credito + "$");

        trabajador.nombre = "Jose";
        trabajador.edad = 27;
        trabajador.telefono = 7031071;
        trabajador.salario = 1500.88;
        System.out.println("Hola yo soy " + trabajador.nombre + ", yo tengo " + trabajador.edad + " años y mi numero de telefono es " + trabajador.telefono
                + " y mi monto disponible es: " + trabajador.salario + "$");

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}