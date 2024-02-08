package Laboratorio3;

public class Pizzaria {
    public static void main(String[] args) {
        Pizza marguerita= new Queijo(new Tomate(new MassaFinaPizza()));
        System.out.println("Descrição: " + marguerita.getDescription());
        System.out.println("Custo: $" + marguerita.cost());

        Pizza portuguesa = new Queijo(new Tomate(new Queijo(new MassaEspessaPizza())));
        System.out.println("\nDescrição: " + portuguesa.getDescription());
        System.out.println("Custo: $" + portuguesa.cost());
    }
}