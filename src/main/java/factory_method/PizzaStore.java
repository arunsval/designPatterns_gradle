package factory_method;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type);

    void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("You just ordered \""+pizza.getName() + "\"");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.delivery();
    }

    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorkPizzaStore();
        nyStore.orderPizza("cheese");
        nyStore.orderPizza("pepperoni");

        PizzaStore detroitStore = new DetroitPizzaStore();
        detroitStore.orderPizza("cheese");
        detroitStore.orderPizza("veggie");

    }
}
