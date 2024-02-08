package Laboratorio3;

class PizzaBase implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
