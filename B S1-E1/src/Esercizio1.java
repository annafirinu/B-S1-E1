public class Esercizio1 {

    public static void main(String[] args) {

        System.out.println( moltiplica(4,2));
        System.out.println(concatena("Giorno", 31));
    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena(String testo, int numero) {
        return testo +' '+ numero;
    }


}
