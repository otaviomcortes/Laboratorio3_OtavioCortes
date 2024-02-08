package Laboratorio3;

class MassaEspessaPizza extends PizzaBase {
    @Override
    public String getDescription() {
        return "Pizza de massa espessa";
    }

    @Override
    public double cost() {
        return super.cost() + 5.0;
    }
}
