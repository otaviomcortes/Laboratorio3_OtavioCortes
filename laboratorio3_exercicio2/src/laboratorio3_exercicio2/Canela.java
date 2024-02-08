package laboratorio3_exercicio2;

class Canela extends BebidaDecorator {
    public Canela(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 0.3;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", Canela";
    }
}