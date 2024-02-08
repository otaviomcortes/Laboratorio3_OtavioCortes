package Laboratorio3;

class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Queijo";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.5;
    }
}
