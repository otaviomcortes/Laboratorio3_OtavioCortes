package laboratorio3_exercicio2;

class Chocolate extends BebidaDecorator {
    public Chocolate(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 0.7;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", Chocolate";
    }
}