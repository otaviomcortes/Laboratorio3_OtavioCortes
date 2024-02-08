package laboratorio3_exercicio2;

abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }
}