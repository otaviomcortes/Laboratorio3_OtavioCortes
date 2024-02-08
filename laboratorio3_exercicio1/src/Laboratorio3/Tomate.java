package Laboratorio3;

class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomate";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.0;
    }
}