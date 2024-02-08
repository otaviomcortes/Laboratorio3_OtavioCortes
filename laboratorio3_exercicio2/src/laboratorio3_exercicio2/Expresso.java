package laboratorio3_exercicio2;

class Espresso implements Bebida {
    @Override
    public double calculaCusto() {
        return 1.0;
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}