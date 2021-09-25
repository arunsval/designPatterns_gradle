package factory_method;

public class DetroitPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch(type) {
            case "cheese" : return new DetroitStyleCheesePizza();
            case "veggie" : return new DetroitStyleVeggiePizza();
            case "pepperoni" : return new DetroitStylePepperoniPizza();
            default: return null;
        }

    }
}
