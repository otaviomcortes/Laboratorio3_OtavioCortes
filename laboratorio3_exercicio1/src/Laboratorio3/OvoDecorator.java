package Laboratorio3;

class OvoDecorator implements Pizza {
    protected Pizza pizza;

    public OvoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Ovo";
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.0;
    }
}
