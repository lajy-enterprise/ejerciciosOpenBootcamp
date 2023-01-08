public class Main {
    public static void main(String[] args) {
        sumando(80, 40, 20);

        Coche carro = new Coche();

        carro.sumandoPuertas();
        carro.sumandoPuertas();
        System.out.println("Tengo la siguiente cantidad de puertas: " + carro.tengoTantasPuertas);
    }

    public static void sumando(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de sumando es: " + resultado);
    }
}

class Coche {
    public int tengoTantasPuertas = 4;

    public void sumandoPuertas(){
        this.tengoTantasPuertas++;
    }
}