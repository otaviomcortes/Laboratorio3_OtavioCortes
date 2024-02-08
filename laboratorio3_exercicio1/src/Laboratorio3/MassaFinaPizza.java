package Laboratorio3;

class MassaFinaPizza extends PizzaBase {
    @Override
    public String getDescription() {
        return "Pizza de massa fina";
    }

    @Override
    public double cost() {
        return super.cost() + 3.0;
    }
}