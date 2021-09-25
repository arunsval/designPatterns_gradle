package factory_method;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch(type) {
            case "cheese" : return new NyStyleCheesePizza();
            case "veggie" : return new NyStyleVeggiePizza();
            case "pepperoni" : return new NyStylePepperoniPizza();
            default: return null;
        }
    }
}
