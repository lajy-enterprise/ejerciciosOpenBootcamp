public class Main {

    public static void main(String[] args) {
        int queEsNumero = 3;

        if (queEsNumero<0){
            System.out.println("La variable queEsNumero " + queEsNumero + " es negativo");
        }
        else if(queEsNumero>0){
            System.out.println("La variable queEsNumero " + queEsNumero + " es positivo");
        } else {
            System.out.println("La variable queEsNumero es 0");
        }

        int numeroConWhile = 1;

        while(numeroConWhile < 4){
            numeroConWhile++;
            System.out.println("La variable numeroConWhile es: " + numeroConWhile);
        }

        int numeroConDoWhile = 4;
        do{
            numeroConDoWhile++;
            System.out.println("La variable numeroConDoWhile ahora vale: " + numeroConDoWhile);
        }while(numeroConDoWhile < 3);

        for(int numeroConFor = 0; numeroConFor <= 5; numeroConFor++){
            System.out.println("La variable numeroConFor ahora vale: " + numeroConFor);
        }

        String temporada = "otoño";
        switch(temporada) {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}