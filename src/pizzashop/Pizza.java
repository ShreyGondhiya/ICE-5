/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author dancye
 */
public class Pizza {
    public int bakeTemp = 100; // temp to bake at
    private ArrayList<String> ingredients = new ArrayList<>();

    public Pizza() {
        addBaseToppings(); // Add default toppings (like "cheese") automatically
    }

    protected void addBaseToppings() {
        addTopping("cheese"); // All pizzas start with cheese
    }

    public void addTopping(String topping) {
        ingredients.add(topping);
    }

    public void bake(int temp) {
        bakeTemp = temp;
        // Baking logic (not implemented)
    }
}
