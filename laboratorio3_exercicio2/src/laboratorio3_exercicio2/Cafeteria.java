package laboratorio3_exercicio2;

 public class Cafeteria {
    public static void main(String[] args) {
        Bebida espresso = new Espresso();
        System.out.println("Descrição: " + espresso.getDescricao());
        System.out.println("Custo: $" + espresso.calculaCusto());

        Bebida espressoComLeite = new Leite(new Espresso());
        System.out.println("\nDescrição: " + espressoComLeite.getDescricao());
        System.out.println("Custo: $" + espressoComLeite.calculaCusto());

        Bebida descafeinadoDecorado = new Chocolate(new Canela(new Decaf()));
        System.out.println("\nDescrição: " + descafeinadoDecorado.getDescricao());
        System.out.println("Custo: $" + descafeinadoDecorado.calculaCusto());
    }
}