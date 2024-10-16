//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Cachorro cachorro = new Cachorro("Pumba");
        System.out.println("O nome: ");
        System.out.println(cachorro.getNome());
        System.out.println("Ação");
        cachorro.fazerSom();
        cachorro.dormir();
        System.out.println("acoes do carro");
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();

        System.out.println("acoes da moto: ");
        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();