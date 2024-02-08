package laboratorio3_exercicio2;

class Leite extends BebidaDecorator {
    public Leite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 0.5;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", Leite";
    }
}
