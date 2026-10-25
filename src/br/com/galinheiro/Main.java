package br.com.galinheiro;

public class Main {
    public static void main(String[] args) {

        Galinheiro granjaOvos = new Galinheiro(
                "Granja ovos",
                30,
                3
        );

        Galinheiro granjaDoisOvos = new Galinheiro(
                "Granja dois Ovos",
                10,
                1
        );
        granjaOvos.mostrarInfo();
        granjaDoisOvos.mostrarInfo();

    }
}
