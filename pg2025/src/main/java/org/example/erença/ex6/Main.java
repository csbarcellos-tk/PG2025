package erença.ex6;

public class Main {
    public static void main(String[] args) {
        Processo processo = new Processo("Intel", "i7-9700K", "3.6GHz");
        Memoria memoria = new Memoria("Corsair", "Vengeance LPX", "3200MHz", "16GB");

        System.out.println(processo.toString());
        System.out.println(memoria.toString());
    }
}
