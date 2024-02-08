package laboratorio3_exercicio2;

class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 0.75;
    }

    @Override
    public String getDescricao() {
        return "Descafeinado";
    }
}
