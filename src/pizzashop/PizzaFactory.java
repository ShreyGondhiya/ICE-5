/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.HashMap;
/**
 * A class that creates different kinds of pizzas
 * depending on their type.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
public class PizzaFactory {
    private HashMap<String, Class<? extends Pizza>> registry = new HashMap<>();

    public PizzaFactory() {
        registerPizza("cheese", CheesePizza.class);
        registerPizza("pepperoni", PepperoniPizza.class);
    }

    public void registerPizza(String type, Class<? extends Pizza> pizzaClass) {
        registry.put(type, pizzaClass);
    }

    public Pizza createPizza(String type) {
        Class<? extends Pizza> pizzaClass = registry.get(type);
        if (pizzaClass != null) {
            try {
                return pizzaClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
